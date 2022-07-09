package com.dean.interview.repo;


import com.dean.interview.entity.Event;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepo extends CrudRepository<Event,Integer> {

    @Query("select e from Event e where e.shoppingList.items = :name ")
    public List<Event> findEventBy(String name);
}
