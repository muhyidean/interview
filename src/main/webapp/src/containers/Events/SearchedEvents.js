import axios from "axios";
import React, { useEffect, useState } from "react";
import { useLocation, useParams } from "react-router";
import Event from "../../components/Event/Event";
import { Link } from 'react-router-dom';


export default function SearchedEvents(props) {

    const params = useParams();

    const { state } = useLocation();
    const [eventsState, setEventsState] = useState([]);

    const fetchUser = async () => {
        const { data } = await axios.get('http://localhost:8080/api/v1/events/search/?name=' + state);
        setEventsState(data);
    }

    useEffect(() => {
        fetchUser();
    }, [])

    return (
        <React.Fragment>
            <div>
                <h1>Events that contain: '{state}'</h1>
            </div>

            <div className="Product">

                <div>
                    {
                        eventsState.map((item) => {
                            return <Event
                                id={item.id}
                                key={item.id}
                                name={item.name}
                                startDate={item.startDate}
                                endDate={item.endDate}
                            />
                        })
                    }
                </div>
            </div>
            <div className="Product">
            <Link to="/search"> Back </Link>
            </div>
        </React.Fragment>
    )

}

