package dayofsummer;

public class DaOrsall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 35;
		double b = 12;

		{
			System.out.println("Sum of a and b will be:" + (a + b));
			System.out.println("Subtrack a and b will be:" + (a - b));
			System.out.println("Mul of a and b will be:" + (a * b));
			System.out.println("Div of a and b will be:" + (a / b));
			System.out.println("Mod of a and b will be:" + (a % b));
			System.out.println(a == b);
			System.out.println(a > b);
			System.out.println(a < b);
			System.out.println(a >= b);
			System.out.println(a <= b);
			System.out.println(a != b);

			boolean x = true;
			boolean y = false;
			System.out.println(x || y);
			System.out.println(x && y);
			System.out.println(!x);
			System.out.println(!y);

			a = 10;
			a++;
			System.out.println(a);
			b = 20;
			b--;
			System.out.println(b);

		}
	}

}
