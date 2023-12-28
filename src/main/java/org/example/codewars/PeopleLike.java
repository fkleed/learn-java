package org.example.codewars;

public class PeopleLike {

    public static String whoLikesIt(String... names) {

        return switch (names.length) {
            case 0 -> "no one likes this";
            case 1 -> names[0] + " likes this";
            case 2 -> names[0] + " and " + names[1] + " like this";
            case 3 -> names[0] + ", " + names[1] + " and " + names[2] + " like this";
            default -> names[0] + ", " + names[1] + " and " + (names.length - 2) + " others like this";
        };
    }

    public static void main(String[] args) {

        String[] names = new String[]{"Alex", "Jacob", "Mark", "Max"};
        System.out.println(
                whoLikesIt(names)
        );

    }
}
