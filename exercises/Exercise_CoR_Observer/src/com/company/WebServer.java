package com.company;

import java.util.ArrayList;

public class WebServer implements WebRequestObservable {
    AbstractRequestHandler h;

    private ArrayList<WebRequestObserver> observers = new ArrayList<>();

    public WebServer(AbstractRequestHandler h) {
        this.h = h;
    }
    public void getRequest(WebRequest request) {
        h.handleRequest(request);
        notifyObservers(request);
    }

    @Override
    public void attach(WebRequestObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void detach(WebRequestObserver observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers(WebRequest webRequest) {
        for (WebRequestObserver observer : observers) {
            observer.update(webRequest);
        }
    }
}
