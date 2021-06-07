/*
 *  UCF COP3330 Summer 2021 Assignment 10 Solution
 *  Copyright 2021 Julian Espinoza
 *
 *  Exercise 10 - Self-Checkout
 *  Create a simple self-checkout system. Prompt for the prices and quantities of three items. Calculate the subtotal of the items. Then calculate the tax using a tax rate of 5.5%. Print out the line items with the quantity
 *  and total, and then print out the subtotal, tax amount, and total.
 *
 *  Constraint:
 *  Keep the input, processing, and output parts of your program separate. Collect the input, then do the math operations and string building, and then print out the output.
 *  Be sure you explicitly convert input to numerical data before doing any calculations.
 *
 */

package ex10;
import java.util.Scanner;

public class base {
    static Scanner userInput = new Scanner(System.in);

    public static void main(String [] args)
    {
        base myBase = new base();
        double itemOne, itemTwo, itemThree;
        int quanOne, quanTwo, quanThree;
        double subtotal, calcTax, total;
        double tax = 0.055;

        itemOne = myBase.itemOne();
        quanOne = myBase.quanOne();

        itemTwo = myBase.itemTwo();
        quanTwo = myBase.quanTwo();

        itemThree = myBase.itemThree();
        quanThree = myBase.quanThree();

        subtotal = myBase.calcSub(itemOne, itemTwo, itemThree, quanOne, quanTwo, quanThree);
        System.out.printf("Subtotal: $%.2f%n", subtotal);

        calcTax = myBase.calcTax(subtotal, tax);
        System.out.printf("Tax: $%.2f%n", calcTax);

        total = myBase.calcTotal(subtotal, calcTax);
        System.out.printf("Total: $%.2f", total);
    }

    public double calcSub(double itemOne, double itemTwo, double itemThree, int quanOne, int quanTwo, int quanThree)
    {
        return (itemOne*quanOne) + (itemTwo*quanTwo) + (itemThree * quanThree);

    }

    public double calcTax(double subtotal, double tax)
    {
        return subtotal * tax;
    }

    public double calcTotal(double subtotal, double calcTax)
    {
        return subtotal + calcTax;
    }

    public double itemOne()
    {
        double item;
        System.out.printf("Enter the price of item 1: ");
        item = userInput.nextDouble();
        return item;
    }

    public double itemTwo()
    {
        double item;
        System.out.printf("Enter the price of item 2: ");
        item = userInput.nextDouble();
        return item;
    }

    public double itemThree()
    {
        double item;
        System.out.printf("Enter the price of item 3: ");
        item = userInput.nextDouble();
        return item;
    }

    public int quanOne()
    {
        int quan;
        System.out.printf("Enter the quantity of item 1: ");
        quan = userInput.nextInt();
        return quan;
    }

    public int quanTwo()
    {
        int quan;
        System.out.printf("Enter the quantity of item 2: ");
        quan = userInput.nextInt();
        return quan;
    }
    public int quanThree()
    {
        int quan;
        System.out.printf("Enter the quantity of item 3: ");
        quan = userInput.nextInt();
        return quan;
    }
}
