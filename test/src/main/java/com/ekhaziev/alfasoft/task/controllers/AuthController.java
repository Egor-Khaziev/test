package com.ekhaziev.alfasoft.task.controllers;

import com.ekhaziev.alfasoft.task.entity.Request;
import com.ekhaziev.alfasoft.task.entity.User;
import com.ekhaziev.alfasoft.task.services.GameService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class AuthController {

    private final GameService gameService;

    @PostMapping("/login")
    public Request login (@RequestBody User user) throws Exception {
        return gameService.tryToLogIn(user);
    }
}
