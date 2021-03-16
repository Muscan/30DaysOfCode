package com.company;
import java.util.*;
/*Task
Given the meal price (base cost of a meal), tip percent (the percentage of the meal price being added
as tip), and tax percent (the percentage of the meal price being added as tax) for a meal,
find and print the meal's total cost.
Round the result to the nearest integer. *///Expand to see the task



public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the meal cost ");
        double meal_cost = in.nextDouble();
        System.out.println("Enter the tip percent");
        int tip_percent = in.nextInt();
        System.out.println("Enter the tax percent");
        int tax_percent = in.nextInt();
        in.close();

        double a = (tip_percent * meal_cost) / 100;
        double b = (tax_percent * meal_cost) / 100;
        double c = meal_cost + a + b;

        int totalCost = (int) Math.round(c);
        System.out.println("The total meal cost " + totalCost + " $");

    }
}


