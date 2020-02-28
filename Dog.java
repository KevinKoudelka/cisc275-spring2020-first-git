

public class Dog extends Animal {
	String name;

	Dog(String n, int l) {
		super(l);
		this.name = n;
	}
	public int getLegs() {
		return Legs;
	}
	public String toString() {
        return name + " " + Legs;
}
}
