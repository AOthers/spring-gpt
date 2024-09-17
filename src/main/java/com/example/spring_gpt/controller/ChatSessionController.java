package com.example.spring_gpt.controller;

import com.example.spring_gpt.entity.ChatSession;
import com.example.spring_gpt.entity.Mask;
import com.example.spring_gpt.reposiyory.ChatSessionRepository;
import com.example.spring_gpt.reposiyory.MaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@CrossOrigin
@RequestMapping("/session")
public class ChatSessionController {

    @Autowired
    private ChatSessionRepository sessionRepository;

    @GetMapping("/get")  //session/get
    public @ResponseBody ChatSession getSessionById(@RequestParam String id) {
        Optional<ChatSession> session = sessionRepository.findById(id);
        if (session.isPresent()) {
            return session.get();
        } else {
            return null;
        }
    }
}
