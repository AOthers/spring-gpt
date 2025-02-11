package com.example.spring_gpt.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class ChatSession {

    @Id
    public String sessionId;

    @OneToOne
    @JoinColumn(name = "maskId", referencedColumnName = "maskId")
    public Mask mask;

    private String title;

    private long lastUpdate;

    @OneToMany(mappedBy = "session", cascade = CascadeType.PERSIST)
    private List<ChatMessage> messages;

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public Mask getMask() {
        return mask;
    }

    public void setMask(Mask mask) {
        this.mask = mask;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<ChatMessage> getMessages() {
        return messages;
    }

    public void setMessages(List<ChatMessage> messages) {
        this.messages = messages;
    }

    public long getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(long lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
