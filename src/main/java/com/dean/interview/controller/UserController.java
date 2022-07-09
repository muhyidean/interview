package com.dean.interview.controller;

import com.dean.interview.dto.UserDto;
import com.dean.interview.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users")
public class UserController extends  CrudController<UserService, UserDto> {
}
