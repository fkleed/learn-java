package org.example.codewars;

public class CreditCardMask {
    public static String maskify(String str) {
        return str.length() <= 4 ? str : "#".repeat(str.length()-4).concat(str.substring(str.length()-4));
    }

    public static void main(String[] args) {
        System.out.println(maskify("Skippy"));
    }
}