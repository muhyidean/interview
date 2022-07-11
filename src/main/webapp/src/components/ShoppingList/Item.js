import React from "react";

export default function Item(props) {
    return (
        <div className="Product">
            <div className="Content">
                <h2 >{props.name}</h2>
                <h2>{props.price}</h2>
                <h4>{props.bought?"bought":"Not bought"}</h4>
            </div>

        </div>
    )
}