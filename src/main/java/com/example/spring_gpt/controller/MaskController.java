package com.example.spring_gpt.controller;

import com.example.spring_gpt.reposiyory.MaskRepository;
import com.example.spring_gpt.entity.Mask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@CrossOrigin
@RequestMapping("/mask")
public class MaskController {

    @Autowired
    private MaskRepository maskRepository;

    @GetMapping("/all")
    public @ResponseBody Iterable<Mask> getAllMasks() {
        return maskRepository.findAll();
    }
}
