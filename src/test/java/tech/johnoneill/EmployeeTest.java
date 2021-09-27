package tech.johnoneill;

import static org.junit.Assert.*;
import org.junit.Test;

public class EmployeeTest {
  private Employee EmployeeTest1 = new Employee(1, "John", "Doe", 5000);

  @Test
  public void fullNameReturn() {
    String fullName = EmployeeTest1.getName();
    assertEquals("John Doe", fullName);
  }

  @Test
  public void payRaiseTest() {
    double salary = EmployeeTest1.getMonthlySalary();
    assertEquals(5000.0, salary, 0.01);

    EmployeeTest1.raiseMonthlySalary(20);

    double newSalary = EmployeeTest1.getMonthlySalary();
    assertEquals(6000.0, newSalary, 0.01);
  }
}
