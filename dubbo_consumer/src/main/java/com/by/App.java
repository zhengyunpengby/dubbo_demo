package com.by;

import com.by.service.MessageService;
import com.by.vo.Message;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:springmvc.xml"});

        context.start();
        MessageService demoService = (MessageService) context.getBean("helloService");

        Message message = new Message("世纪东方", "谁激动丹佛斯点击发送的高难度了咖啡");
        demoService.inputMessage(message);
        demoService.outputMessages().forEach(m -> {
            Message msg = (Message) m;
            System.out.println(m);
        });
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
