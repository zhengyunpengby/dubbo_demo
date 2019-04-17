package com.by.dto;

import java.time.LocalDateTime;

/**
 * @program: dubbo_demo
 * @description:
 * @author:
 * @create: 2019-04-16 10:46
 **/
public class Message {
    private String userId;
    private String title;
    private String content;
    private LocalDateTime intputDateTime;

    public static class Builder{

        private Message message;

        public Builder setUserId(String userId) {
            message.userId = userId;
            return this;
        }

        public Builder setTitle(String title) {
            message.title = title;
            return this;
        }

        public Builder setContent(String content) {
            message.content = content;
            return this;
        }

        public Builder setIntputDateTime(LocalDateTime intputDateTime) {
            message.intputDateTime = intputDateTime;
            return this;
        }

        public Builder() {
        }

    }

    public static Builder optins(){
        return new Builder();
    }

    public Message(String userId, String title, String content, LocalDateTime intputDateTime) {
        this.userId = userId;
        this.title = title;
        this.content = content;
        this.intputDateTime = intputDateTime;
    }

    public Message() {
    }

    public String getUserId() {
        return userId;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public LocalDateTime getIntputDateTime() {
        return intputDateTime;
    }
}
