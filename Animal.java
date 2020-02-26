
public class Animal {
	String name;
	public int Legs;
	
	Animal(String n, int x) {
		this.name = n;
		this.Legs = x;
	}
	public int getLegs() {
		return Legs;
}
	public String toString() {
	return name + " " + Legs;
}
}


