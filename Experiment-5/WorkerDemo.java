package experiment4;

//Base class Worker
abstract class Worker {
 String name;
 double salaryRate;
 
 Worker(String name, double salaryRate) {
     this.name = name;
     this.salaryRate = salaryRate;
 }
 
 abstract double computePay(int hours);
 
 void displayDetails(int hours) {
     System.out.println("Worker: " + name + ", Weekly Pay: " + computePay(hours));
 }
}

//DailyWorker subclass
class DailyWorker extends Worker {
 DailyWorker(String name, double salaryRate) {
     super(name, salaryRate);
 }
 
 @Override
 double computePay(int hours) {
     int daysWorked = hours / 8; // Assuming 8 hours per day
     return daysWorked * salaryRate;
 }
}

//SalariedWorker subclass
class SalariedWorker extends Worker {
 SalariedWorker(String name, double salaryRate) {
     super(name, salaryRate);
 }
 
 @Override
 double computePay(int hours) {
     return 40 * salaryRate; // Fixed for 40 hours per week
 }
}

//Main class to test worker salary calculations
public class WorkerDemo {
 public static void main(String[] args) {
     Worker w1 = new DailyWorker("John", 100);
     Worker w2 = new SalariedWorker("Alice", 50);
     
     w1.displayDetails(48); // Example: 48 hours worked
     System.out.println();
     w2.displayDetails(50); // Example: 50 hours worked, but fixed pay
 }
}