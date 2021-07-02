package fixtures;

public class Fixture {

	public String name;
	public String shortDescription;
	public String longDescription;
	public String exitOptions;
	
	public Fixture(String objName, String shortDescription,String longDescription,
			String exitOptions) {
		super();
		this.name = objName;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
		this.exitOptions = exitOptions;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	public String getExitOptions() {
		return exitOptions;
	}

	public void setExitOptions(String exitOptions) {
		this.exitOptions = exitOptions;
	}
}
