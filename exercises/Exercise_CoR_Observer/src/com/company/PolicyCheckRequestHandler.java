package com.company;

public class PolicyCheckRequestHandler extends AbstractRequestHandler{

    public void handleRequest(WebRequest request) {
        if ((request.getPath().equals("/dashboard") && request.getLoggedUser().isAdmin()) || request.getPath().equals("/home")) {
            super.handleRequest(request);
        } else {
            System.out.println("Status 403 : user is not authorized to access this content");
        }
    }
}
