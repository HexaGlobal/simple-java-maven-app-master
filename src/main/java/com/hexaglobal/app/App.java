package com.hexaglobal.app;

/**
 * Hello world!
 */
public class App
{

    private final String message = "Welcome to Hexa Global";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
