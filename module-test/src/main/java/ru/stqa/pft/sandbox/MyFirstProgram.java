package ru.stqa.pft.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
        String somebody = "world";
        hello ("world!");
        hello ("user");
        hello ("Ekaterina");

        double l = 5;
        System.out.println ("Площадь квадрата со стороной" + l + "=" + area(l));

        double a = 4;
        double b = 6;
        System.out.println ("Площадь прямоугольника со сторонами" + a + "и" + b + "=" + area(a,b));

        System.out.println(2 + 2);
        System.out.println(2 * 3);
        System.out.println(2 + 7);
        System.out.println(3 - 2);
        System.out.println(25 / 5);

        System.out.println(1 / 2);
        System.out.println(1.0 / 2);

        System.out.println("2" + "2");
        System.out.println("2" + 2);

        
    }

    public static void hello (String somebody) {
        System.out.println("Hello," + somebody + "!");
    }

    public static double area (double len) {
        return len * len;
    }

    public static double area (double a, double b) {
        return a * b;
    }
}