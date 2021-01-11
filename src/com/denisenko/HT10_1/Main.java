package com.denisenko.HT10_1;

public class Main {

    public static void main(String[] args) {
        String test = "my car is dead";
        String test1 = "bread";
        myMethod(test, test1);
    }

    public static void myMethod(String s1, String s2) throws IllegalArgumentException {
        StringBuilder sOut = new StringBuilder();
        String s1Last = String.valueOf(s1.charAt(s1.length() - 1));
        String s2Last = String.valueOf(s2.charAt(s2.length() - 1));
        if (s1Last.equals(s2Last)) {
            RuntimeException e = new IllegalArgumentException(s1Last);
            System.out.println("last symbols are the same: " + e.getMessage());
            throw e;
        } else {
            System.out.println(sOut.append(s1).append(" - ").append(s2));
        }
    }
}
