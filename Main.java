// import java.util.Scanner;

public class Main { // File name = Class name
    public static void main(String[] args) { // yaha se execution start hota hai
        System.out.println("Hello, world!"); // console.log jaisa hi h
        System.out.print("Hello, Rafey!"); // print withoutt new line

        // variable declaration
        String name = "Rafey"; // text
        int age = 25; // whole nummber
        double height = 5.9; // decimal numbers
        boolean isDeveloper = true; // true or false
        char grade = 'A'; // single character

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Is Developer: " + isDeveloper);
        System.out.println("Grade: " + grade);

        int a = 10;
        int b = 5;

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // integer division
        int c = 10;
        int d = 3;
        System.out.println("Integer Division: " + (c / d)); // Output: 3

        // to get decimals
        double result = (double) c / d; // type casting
        System.out.println("Decimal Division: " + result); // Output: 3.3333333333333335

        // assignment operators

        int number = 10;
        number += 5; // number = number + 5
        System.out.println("After += 5: " + number);
        int score = 20;
        score -= 5; // score = score - 5
        System.out.println("After -= 5: " + score);

        // increment and decrement operators
        int count = 1;
        count++; // count = count + 1
        System.out.println("After increment: " + count);
        count--; // count = count - 1
        System.out.println("After decrement: " + count);

        // ++count vs count++
        int x = 5;
        System.out.println("Value of x before increment: " + x);
        System.out.println("Value of x after pre-increment (++x): " + (++x)); // pre-increment
        System.out.println("Value of x after post-increment (x++): " + (x++)); // post-increment
        System.out.println("Value of x after post-increment (x++): " + (x++)); // post-increment

        // comparison operators
        System.out.println(age > 18); // true - checks if age is greater than 18
        System.out.println(age < 18); // false - checks if age is less than 18
        System.out.println(age >= 18); // true - checks if age is greater than or equal to 18
        System.out.println(age <= 18); // false - checks if age is less than or equal to 18
        System.out.println(age == 18); // false - checks if age is equal to 18
        System.out.println(age != 18); // true - checks if age is not equal to 18

        // logical operators
        boolean hasLicense = true;
        System.out.println(hasLicense && age >= 18); // true - both conditons mst be true
        System.out.println(hasLicense || age < 18); // true - at least one condition mst be true

        boolean isLoggedIn = false;
        System.out.println(!isLoggedIn); // true - negates the value of isLogged

        // type casting - ek data to dusre data type me convert karna

        // implicit casting - automatic conversion - small => large data type
        double resultt = number;
        System.out.println("Implicit Casting: " + resultt); // Output: 15.0

        // explicit casting - manual conversion - large => small data type
        double pi = 3.14;
        int intPi = (int) pi; // type casting
        System.out.println("Explicit Casting: " + intPi); // Output: 3
        result = (double) c / d; // type casting
        System.out.println("Decimal Division: " + result); // Output: 3.3333333333333335

        // USER INPUT
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter your name: ");
        // String username = scanner.nextLine(); // read user input string
        // System.out.println("Hello, " + username + "!");
        // System.out.print("Enter your age: ");
        // int userAge = scanner.nextInt(); // read user input integer
        // System.out.println("You are " + userAge + " years old.");
        // System.out.print("Enter your height: ");
        // double userHeight = scanner.nextDouble(); // read user input double
        // System.out.println("You are " + userHeight + " feet tall.");
        // System.out.println("----- Developer Profile -----");
        // System.out.print("Enter your name: ");
        // String devName = scanner.next(); // read user input string
        // System.out.print("Enter your age: ");
        // int devAge = scanner.nextInt(); // read user input integer
        // System.out.print("Enter your city: ");
        // String devCity = scanner.next(); // read user input string
        // System.out.print("Enter your experience: ");
        // double devExperience = scanner.nextDouble(); // read user input double
        // System.out.println("----- Developer Profile -----");
        // System.out.println("Name: " + devName);
        // System.out.println("Age: " + devAge);
        // System.out.println("City: " + devCity);
        // System.out.println("Experience: " + devExperience + " years");
        // double experienceAfterOneYear = devExperience + 1; // increment experience by
        // 1 year
        // System.out.println("Experience after one year: " + experienceAfterOneYear + "
        // years");
        // System.out.print("Enter your name: ");
        // String userName = scanner.nextLine(); // read user input string
        // System.out.print("Enter your basic salary: ");
        // double basicSalary = scanner.nextDouble(); // read user input double
        // System.out.print("Enter your bonus: ");
        // double bonus = scanner.nextDouble(); // read user input double
        // double totalSalary = basicSalary + bonus; // calculate total salary
        // System.out.println("Enter your experience in years: ");
        // double experience = scanner.nextDouble(); // read user input double
        // System.out.println("----- Salary Details -----");
        // System.out.println("Name: " + userName);
        // System.out.println("Experience: " + experience + " years");
        // System.out.println("Basic Salary: " + basicSalary);
        // System.out.println("Bonus: " + bonus);
        // System.out.println("Total Salary: " + totalSalary);
        // double salaryAfterIncrement = totalSalary + (totalSalary * 0.10); // increment salary by 10%
        // System.out.println("Salary after 10% increment: " + salaryAfterIncrement);
        // scanner.close();
    }
}