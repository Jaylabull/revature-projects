package game;

import java.util.Scanner;

import fixtures.Room;


public class Main {
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		RoomManager room = new RoomManager();
		room.init();
		Player player = new Player();
		Player.setCurrentRoom(room.getStartRm());
		
		String userInput = " ";

		
		do {
			System.out.println("Where would you like to go?");
			System.out.println("You are current in the Living Room\n");
			System.out.println("****************************************");
//			System.out.println("Right: " + "\n"
//					+ "Forward: The Bedroom");
			System.out.println(player.getCurrentRoom().getExitOptions());
			userInput= scan.nextLine().toLowerCase();
			printRoom(player);
			
			Room nxtRoom = new Room();
			nxtRoom =  nxtRoom.getExit(userInput);
	
			String[] command = collectInput();
		

			
			if (nxtRoom != null) {
				moveRooms(command, player);
			}
			
		}while(!userInput.equals("quit"));
		

	}

	public static void printRoom(Player player) {
		System.out.println(player.getCurrentRoom().getName());
		System.out.println(player.getCurrentRoom().getShortDescription());
		System.out.println(player.getCurrentRoom().getLongDescription());
		System.out.println(player.getCurrentRoom().getExitOptions());
		System.out.println("You are current in the " + player.getCurrentRoom().getName() + "\n "
				+ "Please type in 'go' and the direction would you like to go?\n");
		System.out.println("****************************************");
		//printRoom(player);
	}
	
	private static String[] collectInput() {;
		String userInput = scan.nextLine();
		
		String[] newInput = userInput.toLowerCase().split(" ");
		return newInput;
		
	}
	//parse method
	private static void moveRooms(String[] command, Player player) {
		
		command[1] = "go";
		
		if (command[0].equals("quit")) {
			System.out.println("Game cancelled.");
		}
		
		
		switch(command[1]) {
		
		case "left":
			player.getCurrentRoom().getExitOptions().contains("left");
			break;
		case "right":
			player.getCurrentRoom().getExitOptions().contains("right");
			break;
		case "forward":
			player.getCurrentRoom().getExitOptions().contains("forward");
			break;
		case "backward":
			player.getCurrentRoom().getExitOptions().contains("backward");
			break;
		
		}
		
		
	}
	
	

}
