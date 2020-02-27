package reken;

public class Main {


    public static void main(String[] args) {

        Reken reken = (a, b) -> a * b;

        int result = reken.apply(4, 5);
        System.out.println(result);
    }


    interface Reken {
        int apply(int a, int b);
    }



}
