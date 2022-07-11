


import { Route, Routes, Navigate } from "react-router";
import SearchItem from "../../components/Search/SearchItem";
import ShoppingList from "../../components/ShoppingList/ShoppingList";
import MyEvents from "../Events/MyEvents";
import SearchedEvents from "../Events/SearchedEvents";

export default function PageRoutes(props) {
    return (
        <Routes>
            <Route path="/" element={<Navigate replace to="/myEvents" />} />
            <Route path="/events/:id" element={<ShoppingList />}/>    
            <Route path="search" element={<SearchItem/>} />
            <Route path="/myEvents" element={<MyEvents/>} />
            <Route path="/search-events" element={<SearchedEvents/>} />
            
        </Routes>
    );
}