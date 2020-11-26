package com.company;

public class EmailSender extends MessageSenderBase {
    @Override
    public void SendMessage(String title, String body, int importance) {
        System.out.println("Email : " + title + "\n" + body + "\nImportance : " + importance + "\n\n");
    }
}
