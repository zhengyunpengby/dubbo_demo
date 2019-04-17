package com.by.service;

import com.by.vo.Message;

import java.util.List;

public interface MessageService {
    void inputMessage(Message message);
    List<Message> outputMessages();
}
