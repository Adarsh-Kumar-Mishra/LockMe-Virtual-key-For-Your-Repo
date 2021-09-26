package com.lockme;

public class DisplayOption {
     public static void printWelcome() {
    	 System.out.println("           Welcome to LockMe.com. \n"
    	 		          + "    This application is developed by Adarsh kumar \n"
    	 		          + "*******************************************************");
     }
     public static void displayMenu() {
    	 String menu = "\n\nSelect any option number from below and press Enter \n\n"
    	 + "1) Retrieve all files inside \"main\" folder\n" + "2) Display menu for File operations\n"
    	 + "3) Exit program\n";
    	 System.out.println(menu);
    	 }
}
