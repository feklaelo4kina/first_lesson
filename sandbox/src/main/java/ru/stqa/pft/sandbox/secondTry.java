package ru.stqa.pft.sandbox;

public class secondTry {
   public static void main(String[] args) {
      hello("world");
      hello("Kate");
      hello("someone");

      double l = 5;
      System.out.println("Площадь квадрата со стороной " + l + " = " + area(l));

      double a = 8;
      double c = 5;
      System.out.println("Площать прямоугольника со сторонами " + a + " и " + c + " = " + area(a,c) );
   }
   public static void hello(String somebody){

   System.out.println("Hello, " + somebody + "!");
   }
   public static double area(double l){
      return l*l;
   }
   public static double area (double a, double b) {
      return a*b;
   }
}