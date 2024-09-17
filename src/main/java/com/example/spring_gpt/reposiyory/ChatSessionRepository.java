package com.example.spring_gpt.reposiyory;

import com.example.spring_gpt.entity.ChatSession;
import org.springframework.data.repository.CrudRepository;

public interface ChatSessionRepository extends CrudRepository<ChatSession, String> {
}
