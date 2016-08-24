package com.tdd;

/**
 * Created by Administrator on 2016/8/24.
 */
public class HelloWorld {
    private String message;

    public void getMessage() {
        System.out.println("Your Message is :"+message);
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
