package com.Talenta.perpustakaan.controller;

import com.Talenta.perpustakaan.common.RestResult;
import com.Talenta.perpustakaan.entity.User;
import com.Talenta.perpustakaan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("auth")
public class AuthentionController extends BaseController{
    @Autowired
    private UserService service;

    @PreAuthorize("permitAll()")
    @PostMapping(value = "do-login")
    public RestResult doLogin (@RequestBody User user){
        return service.login(user);
    }
    @PreAuthorize("permitAll()")
    @PostMapping(value = "do-register")
    public RestResult doRegister(@RequestBody User param){
        return new RestResult(service.register(param, User.Role.ROLE_USER));
    }
}
