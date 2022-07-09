package com.dean.interview.service;

import com.dean.interview.dto.MyDto;

import java.util.List;

public interface MyService<TDto extends MyDto> {

    List<TDto> findAll();
}
