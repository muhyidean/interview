import axios from "axios";
import { useEffect, useState, Fragment } from "react";
import { useNavigate, useParams} from "react-router";
import { Link } from 'react-router-dom';
import Item from "./Item";
import './ShoppingList.css';


const ShoppingList = (props) => {
    const params = useParams();

    const [itemDetail, setItemDetail] = useState([{ id: 111, name: "fireworks" }]);
    const id = params.id;

    const fetchEvents = async () => {
        let result = await axios.get('http://localhost:8080/api/v1/events')
        var sl = result.data.filter((elem) => {
            if (elem.id == id) {
                return elem;
            }
        })
        console.log(sl);
        setItemDetail(sl[0].shoppingList.items);
    }

    useEffect(
        () => {
            fetchEvents();
        }, [id])




    const space = <Fragment>&nbsp;&nbsp;</Fragment>;

    let shoppingListDetailsDisplay = null;
    if (params.id) {

        shoppingListDetailsDisplay = (

            <div className="ShoppingDetail">
                <div>
                    Shopping List
                </div>
                {
                    itemDetail.map((e) => {
                        return <Item name={e.name} price={e.price} key={e.id} bought={e.bought}/>
                    })
                }
                {space}
                <Link to="/myEvents"> Back </Link>
            </div>
        );
    }

    return shoppingListDetailsDisplay

}

export default ShoppingList