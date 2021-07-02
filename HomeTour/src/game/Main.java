package game;

import java.util.Scanner;

import fixtures.Room;


public class Main {
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		RoomManager room = new RoomManager();
		Room currentRoom = room.getStartRm();
		room.init();
		
		Player player = new Player();
		Player.setCurrentRoom(room.getStartRm());
		
		String userInput = " ";

		 
		
		do {
			System.out.println("Where would you like to go?");
			userInput= scan.nextLine().toLowerCase();
			printRoom(player);
			
			Room nxtRoom = new Room();
			nxtRoom =  currentRoom.getExit(userInput);
	
			
			String[] command = collectInput();
		
			moveRooms(command, player);
			
			if (nxtRoom != null) {
				currentRoom = nxtRoom;
			}
			
		}while(!userInput.equals("quit"));

	}

	public static void printRoom(Player player) {
		System.out.println(player.getCurrentRoom().getName());
		System.out.println(player.getCurrentRoom().getShortDescription());
		System.out.println(player.getCurrentRoom().getLongDescription());
		System.out.println(player.getCurrentRoom().getExitOptions());
		System.out.println("Which direction would you like to go?");
		
	}
	
	private static String[] collectInput() {
		
		String userInput = scan.nextLine();
		
		String[] newInput = userInput.toLowerCase().split(" ");
		return newInput;
		
	}
	//parse method
	private static void moveRooms(String[] command, Player player) {
		

		
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
