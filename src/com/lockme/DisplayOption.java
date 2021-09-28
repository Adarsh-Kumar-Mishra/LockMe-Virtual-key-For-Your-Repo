package com.lockme;

import java.util.Scanner;

public class DisplayOption {
	public static String name = null;
	static Scanner scn = new Scanner(System.in);
     public static void printWelcome() {
    	 
		  System.out.println("Hello, What's your name?");
    	  name = scn.nextLine();
    	 System.out.println("           Welcome," + name +" to LockMe.com. \n"
    	 		          + "    This application is developed by Adarsh Kumar"
    	 		          + "\n*******************************************************");
     }
     public static void displayMenu() {
    	 String menu = "\n\nSelect any option number from below and press Enter \n\n"
    	 + "1) Retrieve all files inside \"main\" folder\n" + "2) Display menu for File operations\n"
    	 + "3) Exit program\n";
    	 System.out.println(menu);
    	 }
     public static void displayFileMenuOptions() {
    	 String fileMenu = "\n\nSelect any option number from below and press Enter\n\n"
    	 + "1) Add a file to \"main\" folder\n" 
    	 + "2) Delete a file from \"main\" folder\n"
    	 + "3) Search for a file from \"main\" folder\n" 
    	 + "4) Show Previous Menu\n" 
    	 + "5) Exit program\n";
    	 System.out.println(fileMenu);
    	 }
     
}
