package com.xworkz.override.internal;

public class WebApplication extends Application{
    public WebApplication() {
        System.out.println("WebApplication: Constructor is running");
    }

    @Override
    public void launch() {
        System.out.println("WebApplication: Launching through a browser");
    }

    public void loadPage() {
        System.out.println("WebApplication: Loading web page content");
    }

    public void handleRequest() {
        System.out.println("WebApplication: Handling HTTP request");
    }
}
