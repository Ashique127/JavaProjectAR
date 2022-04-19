package ashnipa;

public class TwoDash {

	public static void main(String[] args) {
		String[][] cars = {

				{ "Honda", "Tesla", "Mustang" }, { "Toyota", "Corvette", "BMW" }, { "Ferrari", "Ford", "Lambo" } };

		for (int i = 0; i < cars.length; i++) {
			System.out.println();
			for (int j = 0; j < cars[i].length; j++) {
				System.out.println(cars[i][j] + "");
			}
		}

	}

}
