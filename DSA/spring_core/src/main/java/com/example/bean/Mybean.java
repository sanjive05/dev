package com.example.bean;

public class Mybean {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }
    public void showMessage(){
        System.out.println("Message : "+message);
    }

    @Override
    public String toString() {
        return "Mybean{" +
                "message='" + message + '\'' +
                '}';
    }

}
