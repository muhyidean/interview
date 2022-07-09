package com.dean.interview.service.impl;


import com.dean.interview.dto.EventDto;
import com.dean.interview.repo.EventRepo;
import com.dean.interview.service.EventService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


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
        data.forEach((item)->{
            result.add(modelMapper.map(item,EventDto.class));
        });

        return result;
    }
}
