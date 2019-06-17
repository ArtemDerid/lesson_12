package ua.lviv.lgs.min.first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Random;
import java.util.Scanner;

public class Application {

	static void menu() {
		System.out.println("Press 1 to see what carArray contains");
		System.out.println("Press 2 to set one Car object to all array elements");
	}

	public static void main(String[] args) {

		Car car = new Car(getRandomValueFromRange(50, 300), getRandomValueFromRange(1990, 2019),
				new Helm(getRandomValueFromRange(13, 25), chooseMaterial()),
				new Engine(getRandomValueFromRange(1, 12)));

		ArrayList<ArrayList<Car>> carArray = new ArrayList<>();

		Scanner s = new Scanner(System.in);

		while (true) {
			menu();
			switch (s.next()) {
			case "1": {
				for (int i = 0; i < getRandomValueFromRange(2, 5); i++) {
					ArrayList<Car> carArray1 = new ArrayList<>();
					for (int j = 0; j < getRandomValueFromRange(2, 5); j++) {
						Car cars = new Car(getRandomValueFromRange(50, 300), getRandomValueFromRange(1990, 2019),
								new Helm(getRandomValueFromRange(13, 25), chooseMaterial()),
								new Engine(getRandomValueFromRange(1, 12)));
						carArray1.add(cars);
					}
					carArray.add(carArray1);
				}
				System.out.println(carArray);
			}
				break;

			case "2": {
				for (int i = 0; i < getRandomValueFromRange(2, 5); i++) {
					ArrayList<Car> carArray1 = new ArrayList<>();
					for (int j = 0; j < getRandomValueFromRange(2, 5); j++) {
						carArray1.add(car);
					}
					carArray.add(carArray1);
				}
				System.out.println(carArray);
			}
				break;
			}
		}

	}

	public static int getRandomValueFromRange(int min, int max) {
		if (min > max) {
			throw new IllegalArgumentException("Min must be less then max");
		}

		Random r = new Random();
		return r.nextInt(max - min + 1) + min;
	}

	public static String chooseMaterial() {
		String material;
		int choice = (int) (Math.random() * 2) + 1;
		if (choice == 1) {
			material = "leather";
		} else {
			material = "alcantara";
		}
		return material;
	}

}
