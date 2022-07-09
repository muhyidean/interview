package com.dean.interview.controller;

import com.dean.interview.dto.MyDto;
import com.dean.interview.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin
public abstract class CrudController<TService extends MyService, TDto extends MyDto> {

    @Autowired
    private TService service;

    @GetMapping
    public List<TDto> findAll(){
        return service.findAll();
    }

}
