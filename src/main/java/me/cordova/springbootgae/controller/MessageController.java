package me.cordova.springbootgae.controller;

import me.cordova.springbootgae.repositories.MessageRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MessageController {

    private MessageRepository messageRepository;

    public MessageController(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    @RequestMapping("/")
    public String HelloWorld (Model model){
        model.addAttribute("message", "Hello from Thymeleaf!");

        return "index";
    }

    @RequestMapping("/messages")
    public String getMessages(Model model){
        model.addAttribute("messages", messageRepository.findAll());
        return "messages";
    }
}
