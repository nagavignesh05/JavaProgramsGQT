package isahasa;
//Composite object1
class brain{
	private int iq;
	private float weight;
//using this constructor we assign the values to the object
	public brain(int iq, float weight) {
		super();
		this.iq = iq;
		this.weight = weight;
	}
//using this we will be able to get the the iq independently
	public int getIq() {
		return iq;
	}
//using this we will be able to get the the weight independently	
	public float getWeight() {
		return weight;
	}	
}
//Composite object2
class heart{
	private int beat;
	private float weight;
//using this constructor we assign the values to the object
	public heart(int beat, float weight) {
		super();
		this.beat = beat;
		this.weight = weight;
	}
//using this we will be able to get the the beat independently
	public int getBeat() {
		return beat;
	}
//using this we will be able to get the the weight independently
	public float getWeight() {
		return weight;
	}
}
//Aggregate object1
class book{
	private String name;
	private String author;
//using this constructor we assign the values to the object
	public book(String name, String author) {
		super();
		this.name = name;
		this.author = author;
	}
//using this we will be able to get the the name independently
	public String getName() {
		return name;
	}
//using this we will be able to get the the author independently
	public String getAuthor() {
		return author;
	}	
}
//Aggregate object2
class bike{
	private String name;
	private int cost;
//using this constructor we assign the values to the object
	public bike(String name, int cost) {
		super();
		this.name = name;
		this.cost = cost;
	}
//using this we will be able to get the the name independently
	public String getName() {
		return name;
	}
//using this we will be able to get the the cost independently
	public int getCost() {
		return cost;
	}
}
class Human{
	heart hrt = new heart(23,70);
	brain brn = new brain(100,30.5f);
}
class Student extends Human{
	void hasAbook(book bk) {
		System.out.println(bk.getName());
		System.out.println(bk.getAuthor());
	}
	void hasAbike(bike bik) {
		System.out.println(bik.getName());
		System.out.println(bik.getCost());
	}
}
public class Launch1 {

	public static void main(String[] args) {
		Student s1 = new Student();
		book bk = new book("HarryPotter","Jk rowling");
		bike bik = new bike("RoyalEnfield",200000);
		
		System.out.println(s1.hrt.getBeat());
		System.out.println(s1.hrt.getWeight());
		
		System.out.println(s1.brn.getIq());
		System.out.println(s1.hrt.getWeight());
		
		s1.hasAbike(bik);
		s1.hasAbook(bk);
	}
}
