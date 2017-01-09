package com.tutorialspoint;

/**
 * Created by shashank on 27/3/16.
 */
public class HelloWorld {
    private String message1;
    private String message2;

    public void setMessage2(String message2) {
        this.message2 = message2;
    }

    public void setMessage1(String message1) {
        this.message1 = message1;

    }

    public void getMessage1(){
        System.out.println("world message " + message1);
    }

    public void getMessage2(){
        System.out.println("world message " + message2);
    }

    public void init(){
        System.out.println("Bean initializing now");
    }
    public void destroy(){
        System.out.println("Bean Destroying now");
    }
}
