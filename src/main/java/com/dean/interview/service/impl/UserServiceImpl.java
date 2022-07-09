package com.dean.interview.service.impl;

import com.dean.interview.dto.EventDto;
import com.dean.interview.dto.UserDto;
import com.dean.interview.entity.Event;
import com.dean.interview.entity.EventUser;
import com.dean.interview.entity.User;
import com.dean.interview.repo.UserRepo;
import com.dean.interview.service.UserService;
import lombok.AllArgsConstructor;
import org.hibernate.Hibernate;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Service
@Transactional
public class UserServiceImpl implements UserService<UserDto> {

    private final UserRepo userRepo;
    private final ModelMapper modelMapper;

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<UserDto> findAll() {
        var data = userRepo.findAll();

        var result = new ArrayList<UserDto>();
        List<User> users = new ArrayList<>();
        data.forEach(users::add);
        for (int i = 0; i < users.size(); i++) {
            UserDto userDto= modelMapper.map(users.get(i), UserDto.class);
            userDto.setEvents(new ArrayList<>());
            var events = users.get(i).getEvents();
            events.forEach(e -> {
                var ee =(Event) Hibernate.unproxy(e.getEvent());
                EventDto eventDto = e.extractEventDto(ee);
                eventDto.setDone(e.isDone());
                userDto.getEvents().add(eventDto);
            });
            result.add(userDto);
        }
        return result;
    }
}
