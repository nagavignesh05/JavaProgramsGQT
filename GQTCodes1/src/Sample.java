
class Sample {
	private int a = 10;
	int b = 20;
	void display() {
		System.out.println(a+" "+b);
	}
}
class Sample1 extends Sample{
	void change() {
		a= 30;
		b = 40;
	}
}
