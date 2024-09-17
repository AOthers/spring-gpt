package com.example.spring_gpt.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import javax.naming.Name;

@Entity
public class ChatMessage {

    @Id
    private String messageId;

    private String user;

    private String avatar;

    @Column(length = 2000)  //字数限制变成2000
    private String content;

    private String time;

    @ManyToOne
    @JoinColumn(name = "mask_id")
    @JsonIgnore
    private Mask mask;

    @ManyToOne
    @JoinColumn(name = "sessionId")
    @JsonIgnore
    private ChatSession session;

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public ChatSession getSession() {
        return session;
    }

    public void setSession(ChatSession session) {
        this.session = session;
    }

    public Mask getMask() {
        return mask;
    }

    public void setMask(Mask mask) {
        this.mask = mask;
    }
}
