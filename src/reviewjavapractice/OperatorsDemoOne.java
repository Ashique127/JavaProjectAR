package reviewjavapractice;

public class OperatorsDemoOne {

	public static void main(String[] args) {
		int a = 10;
		int b = 15;

		// Arithmetic operators-----> + - * / %
		System.out.println("Sum of a and b will be:" + (a + b));
		System.out.println("Subtrack of a and b will be:" + (a - b));
		System.out.println("Mult of a and b will be:" + (a * b));
		System.out.println("Div of a and b will be:" + (a / b));
		// Relational Operators (Comparison operators)-----> == < > <= >= !=
		// Always return boolean value
		System.out.println(a == b);
		System.out.println(a > b);
		System.out.println(a < b);
		System.out.println(a >= b);
		System.out.println(a <= b);
		System.out.println(a != b);

		// Logical operators && || !
		// Works between two boolean values
		boolean x = true;
		boolean y = false;
		System.out.println(x && y);
		System.out.println(x || y);
		System.out.println(!x);
		System.out.println(!y);

		// increment/decrement operators ++ --
		a = 10;
		a++;
		System.out.println(a);
		b = 20;
		b--;
		System.out.println(b);

	}

}
