package zoo;

import java.util.Scanner;


public class Main {
	public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
	String[] animals = {"aligator", "monkey", "shark", "bear", "snake",
			null, null, null, null, null};	
	
	while(true){

		System.out.println("enter 1 for check animal");
		System.out.println("enter 2 for add animal");
		System.out.println("enter 3 to check whether we still have empty places");
		System.out.println("enter 4 for delete animal");
		System.out.println("enter 5 for show all animlas");
	
	String user = scanner.next();

	switch (user) {
	case "1": {
		System.out.println("Please enter some name");
		String inputName = scanner.next();
		boolean existName = false;
		
		for (int i = 0; i < animals.length; i++) {
				 
			if (inputName.equalsIgnoreCase(animals[i])) {
				System.out.println("Sorry, but we already have such animal");
				existName = true;
			} 
		}
		
		if(existName == false){
			System.out.println("We do not have such an animal");
		}
		break;
	}
	case "2": {
		System.out.println("Which animal do you want to add?");
		String inputName = scanner.next();
		for (int i = 0; i < animals.length; i++){
		if(inputName.equals(animals[5]) );
		animals[5] = inputName;
			System.out.println(animals[i]);
		};
		break;
	}
	case "3": {
		System.out.println("In order to check whether there are still empty places enter <null>");
		String inputName = scanner.next();
		boolean existName = false;
		
		for (int i = 0; i < animals.length; i++) {
				 
			if (inputName.equalsIgnoreCase(null)){
				System.out.println("Sorry, but our zoo is already full");
				existName = true;
			} 
		}
		
		if(existName == false){
			System.out.println("Yes we still have empty places");
			System.out.println("Which animal do you want to add?");
			String inputName1 = scanner.next();
			for (int i = 0; i < animals.length; i++){
			if(inputName.equals(animals[6]));
			animals[6] = inputName1;
				System.out.println(animals[i]);
			};
			System.out.println("Do you want to add one more animal?");
			String inputName2 = scanner.next();
			for (int i = 0; i < animals.length; i++){
			if(inputName.equals(animals[7]));
			animals[7] = inputName2;
					System.out.println(animals[i]);
			}
			System.out.println("Do you want to add one more animal?");
			String inputName3 = scanner.next();
			for (int i = 0; i < animals.length; i++){
			if(inputName.equals(animals[8]));
			animals[8] = inputName3;
					System.out.println(animals[i]);
			}
			System.out.println("Do you want to add one more animal?");
			String inputName4 = scanner.next();
			for (int i = 0; i < animals.length; i++){
			if(inputName.equals(animals[9]));
			animals[9] = inputName4;
					System.out.println(animals[i]);
			}
			System.out.println("Do you want to add one more animal?");
			String inputName5 = scanner.next();
			for (int i = 0; i < animals.length; i++){
			if(inputName5.equals(animals[10]));
			animals[10] = inputName4;
					System.out.println(animals[i]);
		}
			
		}
		break;
	}
	case "4":{
		System.out.println("Write name of the animal which you want to delete");
		String inputName = scanner.next();
		if(animals[0].equals(inputName)){
		animals[0] = null;
		System.out.println("You have just deleted [0]");
		} else if (animals[1].equals(inputName)){
			animals[1] = null;
			System.out.println("You have just deleted [1]");
		} else if (animals[2].equals(inputName)){
			animals[2] = null;
			System.out.println("You have just deleted [2]");
		} else if (animals[3].equals(inputName)){
			animals[3] = null;
			System.out.println("You have just deleted [3]");
		} else if (animals[4].equals(inputName)){
			animals[4] = null;
			System.out.println("You have just deleted [4]");
		} else if (animals[5].equals(inputName)){
			animals[5] = null;
			System.out.println("You have just deleted [5]");
		} else if (animals[6].equals(inputName)){
			animals[6] = null;
			System.out.println("You have just deleted [6]");
		} else if (animals[7].equals(inputName)){
			animals[7] = null;
			System.out.println("You have just deleted [7]");
		} else if (animals[8].equals(inputName)){
			animals[8] = null;
			System.out.println("You have just deleted [8]");
		} else if(animals[9].equals(inputName)){
			animals[9] = null;
			System.out.println("You have just deleted [9]");
		} else {
			System.out.println("We do not have such an animal");
		}
	}
		
	case "5":{
		for (int i = 0; i < animals.length; i++)
			if (animals[i] != null){
		System.out.print(animals[i] + ",");
		
	}
	}
	default: {
		break;
	}
	}
	}
	}
}