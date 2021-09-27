package tech.johnoneill;

public class Employee {
  private int id;
  private String firstName;
  private String lastName;
  private double monthlySalary;

  Employee(int id, String firstName, String lastName, double salary) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.monthlySalary = salary;
  }

  public int getID() {
    return this.id;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public String getName() {
    return (this.firstName + " " + this.lastName);
  }

  public double getMonthlySalary() {
    return this.monthlySalary;
  }

  public void setMonthlySalary(double newMonthlySalary) {
    this.monthlySalary = newMonthlySalary;
  }

  public double getAnnualSalary() {
    return this.monthlySalary * 12;
  }

  public void raiseMonthlySalary(double raise) {
    this.monthlySalary = this.monthlySalary * (1 + raise / 100);
  }

  public String toString() {
    return ("Employee Name: " + this.getName() + " (ID: " + this.id + ")\nMonthly Salary: $"
        + String.format("%.2f", this.monthlySalary));
  }
}
