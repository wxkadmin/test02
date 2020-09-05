package com.ecit.sbm.web.controller;


import com.ecit.sbm.domain.City;
import com.ecit.sbm.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("/list")
    public String index(Model model){
        List<User> users = new ArrayList<>();
        users.add(new User(1L, "wanxk", 18));
        users.add(new User(2L, "asu", 18));
        model.addAttribute(users);
        return "user/list";
    }

}
