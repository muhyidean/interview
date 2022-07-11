import axios from "axios";
import { useRef } from "react";
import { useNavigate } from "react-router";
import './SearchItem.css';

const SearchItem = (props) => {

    const navigate = useNavigate();
    const itemForm = useRef();

    const searchItemHandler = (e) => {
        e.preventDefault();
        const val = itemForm.current['itemName'].value.toString()
        navigate("/search-events", {state:val});
            
    }
    
    return (
        <div className="SearchItem">
            <form ref={itemForm} onSubmit={searchItemHandler}>
                <h1>Search By Item</h1>

                <label>Item Name</label>
                <input type="text" label={'itemName'} name={'itemName'} />
                
                <button>Search </button>
            </form>

        </div>
    );
}

export default SearchItem;