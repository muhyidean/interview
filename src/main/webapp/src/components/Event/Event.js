import { useNavigate } from "react-router";
import moment from 'moment';

const Event = (props) => {

const navigate = useNavigate();

const onClicked = (id)=>{ 
    navigate('/events/' + id);
}



    return (
        <div className="Content"  onClick={()=>{
            onClicked(props.id)
        }}>
            <h3> {props.name}</h3>

            <div className="Field">
                {moment(new Date(props.startDate)).format('YYYY/MM/DD').toString()}<br/> - 
                {moment(new Date(props.endDate)).format('YYYY/MM/DD').toString()}
            </div>

            <div>
                {props.done?"Done":"Not Done"}
            </div>
        </div>
    );
}

export default Event;