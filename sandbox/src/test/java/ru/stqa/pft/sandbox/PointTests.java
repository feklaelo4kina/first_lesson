package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.sandbox.Point;
import ru.stqa.pft.sandbox.Rectangle;

public class PointTests {
   @Test

   public void testPoint() {
      Point p1 = new Point(7, 5);
      Point p2 = new Point(3, 2);
      Assert.assertEquals(Point.distance(p1, p2), 5.0);


   }
@Test
   public void testPoint1() {
      Point p1 = new Point(7, 5);
      Point p2 = new Point(3, 2);
      Assert.assertEquals(Point.distance(p1, p2), 5);
   }
   @Test
   public void testPoint2() {
      Point p1 = new Point(7, 5);
      Point p2 = new Point(3, 2);
      Assert.assertEquals(Point.distance(p1, p2), 6.0);
   }
   @Test
   public void testRectangle(){
      Rectangle a = new Rectangle(4,5);
      Assert.assertEquals(a.area(), 20.0);
   }
}