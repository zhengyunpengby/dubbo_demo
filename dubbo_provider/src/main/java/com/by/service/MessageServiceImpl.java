package com.by.service;

import com.by.vo.Message;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: dubbo_demo
 * @description: 服务提供实现
 * @author: by
 * @create: 2019-04-16 11:11
 **/
public class MessageServiceImpl implements MessageService {
    private static List<Message> messageList = new ArrayList<>();

    @Override
    public void inputMessage(Message message) {
        messageList.add(message);
    }

    @Override
    public List<Message> outputMessages() {
        return messageList;
    }
}
