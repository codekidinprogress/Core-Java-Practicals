package Practical_05;

class Before{
	void now() {
		System.out.println("Before code.");
	}
}

class After extends Before{
	void now() {
		System.out.println("After code.");
	}
}
public class overriding {

	public static void main(String[] args) {
		After A = new After ();
		A.now();
		Before B = new Before();
		B.now();
	}

}
