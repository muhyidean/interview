import React from "react";
import './Header.css'
import { Link } from 'react-router-dom';


const Header = () => {

    return (
        <header>
            <nav>
                <ul>
                    <li><Link to="/myEvents"> My Events </Link></li>
                    <li><Link to="/search"> Search Item</Link></li>

                </ul>
            </nav>
        </header>
    );
}


export default Header;