package basicnewpackage;

public class IFElseLogical {

	public static void main(String[] args) {
		int temp = 18;
		if (temp >= 30) {
			System.out.println("It is hot outside");
		} else if (temp >= 20 && temp <= 30) {
			System.out.println("It is warm outside");
		} else {
			System.out.println("It is cold outside");
		}
	}

}
