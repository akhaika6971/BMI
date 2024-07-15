/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author juls
 */
public class BMICalculator {

    /**
     * Calculates the Body Mass Index (BMI) based on height and weight.
     *
     * @param height the height in centimeters
     * @param weight the weight in kilograms
     * @return the calculated BMI
     */
    public static double calculateBMI(int height, int weight) {
        double heightInMeters = height / 100.0;
        return weight / (heightInMeters * heightInMeters);
    }

    /**
     * Determines the BMI category based on the BMI value.
     *
     * @param bmi the BMI value
     * @return the BMI category as a String
     */
    public static String getBMICategory(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obesity";
        }
    }
}

