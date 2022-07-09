package com.dean.interview.service.impl;


import com.dean.interview.dto.EventDto;
import com.dean.interview.dto.ShoppingListDto;
import com.dean.interview.entity.Event;
import com.dean.interview.entity.Item;
import com.dean.interview.entity.ShoppingList;
import com.dean.interview.entity.User;
import com.dean.interview.repo.EventRepo;
import com.dean.interview.service.EventService;
import lombok.AllArgsConstructor;
import org.hibernate.Hibernate;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;


import java.util.ArrayList;
import java.util.List;

@Transactional
@AllArgsConstructor
@Service
public class EventServiceImpl implements EventService<EventDto> {

        private final EventRepo eventRepo;
        private final ModelMapper modelMapper;



    @Override
    public List<EventDto> findAll() {
        var data = eventRepo.findAll();
        var result = new ArrayList<EventDto>();

        List<Event> events = new ArrayList<>();
        data.forEach(events::add);

        for (int i = 0; i < events.size() ; i++) {
            EventDto eventDto = modelMapper.map(events.get(i),EventDto.class);
            var items = events.get(i).getShoppingList().getItems();
            for (int j = 0; j < items.size() ; j++) {
                var tx = items.get(j).getTransactions();
                for (int k = 0; k < tx.size() ; k++) {
                    tx.get(k).isBought();
                    eventDto.getShoppingList().getItems().get(j).setBought(tx.get(k).isBought());
                }
            }
            result.add(eventDto);
        }
        int a = 5;
        return result;
    }

    public List<EventDto> getEvents(String name){
        var events = eventRepo.findEventBy(name);
        var result = new ArrayList<EventDto>();
        events.forEach((item)->{
            result.add(modelMapper.map(item,EventDto.class));
        });
        return result;
    }



}
