/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Hao Nguyen
 */

package org.example;

import java.util.Calendar;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.print( "What is your current age? " );
        int age = input.nextInt();

        System.out.print("At what age would you like to retire? ");
        int ret = input.nextInt();

        int curYear = Calendar.getInstance().get(Calendar.YEAR);
        int retYear = curYear + (ret - age);

        System.out.printf("You have %d years left until you can retire.\n", ret - age);
        System.out.printf("It's %d, so you can retire in %d.", curYear, retYear);
    }
}
