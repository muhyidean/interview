package com.dean.interview.repo;


import com.dean.interview.entity.ShoppingList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoppingListRepo extends CrudRepository<ShoppingList,Integer> {
}
