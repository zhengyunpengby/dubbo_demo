package com.by.vo;

import java.io.Serializable;

/**
 * @program: dubbo_demo
 * @description: 消息输入输出类
 * @author: by
 * @create: 2019-04-16 10:36
 **/
public class Message implements Serializable{
    private String title;
    private String content;

    public Message(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public Message() {
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
