import axios from "axios";
import React, { useEffect, useState } from "react";
import Event from "../../components/Event/Event";


export default function MyEvents(props){

    const [eventsState, setEventsState] = useState([]);

    const fetchUser = async ()=>{
        const {data} = await axios.get('http://localhost:8080/api/v1/users');
        setEventsState(data[0].events); // Assuming 0 is the logged in user
    }

    useEffect(()=>{
            fetchUser();
    },[])

    return (
        <div className="Product">
            {
                eventsState.map((item)=>{
                    return <Event 
                    id={item.id}
                    key= {item.id} 
                    name={item.name} 
                    startDate={item.startDate}
                    endDate={item.endDate}
                    done ={item.done} />
                })
            }
        </div>
    )

}

