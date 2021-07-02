package game;

import fixtures.Room;

public class Player {
	
	protected static Room currentRoom;

	public Room getCurrentRoom() {
		
		return currentRoom;
	}

	public static void setCurrentRoom(Room currentRoom) {
		Player.currentRoom = currentRoom;
	}
 
	
}
