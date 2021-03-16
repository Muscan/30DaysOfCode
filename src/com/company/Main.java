package com.company;
import java.util.*;
/*Task
Complete the code in the editor below. Need to:

    1. Declare 3 variables: one of type int, one of type double, and one of type String.
    2. Read 3 lines of input from stdin and initialize your variables.
    3. Use the + operator to perform the following operations:

    a. Print the sum of "i" plus your int variable on a new line.
    b. Print the sum of "d" plus your double variable to a scale of one decimal place on a new line.
    c. Concatenate "s" with the string you read as input and print the result on a new line. *///Expand to see the task



public class Main {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "Hello OOP ";

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        double b = scan.nextDouble();
        scan.nextLine();
        String c = scan.nextLine();

        a += i;
        b += d;
        s += c;
        System.out.println(a);
        System.out.println(b);
        System.out.println(s);

        scan.close();

    }
}

