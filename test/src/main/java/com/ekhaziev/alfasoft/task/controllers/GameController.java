package com.ekhaziev.alfasoft.task.controllers;

import com.ekhaziev.alfasoft.task.entity.Greeting;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;

@Controller
public class GameController {



//    @MessageMapping("/hello")
//    @SendTo("/topic/greetings")
//    public Greeting base(HelloMessage message) throws Exception {
//        //Thread.sleep(1000); // simulated delay
//        System.out.println("базовый контроллер");
//        return new Greeting("Hello, !");
//    }

    @MessageMapping("/websocket")
    @SendTo("/game/second")
    public Greeting greeting(@RequestHeader String token) throws Exception {
        System.out.println("websocket");
        return new Greeting("???????????");
    }

}
