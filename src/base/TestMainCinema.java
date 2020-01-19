package base;

import java.rmi.AccessException;
//import java.util.InputMismatchException;
import java.util.Scanner;

//import com.sun.org.apache.xerces.internal.dom.AbortException;

////import excercioni.AgeException;

public class TestMainCinema {

	public static void main(String[] args) throws AccessException {

		Scanner sc = new Scanner(System.in);
		int choice = 0;
		Cinema cinema = new Cinema();
		Client[] armChairs = new Client[10];
		
		for(int i = 0; i < armChairs.length; i ++) {
			armChairs[i] = new Client();
		}

		System.out.println("*** Welcome to cinema ***\n\n");
		
		aa: do {
			System.out.println("*** Management Cinema ***");
			System.out.println("------------------------");
			System.out.println("Book one of the following works");
			System.out.println("1. Booking entry");
			System.out.println("2. Change booking");
			System.out.println("3. Booking cancellation");
			System.out.println("4. View reservation");
			System.out.println("5. View all reservations");
			System.out.println("6. Cinema programming");
			System.out.println("7. Exit");

			choice = sc.nextInt(); sc.nextLine();
			System.out.println("You have chosen the option " + choice);

			if(choice < 1 || choice > 7) {
				System.out.println("wrong choice you must enter a number from 1 to 7");
			}

			else
				switch(choice) {
				case 1:

					cinema.entry(armChairs);
					break;
				case 2:
					cinema.change(armChairs);
					break;
				case 3:
					Cinema.reading();
					break;
				case 4:
					Cinema.delete();
					break;
				case 5: 
					Cinema.displaysAllPosts();
					break;
				case 6:
					Cinema.runProgramming();
					break;
				case 7:
					Cinema.exit();
					break aa;

				default:
					Cinema.exit();
				}
		}while(true);
	}
}






