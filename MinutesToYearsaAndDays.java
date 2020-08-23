/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minutestoyearsaanddays;

import java.util.Scanner;

/**
 *
 * @author adis3
 */
public class MinutesToYearsaAndDays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of minutes: ");
        int minutes = scan.nextInt();
        int noOfHours = minutes/60;
        int noOfDays = noOfHours/24;
        int noOfYears = noOfDays/365;
        
        int days = noOfDays%365;
        System.out.println(minutes+" is equal to "+noOfYears+" Years and "+days+" days.");
        
    }
    
}
