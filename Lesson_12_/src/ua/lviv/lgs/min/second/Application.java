package ua.lviv.lgs.min.second;

import java.util.ArrayList;
import java.util.Scanner;

import ua.lviv.lgs.exception.WrongInputConsoleParametersException;

public class Application {

//	enum Season {
//		WINTER, SPRING, SUMMER, FALL;
//	}

//	enum Month {
//		JANUARY(31, Season.WINTER), FEBRUARY(28, Season.WINTER), MARCH(31, Season.SPRING), APRIL(30, Season.SPRING),
//		MAY(31, Season.SPRING), JUNE(30, Season.SUMMER), JULY(31, Season.SUMMER), AUGUST(31, Season.SUMMER),
//		SEPTEMBER(30, Season.FALL), OCTOBER(31, Season.FALL), NOVEMBER(30, Season.FALL), DECEMBER(31, Season.WINTER);
//
//		int day;
//		Season season;
//
//		
//		private Month(int day, Season season) {
//			this.day = day;
//			this.season = season;
//		}
//
//		public int getDay() {
//			
//			
//			return day;
//		}
//
//		public Season getSeason() {
//			/* getter */
//			return season;
//			
//		}
//
//	}

	/* Crating static menu **/
	static void menu() {
		System.out.println("Натисніть 1, щоб перевірити чи такий місяць існує");
		System.out.println("Натисніть 2, щоб вивести всі місяці з такою ж порою року");
		System.out.println("Натисніть 3, щоб вивести всі місяці з такою ж кількістю днів");
		System.out.println("Натисніть 4, щоб вивести всі місяці з меншою кількістю днів");
		System.out.println("Натисніть 5, щоб вивести всі місяці з більшою кількістю днів");
		System.out.println("Натисніть 6, щоб вивести наступну пору року");
		System.out.println("Натисніть 7, щоб вивести попередню пору року");
		System.out.println("Натисніть 8, щоб вивести всі місяці з парною кількістю днів");
		System.out.println("Натисніть 9, щоб вивести всі місяці з непарною кількістю днів");
		System.out.println("Натисніть 10, щоб перевірити чи введений місяць має парну кількість днів");
	}

