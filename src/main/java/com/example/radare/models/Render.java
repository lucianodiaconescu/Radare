package com.example.radare.models;

public class Render implements Visitor, Decoder{
    @Override
    public void visitMessage(Message message) {
        System.out.print("Date: ");
        System.out.println(message.getDate());
        System.out.print("Message: ");
        System.out.println(message.getMessage());
        System.out.print("House: ");
        System.out.println(message.getHouse());
        System.out.println("");
    }

    @Override
    public void decodeMessage(Message message) {
        String atreidesCode = "Jbppf";
        String harkonnenCode = "Oguuk";
        String basicCode = "Messi";
        String code = message.getMessage();
        if (message.getHouse() == "atreides")
            if (code.contains(atreidesCode))
                System.out.print(basicCode);
        else if (message.getHouse() == "harkonnen")
                if (code.contains(harkonnenCode))
                    System.out.print(basicCode);
    }
}
