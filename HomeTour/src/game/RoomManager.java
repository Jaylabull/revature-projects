package game;

import fixtures.Room;

public class RoomManager {
	
	protected Room[] allRooms;
	protected Room startRm;

	public void init () {
		allRooms = new Room[5];
		
		Room livingRm = new Room(
				"The Living Room", 
				"An open concept space with hardwood floors and modern furniture.", 
				"Immediately to the right the living room is an open concept kitchen"
				+ " with a beautiful marble island and an walkway to the right "
				+ "of the island.", "Exits: \nRight: the kitchen\nForward: "
						+ "The Bedroom");
		this.allRooms[0] = livingRm;
		this.startRm = livingRm;
		
		
		Room kitchen = new Room(
				"The Kitchen", 
				"A large kitchen with a connected laundry room.", 
				"The kitchen contains two entrences, one by way of the living room"
				+ " and one from the laundry room.", 
				"Exits: \nLeft: Living Room\nRight: Laundry Room\nForward: "
				+ "Bathroom");
		this.allRooms[1] = kitchen;

		
		Room laundryRm = new Room(
				"The Laundry Room", 
				"A small room connected to the kitchen." ,
				"In the kitchen to the right there is a door that leads into"
				+ "the laundry room that contains the washer and dryer. It"
				+ " only has one exit."
				,"Exits: \nLeft: Kitchen");
		this.allRooms[2] = laundryRm;
		
		
		Room bedRm = new Room(
				"The Master Bed Room", 
				"A room that can accessed from the living room and is also "
				+ "connected to a bathroom. ", 
				"A large room that can be directed accessed through the living "
				+ "room and bathroom. The bedroom contains a canopy bed and has beautiful natural"
				+ " lighting.", "Exits: \nRight: Bathroom\nBakwards: Living Room "
						+ "Bathroom");
		this.allRooms[3] = bedRm;
	
		
		Room bathRm = new Room(
				"The  Bathroom", 
				"A laboratory that has two access points.", 
				"The bathroom is an extension of the master bedroom, but also "
				+ "has an exit to the kitchen. This room is decorated with "
				+ "the sea in mind.", "Exits: \nRight: Bedroom\nBakwards: Kitchen"
						+ "Bathroom");
		this.allRooms[4] = bathRm;
      
		Player.setCurrentRoom(startRm);
		
		//1. set up exits for array of each room
		
		//Living Room 
		Room[] livingExits = new Room[4];
		livingExits[0] = null;
		livingExits[1] = kitchen;
		livingExits[2] = bedRm;
		livingExits[3] = null;
	   livingRm.setExits(livingExits);
	   
	   //kitchen
		Room[] kitchenExits = new Room[4];
		kitchenExits[0] = livingRm;
		kitchenExits[1] = laundryRm;
		kitchenExits[2] = bathRm;
		kitchenExits[3] = null;
	    kitchen.setExits(kitchenExits);
	   
	    //laundryRm
		Room[] laundryExits = new Room[4];
		laundryExits[0] = livingRm;
		laundryExits[1] = kitchen;
		laundryExits[2] = bedRm;
		laundryExits[3] = null;
	   livingRm.setExits(laundryExits);
	   
	   //bathRm
		Room[] bathrmExits = new Room[4];
		bathrmExits[0] = kitchen;
		bathrmExits[1] = null;
		bathrmExits[2] = null;
		bathrmExits[3] = null;
	   livingRm.setExits(bathrmExits);
		
	}
	
	public Room[] getAllRooms() {
		return this.allRooms;
	}

	public void setAllRooms(Room[] allRooms) {
		this.allRooms = allRooms;
	}

	public Room getStartRm() {
		return startRm;
	}

	public void setStartRm(Room startRm) {
		this.startRm = startRm;
	}
	
		
	}
	
