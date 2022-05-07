package isahasa;

//Composite Object
class Os{
	private float version;
	private String name;
//Using this constructor we assign the values to the object
	public Os(float version, String name) {
		super();
		this.version = version;
		this.name = name;
	}
//Using this we will be able to get the version independently
	public float getVersion() {
		return version;
	}
//Using this we will be able to get the name independently
	public String getName() {
		return name;
	}
}
//Aggregate object
class charger{
	private String brand;
	private String volts;
	//Using this constructor we assign the values to the object
	public charger(String brand, String volts) {
		super();
		this.brand = brand;
		this.volts = volts;
	}
//Using this we will be able to get the brand independently
	public String getBrand() {
		return brand;
	}
//Using this we will be able to get the volts independently
	public String getVolts() {
		return volts;
	}
}
//main object
class Mobile{
//Since Os is composite object we must create its instance inside the main object class(Mobile)
	Os os = new Os(9,"xyz");
//Since charger is Aggregate object we must create a method to access it
	void hasAcharger(charger c) {
		System.out.println(c.getBrand());
		System.out.println(c.getVolts());
	}
}

public class Launch {

	public static void main(String[] args) {
		Mobile m = new Mobile();
		charger c = new charger("samsung","Five");
//Accessing the Aggregate and composite objects using the main object
		System.out.println(m.os.getName());
		System.out.println(m.os.getVersion());
		m.hasAcharger(c);
		
		m = null;
		//System.out.println(m.getName());
		//System.out.println(m.os.getVersion());
		//m.hasAcharger(c);
		
		System.out.println(c.getBrand());
		System.out.println(c.getVolts());
	}
}