	public static void main(String[] args) throws WrongInputConsoleParametersException {

		Season winter = new Season("Winter");
		Season spring = new Season("Spring");
		Season summer = new Season("Summer");
		Season fall = new Season("Fall");
		
		ArrayList<Season> seasons = new ArrayList<Season>();
		
		seasons.add(winter);
		seasons.add(spring);
		seasons.add(summer);
		seasons.add(fall);
		
		Month january = new Month("Jaunuary", 31, seasons.get(0));
		Month february = new Month("February", 28, seasons.get(0));
		Month march = new Month("March", 31, seasons.get(1));
		Month april = new Month("April", 30, seasons.get(1));
		Month may = new Month("May", 31, seasons.get(1));
		Month june = new Month("June", 30, seasons.get(2));
		Month july = new Month("July", 31, seasons.get(2));
		Month august = new Month("August", 31, seasons.get(2));
		Month september = new Month("September", 30, seasons.get(3));
		Month october = new Month("October", 31, seasons.get(3));
		Month november = new Month("November", 30, seasons.get(3));
		Month december = new Month("December", 31, seasons.get(0));
		
		ArrayList<Month> months = new ArrayList<Month>();
		
		months.add(january);
		months.add(february);
		months.add(march);
		months.add(april);
		months.add(may);
		months.add(june);
		months.add(july);
		months.add(august);
		months.add(september);
		months.add(october);
		months.add(november);
		months.add(december);
		
		
//		Month[] mas = Month.values();
//		
//		/** Creating an array of Seasons */
//		Season[] mass = Season.values();
		
		Scanner sc = new Scanner(System.in);
		
		String message = "Enter correct data please";

		while (true) {
			menu();

			switch (sc.next()) {
			case "1": {
				System.out.println("Enter month: ");
				sc = new Scanner(System.in);
				String month = sc.next();

				boolean flag = ifMonthExist(months, month);

				if (!flag) {
					throw new WrongInputConsoleParametersException(message);
				}
			}

				break;

			case "2": {

				System.out.println("Enter season: ");
				sc = new Scanner(System.in);
				String seasonSc = sc.next();

				boolean flag = ifSeasonExists(seasons, seasonSc);

				if (flag) {
					for (Month m1 : months) {
						if (m1.getSeason().getName().equalsIgnoreCase(seasonSc)) {
							System.out.println(m1.getName());
						}
					}

				}

				if (!flag) {
					System.out.println("Season doesn't exist");
					throw new WrongInputConsoleParametersException(message);
				}

			}

				break;

			case "3": {

				System.out.println("Enter month: ");
				sc = new Scanner(System.in);
				String month = sc.next();

				boolean flag = ifMonthExist(months, month);

				if (flag) {
					for (Month m : months) {
						if (m.getName().equalsIgnoreCase(month)) {
							for (Month m1 : months) {
								if (m1.getNumberOfDays() == m.getNumberOfDays()) {
									System.out.println(m1.getName());
								}
							}
						}
					}
				}

				if (!flag) {
					System.out.println("Month doesn't exist");
					throw new WrongInputConsoleParametersException(message);
				}
			}
				break;

			case "4": {

				System.out.println("Enter month: ");
				sc = new Scanner(System.in);
				String month = sc.next();

				boolean flag = ifMonthExist(months, month);

				if (flag) {
					for (Month m : months) {
						if (m.getName().equalsIgnoreCase(month)) {
							for (Month m1 : months) {
								if (m1.getNumberOfDays() < m.getNumberOfDays()) {
									System.out.println(m1.getName());
								}
							}
						}
					}
				}

				if (!flag) {
					System.out.println("Month doesn't exist");
					throw new WrongInputConsoleParametersException(message);
				}
			}
				break;

			case "5": {

				System.out.println("Enter month: ");
				sc = new Scanner(System.in);
				String month = sc.next();

				boolean flag = ifMonthExist(months, month);

				if (flag) {
					for (Month m : months) {
						if (m.getName().equalsIgnoreCase(month)) {
							for (Month m1 : months) {
								if (m1.getNumberOfDays() > m.getNumberOfDays()) {
									System.out.println(m1.getName());
								}
							}
						}
					}
				}

				if (!flag) {
					System.out.println("Month doesn't exist");
					throw new WrongInputConsoleParametersException(message);
				}
			}
				break;

			case "6": {

				System.out.println("Enter season: ");
				sc = new Scanner(System.in);
				String seasonSc = sc.next();

				boolean flag = ifSeasonExists(seasons, seasonSc);

				if (flag) {
					for (Season s : seasons) {
						if (s.getName().equalsIgnoreCase(seasonSc)) {
							int index = seasons.indexOf(s);
							if (index == (seasons.size() - 1)) {
								index = 0;
								System.out.println(seasons.get(index).getName());
							} else {
								System.out.println(seasons.get(index+1).getName());
							}
						}
					}
				}

				if (!flag) {
					System.out.println("Season doesn't exist");
					throw new WrongInputConsoleParametersException(message);
				}

			}

				break;

			case "7": {

				System.out.println("Enter season: ");
				sc = new Scanner(System.in);
				String seasonSc = sc.next();

				boolean flag = ifSeasonExists(seasons, seasonSc);

				if (flag) {
					for (Season s : seasons) {
						if (s.getName().equalsIgnoreCase(seasonSc)) {
							int index = seasons.indexOf(s);
							if (index == 0) {
								System.out.println(seasons.get(seasons.size()-1).getName());
							} else {
								System.out.println(seasons.get(index-1).getName());
							}
						}
					}
				}

				if (!flag) {
					System.out.println("Season doesn't exist");
					throw new WrongInputConsoleParametersException(message);
				}

			}

				break;

			case "8": {

				for (Month m : months) {
					if (m.getNumberOfDays() % 2 == 0) {
						System.out.println(m.getName());
					}
				}
			}
				break;

			case "9": {

				for (Month m : months) {
					if (m.getNumberOfDays() % 2 != 0) {
						System.out.println(m.getName());
					}
				}
			}
				break;

			case "10": {

				System.out.println("Enter month: ");
				sc = new Scanner(System.in);
				String month = sc.next();

				boolean flag = ifMonthExist(months, month);

				if (flag) {
					for (Month m : months) {
						if (m.getName().equalsIgnoreCase(month)) {
							if (m.getNumberOfDays() % 2 == 0) {
								System.out.println(month + " has even number of days");
							} else {
								System.out.println(month + " has odd number of days");
							}
						}
					}
				}

				if (!flag) {
					System.out.println("Month doesn't exist");
					throw new WrongInputConsoleParametersException(message);
				}

			}
				break;

			}
		}

	}

	private static boolean ifSeasonExists(ArrayList<Season> seasons, String seasonSc) {
		boolean flag = false;

		for (Season s : seasons) {
			if (s.getName().equalsIgnoreCase(seasonSc)) {
				flag = true;
			}
		}
		return flag;
	}

	private static boolean ifMonthExist(ArrayList<Month> months, String month) {
		boolean flag = false;

		for (Month m : months) {
			if (m.getName().equalsIgnoreCase(month)) {
				System.out.println("Month exists");
				flag = true;
			}
		}
		return flag;
	}
}
