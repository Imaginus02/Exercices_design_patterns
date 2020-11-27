package com.company;

public class ConcreteHandlerOne extends RequestHandler {
    public void handleRequest(Request request) {
        if (request.getValue() < 0) {
            //if request is eligible handle it
            System.out.println("Negative values are handled by ConcreteHandlerOne:");
            System.out.println("\tConcreteHandlerOne.HandleRequest : " + request.getDescription()
                    + request.getValue());
        } else {
            this.successor.handleRequest(request);
        }
    }
}