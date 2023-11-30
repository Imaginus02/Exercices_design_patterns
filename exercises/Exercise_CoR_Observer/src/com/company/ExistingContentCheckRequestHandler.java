package com.company;

import java.util.Objects;

public class ExistingContentCheckRequestHandler extends AbstractRequestHandler{
    public void handleRequest(WebRequest request) {
        if (Objects.equals(request.getPath(), "/dashboard") || Objects.equals(request.getPath(), "/home")) {
            super.handleRequest(request);
        } else {
            System.out.println("Status 404 : Page missing");
        }
    }
}
