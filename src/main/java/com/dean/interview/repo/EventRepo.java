package com.dean.interview.repo;


import com.dean.interview.dto.EventDto;
import com.dean.interview.entity.Event;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepo extends CrudRepository<Event,Integer> {

    @Query(value = "SELECT * FROM event\n" +
            "    INNER JOIN shopping_list_items sli on event.shopping_list_id = sli.shopping_list_id\n" +
            "    INNER JOIN item i on sli.items_id = i.id\n" +
            "WHERE\n" +
            "i.name = :name",nativeQuery = true)
    public List<Event> findEventBy(String name);







}
