package fixtures;

public class Room extends Fixture {
		String name;
		

	protected Room[] exits = new Room[4];
//	    {left, right, forward, backward}
//		{0       1  	  2		   3    }
	    
	    //constructor
		public Room(String name, String shortDescription, String longDescription, String exitOptions) {
			
			super(name, shortDescription, longDescription, exitOptions);
			this.name = name;
			this.shortDescription = shortDescription;
			this.longDescription = longDescription;
			this.exits = new Room[4];
			
	}

		//getters and setters
		public Room[] getExits(Room[] exits) {
			
			return this.exits = exits;
		}
		
		   public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			
			public Room[] getExits() {
				
				return this.exits;
			}

			public void setExits(Room[] exits) {
				
				this.exits = exits;
				
			}
		//method
		public Room getExit(String direction) {
		
			switch(direction) {
			case "left":
				return exits[0];
			case "right":
				return exits[1];
			case "forward":
				return exits[2];
			case "backward":
				return exits[3];
				default:
					return null;
					
			}
		}
		
	}
	


