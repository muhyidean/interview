package com.dean.interview.service;

import com.dean.interview.dto.MyDto;

public interface UserService <TDto extends MyDto> extends MyService<TDto> {
}
