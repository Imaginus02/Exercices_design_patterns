package com.goodExample.sender;

public class WebServiceSender extends AbstractMessageSender {
    @Override
    public void sendMessage(String title, String body, int importance) {
        System.out.println("WebService : " + title + "\n" + body + "\nImportance : " + importance + "\n\n");
    }
}
