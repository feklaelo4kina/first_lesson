package ru.stqa.pft.sandbox;

import java.awt.*;

public class MyFirst {

   public static void main(String[] args) {
      hello("world");
      hello("Kate");
      hello("someone");


      Square s = new Square(8);
      System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

      Rectangle r = new Rectangle(4, 6);
      System.out.println("Площать прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());

      Point p1 = new Point(12.2, 15.0);
      Point p2 = new Point(10, 12.0);
      System.out.println("Расстояние между точками = " + Point.distance(p1,p2));


   }

   public static void hello(String somebody) {

      System.out.println("Hello, " + somebody + "!");
   }




}