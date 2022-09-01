package com.hipscout.helloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.lang.model.element.Name;

@RestController
@RequestMapping("/api")
public class HelloWorldController {

    @GetMapping("/hello")
    public Message helloWorld() {
        Message m = new Message();
        m.setName("Yes");
        m.setMsg("Hello World");
        m.setCount(1000);
        return m;
    }

    @GetMapping("/string")
    public String helloWorldAsString() {
        Message n = new Message("This is a Message", "Deb", 22);
        return n.toString();

    }



}
class Message{

    private String msg;
    private int count;
    private String name;


    public Message() {
       this.msg = "";
       this.name = "";
       this.count = 0;

    }


    public Message(String msg, String name, int count){
        this.msg = msg;
        this.name = name;
        this.count = count;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    public String getName() {
        return name;
    }

    public String getMsg() {
        return msg;
    }

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{ ");
        stringBuilder.append("msg: " + this.msg);
        stringBuilder.append(", ");
        stringBuilder.append("name: " + this.name);
        stringBuilder.append(", ");
        stringBuilder.append("count: " + this.count);
        stringBuilder.append(" }");

        return stringBuilder.toString();
    }
}
