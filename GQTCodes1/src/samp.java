class Samp {
	int a = 10;
	int b = 20;
	void display() {
		System.out.println(a+" "+b);
	}
}
class Sample2{
	void change() {
		a= 30;
		b = 40;
	}
}
class Sample3 extends Sample2,Samp{
	void change() {
		a = 10;
		b = 20;
	}
}
