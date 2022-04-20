package View;

import java.util.Scanner;

import Model.borrow;

public class menu {
	  public static int menu() {
	        System.out.println("------------------------------------");
	        System.out.println("\n1. Read XML file");

	        System.out.println("4. Remove");
	        System.out.println("5. Exit");
	        System.out.println("------------------------------------");
	        System.out.print("Enter your choice:\n");
	        int choice = checkInputIntLimit(1, 5);
	        return choice;
	    }

	    public static Scanner in = new Scanner(System.in);

	    // Check input int
	    public static int checkInputInt() {
	        while (true) {
	            try {
	                int rs = Integer.parseInt(in.nextLine());
	                return rs;
	            } catch (NumberFormatException ex) {
	                System.err.println("Input integer number!!");
	                System.out.println("Enter again:");
	            }
	        }
	    }

	    // Check input int limit
	    public static int checkInputIntLimit(int min, int max) {
	        // loop until user input correct
	        while (true) {
	            try {
	                int result = Integer.parseInt(in.nextLine().trim());
	                if (result < min || result > max) {
	                    throw new NumberFormatException();

	                }
	                return result;
	            } catch (NumberFormatException e) {
	                System.err.println("Please input number in rage [" + min + ", " + max + "]");
	                System.out.print("Enter again: ");
	            }
	        }
	    }

	    // Chekc input String
	    public static String checkInputString() {
	        while (true) {
	            String rs = in.nextLine().trim();
	            if (!rs.isEmpty()) {
	                return rs;
	            } else {
	                System.out.println("Can not empty!");
	                System.out.println("Please enter again:");
	            }
	        }
	    }

//	     Display list
	    public static void showList(borrow borrow) {
	        System.out.printf("%-20s%-20s%-20s%"
	        		+ "-60s%-20s%-20s%\n", "Ticketid", "|borrower", "|borrow_date", "|borrow_time","|Item Name","|Item Price");
	        for (int i = 0; i < borrow.getItems().size(); i++) {
	            System.out.printf("%-20s%-20s%-20s%-60s%-20s%-20s%\n",
	                    "|" + borrow.getTicketid(),
	                    "|" + borrow.getBorrow_date(),
	                    "|" + borrow.getBorrow_time(),
	                    "|" + borrow.getItems().get(i).getName(),
	                    "|" + borrow.getItems().get(i).getPrice());


	        }
	    }
	}




