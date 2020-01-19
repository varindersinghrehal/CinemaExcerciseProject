package base;

import java.rmi.AccessException;
import java.util.Scanner;

//import com.sun.org.apache.xerces.internal.dom.AbortException;

//import excercioni.AgeException;

public class Cinema {

	boolean xxx;
	String name;
	int age;
	int numberOfPosti = 0;
	Scanner sc = new Scanner(System.in);

	public boolean isXxx() {
		return xxx;
	}
	public void setXxx(boolean xxx) {
		this.xxx = xxx;
	}
	public boolean entry(Client[] armChairs) throws AccessException {
		
		System.out.println("\nI am a method to enter write here");
		System.out.println("For which place do you want to book?");
		numberOfPosti = sc.nextInt() - 1;
		if(numberOfPosti < 1 || numberOfPosti > 10)
			System.out.println("wrong number. You must enter a number between 1 and 10");
		else {
			System.out.println("Enter your name: ");
			armChairs[numberOfPosti].setName(sc.nextLine());
			System.out.println("Enter your age: ");
			armChairs[numberOfPosti].setAge(sc.nextInt());
			System.out.println("Reserved seat");
		}
		return xxx;
	}

	public void change (Client[] armChairs) {
		System.out.println("\nI am a method per change write here");
		System.out.println("Per quale posto vuoi modificare?");
		numberOfPosti = sc.nextInt() - 1;
		
		if(numberOfPosti < 1 || numberOfPosti > 10)
			System.out.println("numero errato. Devi inserire un numero tra 1 e 10");
		else {
			System.out.println("Inserisci il nome: ");
			sc.nextLine();
			armChairs[numberOfPosti].setName(sc.nextLine());
			System.out.println("Inserisci l'età: ");
			armChairs[numberOfPosti].setAge(sc.nextInt());
			System.out.println("Posto prenotato");
		}
	}

	public static void reading () {
		System.out.println("\nI am a method per reading write here");
	}

	public static void delete () {
		System.out.println("\nI am a method per delete write here");	

	}

	public static void displaysAllPosts() {
		System.out.println("\nI am a method per displaysAllPosts write here");	
	}

	public static void runProgramming() {
		System.out.println("\nI am a method per runProgramming write here\n");	

	}

	public static void exit() {
		System.out.println("\nI am a method per exit write here\n");	
		System.out.println("************************");
		System.out.println("*** Arrivederci ***");
		System.out.println("************************");

	}

}
