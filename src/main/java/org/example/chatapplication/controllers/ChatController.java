package org.example.chatapplication.controllers;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

    @MessageMapping("/user1")
    @SendTo("/simple/publish2")
    public String publishMessage1(String message)
    {
        return message;
    }

    @MessageMapping("/user2")
    @SendTo("/simple/publish1")
    public String publishMessage2(String message)
    {
        return message;
    }
}
