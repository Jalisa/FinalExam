

public class Vehicle extends Person {
	private String Name;
	private String Color;
	private int Weight;
	private Person Owner;
	
	public Vehicle(){		
	}
	
	public Vehicle(String Name, String Color, int Weight, Person Owner){

		this.setName(Name);
		this.setColor(Color);
		this.setWeight(Weight);
		this.setOwner(Owner);
	}
	
	public void transferOwnership(Person newOwner){
		this.setOwner(newOwner);
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = name;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		this.Color = color;
	}

	public int getWeight() {
		return Weight;
	}

	public void setWeight(int weight) {
		this.Weight = weight;
	}

	public Person getOwner() {
		return Owner;
	}

	public void setOwner(Person owner) {
		this.Owner = owner;
	}
}

