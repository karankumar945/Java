// // 9a)

// // Base class
// class Animal {
//     void Sound() {
//         System.out.println("Some generic animal sound");
//     }
// }

// // Subclass Bird
// class Bird extends Animal {
//     @Override
//     void Sound() {
//         System.out.println("Bird says: Chirp Chirp");
//     }
// }

// // Subclass Cat
// class Cat extends Animal {
//     @Override
//     void Sound() {
//         System.out.println("Cat says: Meow Meow");
//     }
// }

// public class exp_9{
//     public static void main(String[] args) {
//         Animal a = new Animal();
//         Bird b = new Bird();
//         Cat c = new Cat();

//         a.Sound(); // Base class method
//         b.Sound(); // Bird overridden method
//         c.Sound(); // Cat overridden method
//     }
// }


// 9b)

// // Base class
// class Bank {
//     double getRateOfInterest() {
//         return 0.0; // default, can be overridden
//     }
// }

// // SBI subclass
// class SBI extends Bank {
//     @Override
//     double getRateOfInterest() {
//         return 8.4;
//     }
// }

// // ICICI subclass
// class ICICI extends Bank {
//     @Override
//     double getRateOfInterest() {
//         return 7.3;
//     }
// }

// // AXIS subclass
// class AXIS extends Bank {
//     @Override
//     double getRateOfInterest() {
//         return 9.7;
//     }
// }

// public class exp_9{
//     public static void main(String[] args) {
//         Bank sbi = new SBI();
//         Bank icici = new ICICI();
//         Bank axis = new AXIS();

//         System.out.println("SBI Interest Rate: " + sbi.getRateOfInterest() + "%");
//         System.out.println("ICICI Interest Rate: " + icici.getRateOfInterest() + "%");
//         System.out.println("AXIS Interest Rate: " + axis.getRateOfInterest() + "%");
//     }
// }


// 9c)

// Base class
// class Vehicle {
//     int speed = 0;

//     void speedUp() {
//         System.out.println("Vehicle speed increased");
//     }
// }

// // Car subclass
// class Car extends Vehicle {
//     @Override
//     void speedUp() {
//         speed += 20; // car accelerates faster
//         System.out.println("Car speed: " + speed + " km/h");
//     }
// }

// // Bicycle subclass
// class Bicycle extends Vehicle {
//     @Override
//     void speedUp() {
//         speed += 5; // bicycle accelerates slower
//         System.out.println("Bicycle speed: " + speed + " km/h");
//     }
// }

// public class exp_9{
//     public static void main(String[] args) {
//         Car car = new Car();
//         Bicycle bike = new Bicycle();

//         car.speedUp(); // Car specific speed increase
//         bike.speedUp(); // Bicycle specific speed increase
//     }
// }
