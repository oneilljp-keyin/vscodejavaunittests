package tech.johnoneill;

public class Rectangle {
  private float length;
  private float width;

  Rectangle() {
    length = 1.0f;
    width = 1.0f;
  }

  Rectangle(float l, float w) {
    this.length = l;
    this.width = w;
  }

  public void setLength(float l) {
    this.length = l;
  }

  public void setWidth(float w) {
    this.width = w;
  }

  public float getLength() {
    return length;
  }

  public float getWidth() {
    return width;
  }

  public float getArea() {
    return (length * width);
  }

  public float getPerimeter() {
    return (length + width) * 2;
  }
}
