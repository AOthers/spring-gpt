package com.example.spring_gpt.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Mask {

    @Id
    //用于指定实体类中主键字段的生成策略,AUTO指由JPA提供者自动选择最合适的自增策略
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long maskId;

    private String avatar; //头像链接

    private String name;

    private String hint; //预设词

    @OneToMany(mappedBy = "mask", cascade = CascadeType.PERSIST)
    private List<ChatMessage> context;

    public Long getMaskId() {
        return maskId;
    }

    public void setMaskId(Long maskId) {
        this.maskId = maskId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }

    public List<ChatMessage> getContext() {
        return context;
    }

    public void setContext(List<ChatMessage> context) {
        this.context = context;
    }
}
