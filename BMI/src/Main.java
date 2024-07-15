/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<User> userArray = new ArrayList<>();
        LinkedList<User> userLinkedList = new LinkedList<>();
        Stack<User> userStack = new Stack<>();
        Queue<User> userQueue = new LinkedList<>();

        System.out.println("Enter number of users: ");
        int numberOfUsers = scanner.nextInt();

        for (int i = 0; i < numberOfUsers; i++) {
            System.out.println("Enter details for user " + (i + 1) + ": ");
            System.out.print("Age: ");
            int age = scanner.nextInt();
            System.out.print("Height (in cm): ");
            int height = scanner.nextInt();
            System.out.print("Weight (in kg): ");
            int weight = scanner.nextInt();

            User user = new User(i + 1, age, height, weight);
            
            // Add user to different data structures
            userArray.add(user);
            userLinkedList.add(user);
            userStack.push(user);
            userQueue.add(user);
        }

        // calculation using array
        System.out.println("\nBMI Calculation using Array:");
        for (User user : userArray) {
            double bmi = BMICalculator.calculateBMI(user.getUserHeight(), user.getUserWeight());
            String category = BMICalculator.getBMICategory(bmi);
            System.out.println( "  BMI: " + bmi + " - Category: " + category);
        }

        // calculation using  linked list
        System.out.println("\nBMI Calculation using LinkedList:");
        for (User user : userLinkedList) {
            double bmi = BMICalculator.calculateBMI(user.getUserHeight(), user.getUserWeight());
            String category = BMICalculator.getBMICategory(bmi);
            System.out.println( "  BMI: " + bmi + " - Category: " + category);
        }

        //  calculation using  stack
        System.out.println("\nBMI Calculation using Stack:");
        while (!userStack.isEmpty()) {
            User user = userStack.pop();
            double bmi = BMICalculator.calculateBMI(user.getUserHeight(), user.getUserWeight());
            String category = BMICalculator.getBMICategory(bmi);
            System.out.println(" BMI: " + bmi + " - Category: " + category);
        }

        // calculation using queue
        System.out.println("\nBMI Calculation using Queue:");
        while (!userQueue.isEmpty()) {
            User user = userQueue.poll();
            double bmi = BMICalculator.calculateBMI(user.getUserHeight(), user.getUserWeight());
            String category = BMICalculator.getBMICategory(bmi);
            System.out.println( "  BMI: " + bmi + " - Category: " + category);
        }

        scanner.close();
    }
}
