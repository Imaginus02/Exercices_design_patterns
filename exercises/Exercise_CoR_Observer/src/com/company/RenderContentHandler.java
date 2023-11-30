package com.company;

public class RenderContentHandler extends AbstractRequestHandler {
    public void handleRequest(WebRequest request) {
        if (request.getPath().equals("/dashboard")) {
            System.out.println("Status 200 : Dashboard content here");
        } else {
            System.out.println("Status 200 : Home content here");
        }
    }
}
