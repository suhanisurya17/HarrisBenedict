package codingAssignment1;
// Program Title: Harris Benedict Assignment - ICS3U Unit 2: Coding Assignment #1
// Program Description: This program uses the Harris Benedict Equation to calculate the Basal Metabolic Rate of the user based on their height, weight and age. The Basal Metabolic Rate is approximate amount of calories your body can consume to maintain the same weight without exercise. It also outputs how many calories a man and woman should consume in each meal sitting according to their BMR.
// Name: Suhani Surya
// Date: March 21st - March 22nd, 2023


import java.util.Scanner; //Here I am importing the Scanner class from the java utilities package


public class HarrisBenedictAssignment
    //The is the class header
{
    //Main Method
    public static void main(String[] args) //This is the main method that specifies this is public. This is called the method header.
    {
        //New Scanner Class
        Scanner keyboard = new Scanner(System.in); //The new scanner called "keyboard" is being initialized. It gets typed input from the User in the console


        //Variable Declaration
        double weight, height; //Here are 2 double variables that are the height and weight of the user. I chose the double data type because it offers more variety in the type of data it can store. Not everyone will be a exactly to the pound or to the inch measurement, so this is important to keep in mind. Getting this information from the user is key to the final BMR result
        int age, numOfMeals; // Age and meals are integers because they are a solid number that does require decimal places. It is uncommon to say you had 1.5 meals or you are 14.75 years old. The age is important within the HarrisBenedictAssignment and the number of meals is important to how many calories one should consume in each of their meals to reach the BMR
        double bmrFemale, bmrMale, eachMealFemale, eachMealMale; //These are all double variables that are the bmr for male and female. The "eachMealFemale" and "eachMealMale" pertains to how many calories per meal they need to consume


        //Introduce the program to the user
        System.out.println("This program will calculate the BMR for a person with a specific weight, height, and age.");
        System.out.println("The program will also display the amount of calories that should be consumed at each \nmeal sitting, based on the numbers of meals entered.\n"); //These two lines offer the user insight as to what the program is and what it is trying to achieve


        //Get the user's weight
        System.out.print("Please enter the weight (in pounds): "); //Using the console to get input on the user's weight
        weight = keyboard.nextDouble();


        //Get the user's height
        System.out.print("Please enter the height (in inches): "); //Using the console to get input on the user's height
        height = keyboard.nextDouble();


        //Get the user's age in years
        System.out.print("Please enter the age (in years): "); //Using the console to get input on the user's age in years
        age = keyboard.nextInt();


        //Get how many meals the user plans to eat in a day
        System.out.print("Please enter how many meals you plan to eat daily: "); //Using the console to get input on the user's number of meals they plan to eat
        numOfMeals = keyboard.nextInt();


        //Calculate the BMR of a female
        bmrFemale = 655 + (4.3 * weight) + (4.7 * height) - (4.7 * age); //This is the formula for the bmr of a female. Embedded inside are the variables for the user's height, weight and age so they can perform calculations according to their specific information.


        //Calculate the number of calories per meal for a female
        eachMealFemale = bmrFemale / numOfMeals; //This statement is dividing the BMR by the number of meals the user plans to eat so they can evenly distribute their calorie intake if they are female


        //Calculate the BMR of a male
        bmrMale = 66 + (6.3 * weight) + (12.9 * height) - (6.8 * age); //This is the formula for the bmr of a male. Embedded inside are the variables for the user's height, weight and age so they can perform calculations according to their specific information.


        //Calculate the number of calories per meal for a male
        eachMealMale = bmrMale / numOfMeals; //This statement is dividing the BMR by the number of meals the user plans to eat so they can evenly distribute their calorie intake if they are male


        //Print BMR for males and females and the maximum calories eaten per each meal for males and females
        System.out.println("\nThe BMR for a woman is " + bmrFemale); //This statement prints out the BMR for a female
        System.out.println("The woman should eat a maximum of " + eachMealFemale + " calories at each meal."); //This statement prints out the number of calories that should be eaten for each meal
        System.out.println("The BMR for a man is " + bmrMale); //This statement prints out the BMR for a male
        System.out.println("The man should eat a maximum of " + eachMealMale + " calories at each meal."); //This statement prints out the number of calories that should be eaten for each meal


        keyboard.close(); //This statement closes the keyboard to not waste memory and space
    }
}
