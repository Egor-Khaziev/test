package com.ekhaziev.alfasoft.task.controllers;


import com.ekhaziev.alfasoft.task.entity.User;
import com.ekhaziev.alfasoft.task.services.GameService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@Slf4j
@RequiredArgsConstructor
public class GameController {

    private final GameService gameService;

    @MessageMapping("/login")
    @PostMapping("/login")
    @SendTo("/test")
    public String verify(@RequestBody  @NotNull User user) throws Exception {
        log.warn(user.getUsername());
        log.warn(user.getPassword());
        return gameService.tryToLogIn(user);
    }

}
