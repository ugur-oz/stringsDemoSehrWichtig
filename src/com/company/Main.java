package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        String message = "Heute ist das Wetter sehr schön.";
        System.out.println(message);
        System.out.println("Number of elements are" + " " + message.length());
        System.out.println("6th element is" + " " + message.charAt(6));
        System.out.println(message.concat(" Das freut mich."));
        System.out.println(message.startsWith("B"));
        System.out.println(message.endsWith("."));
        System.out.println(message.indexOf('a'));
        System.out.println(message.indexOf("er"));
        System.out.println(message.lastIndexOf("a"));
        System.out.println("--------------------------");
        String newmessage = message.replace(' ','-');
        System.out.println(newmessage);
        System.out.println(message.substring(6,10));
        for(String word:message.split(" ")){
            System.out.println(word);
        }
        System.out.println(message.toLowerCase(Locale.ROOT));
        System.out.println(message.toUpperCase(Locale.ROOT));
        System.out.println(message.trim());//entfernt spaces

    }
}
