import React from "react";
import Header from "../Header/Header";
import PageRoutes from "../PageRoutes/PageRoutes";


const Dashboard = () => {


    return (
        <React.Fragment>
            <div className='header'>
               <Header/>
            </div>
            <div className="Product">
                <PageRoutes/>
            </div>
        </React.Fragment>
    );

}

export default Dashboard;