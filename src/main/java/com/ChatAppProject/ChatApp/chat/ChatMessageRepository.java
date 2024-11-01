package com.ChatAppProject.ChatApp.chat;

import com.ChatAppProject.ChatApp.chatroom.ChatRoom;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ChatMessageRepository extends MongoRepository<ChatMessage, String>
{
    List<ChatMessage> findByChatId(String id);
}
