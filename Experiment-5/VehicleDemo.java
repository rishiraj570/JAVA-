
package experiment4;
//Base class Vehicle
class Vehicle {
String brand, model;
double price;

Vehicle(String brand, String model, double price) {
   this.brand = brand;
   this.model = model;
   this.price = price;
}

void displayDetails() {
   System.out.println("Brand: " + brand + ", Model: " + model + ", Price: " + price);
}
}

//Car class extending Vehicle
class Car extends Vehicle {
int seatingCapacity;
String fuelType;

Car(String brand, String model, double price, int seatingCapacity, String fuelType) {
   super(brand, model, price);
   this.seatingCapacity = seatingCapacity;
   this.fuelType = fuelType;
}

@Override
void displayDetails() {
   super.displayDetails();
   System.out.println("Seating Capacity: " + seatingCapacity + ", Fuel Type: " + fuelType);
}
}

//ElectricCar class extending Car
class ElectricCar extends Car {
int batteryCapacity;
double chargingTime;

ElectricCar(String brand, String model, double price, int seatingCapacity, String fuelType, int batteryCapacity, double chargingTime) {
   super(brand, model, price, seatingCapacity, fuelType);
   this.batteryCapacity = batteryCapacity;
   this.chargingTime = chargingTime;
}

@Override
void displayDetails() {
   super.displayDetails();
   System.out.println("Battery Capacity: " + batteryCapacity + " kWh, Charging Time: " + chargingTime + " hours");
}
}

//Motorcycle class extending Vehicle
class Motorcycle extends Vehicle {
int engineCapacity;
String type;

Motorcycle(String brand, String model, double price, int engineCapacity, String type) {
   super(brand, model, price);
   this.engineCapacity = engineCapacity;
   this.type = type;
}

@Override
void displayDetails() {
   super.displayDetails();
   System.out.println("Engine Capacity: " + engineCapacity + " cc, Type: " + type);
}
}

//Main class to test polymorphism
public class VehicleDemo {
public static void main(String[] args) {
   Vehicle v1 = new Car("Toyota", "Camry", 30000, 5, "Petrol");
   Vehicle v2 = new ElectricCar("Tesla", "Model S", 80000, 5, "Electric", 100, 1.5);
   Vehicle v3 = new Motorcycle("Yamaha", "R1", 20000, 1000, "Sport");
   
   v1.displayDetails();
   System.out.println();
   v2.displayDetails();
   System.out.println();
   v3.displayDetails();
}
}