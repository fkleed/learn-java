package org.example.codewars;

public class SquareDigit {

    public int squareDigits(int n) {
        String tmp = Integer.toString(n);
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < tmp.length(); i++) {
            res.append((int) Math.pow(Integer.parseInt(tmp.substring(i, i + 1)), 2));
        }

        return Integer.parseInt(res.toString());
    }

    public static void main(String[] args) {
        SquareDigit sd = new SquareDigit();

        System.out.println(sd.squareDigits(0  ));
    }

}
