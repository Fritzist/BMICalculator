import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        float height; //body height
        float weight; //body weight
        float bmi; //body mass index

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your height in meters (use a , instead of a .): ");
        height = input.nextFloat();

        System.out.println("Enter your weight in kilograms: ");
        weight = input.nextFloat();

        bmi = weight / (height * height);

        System.out.println("Your BMI is: " + bmi);

        if (bmi < 18.5) {
            System.out.println("You are underweight.");
        }
        else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("You are normal weight.");
        }
        else if (bmi >= 25 && bmi < 30) {
            System.out.println("You are overweight.");
        }
        else {
            System.out.println("You are obese.");
        }
    }
}
