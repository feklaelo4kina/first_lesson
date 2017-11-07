package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.sandbox.Point;

//проверка на несоответствие типа числа
public class PointFailTest {
   @Test
   public void testFailPoint(){
      Point w = new Point(7,5);
      Point e = new Point(3,2);
      Assert.assertEquals(Point.distance(w,e), 5);

   }

}
