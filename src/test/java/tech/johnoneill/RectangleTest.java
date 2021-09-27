package tech.johnoneill;

import static org.junit.Assert.*;
import org.junit.Test;

public class RectangleTest {
  Rectangle R1 = new Rectangle(3.5f, 2.7f);
  Rectangle R2 = new Rectangle(1.1f, 4.6f);

  @Test
  public void perimiterTest() {
    float R1Perimeter = R1.getPerimeter();
    assertEquals((3.5 + 2.7) * 2, R1Perimeter, 0.1);
    float R2Perimeter = R2.getPerimeter();
    assertEquals((1.1 + 4.6) * 2, R2Perimeter, 0.1);
  }

  @Test
  public void areaTest() {
    float R1Area = R1.getArea();
    assertEquals((3.5 * 2.7), R1Area, 0.1);
    float R2Area = R2.getArea();
    assertEquals((1.1 * 4.6), R2Area, 0.1);
  }

  @Test
  public void verifyChangeInLengthAndWidth() {
    R1.setLength(5.1f);
    R1.setWidth(4.4f);
    float R1Length = R1.getLength();
    assertEquals(5.1, R1Length, 0.1);
    float R1Width = R1.getWidth();
    assertEquals(4.4, R1Width, 0.1);
    float R1Perimeter = R1.getPerimeter();
    assertEquals((5.1 + 4.4) * 2, R1Perimeter, 0.1);
    float R1Area = R1.getArea();
    assertEquals((5.1 * 4.4), R1Area, 0.1);

  }
}
