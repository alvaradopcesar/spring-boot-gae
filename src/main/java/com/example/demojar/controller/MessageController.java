package com.example.demojar.controller;

import com.example.demojar.repositories.MessageRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MessageController {

    private MessageRepository messageRepository;

    public MessageController(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    @RequestMapping("/messages")
    public String getMessages(Model model){
        model.addAttribute("messages", messageRepository.findAll());
        return "messages";
    }
}
