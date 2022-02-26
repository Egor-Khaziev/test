package com.ekhaziev.alfasoft.task.controllers;

import com.ekhaziev.alfasoft.task.entity.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class GreetingController {


    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Message greeting(Message message) throws Exception {
        String test = HtmlUtils.htmlEscape(message.toString());
        return new Message("Hello, test !");
    }

}
