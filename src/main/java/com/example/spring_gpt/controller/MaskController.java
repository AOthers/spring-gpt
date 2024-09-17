package com.example.spring_gpt.controller;

import com.example.spring_gpt.entity.ChatMessage;
import com.example.spring_gpt.reposiyory.MaskRepository;
import com.example.spring_gpt.entity.Mask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin
@RequestMapping("/mask")
public class MaskController {

    @Autowired
    private MaskRepository maskRepository;

    @PostMapping(path = "/add_all")
    //@ResponseBody：表示方法的返回值将被直接序列化为HTTP响应的正文，通常是一个JSON对象或字符串。
    //@RequestBody List<Mask> maskList：表示方法期望接收一个JSON格式的字符串，并且将其转换为List<Mask>对象。
    public @ResponseBody String addAllMasks (@RequestBody List<Mask> maskList) {
        //遍历maskList中的每一个Mask对象。
        for (Mask mask : maskList) {
            //为每一个chatMessage对象设置mask属性，使其关联到当前的mask对象。
            for (ChatMessage chatMessage : mask.getContext()) {
                chatMessage.setMask(mask);
            }
        }
        maskRepository.saveAll(maskList);
        return "Saved";
    }

    @GetMapping("/all")
    public @ResponseBody Iterable<Mask> getAllMasks() {
        return maskRepository.findAll();
    }
}
