package com.ekhaziev.alfasoft.task.entity;

import lombok.Data;

@Data
public class Message {

    private String from;
    private String message;

    public Message(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Message [from=" + from + ", message=" + message + "]";
    }


}
