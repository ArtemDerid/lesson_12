package ua.lviv.lgs.max;

public class Main {
	
	public static void main(String[] args) {
		MyArrayList string = new MyArrayList();
		
		string.add(23);
		string.add(43.5);
		string.add('2');
		string.add("array");
		string.add(2323324);
		
		string.display();
		System.out.println("");
		
		string.remove(4);
		string.remove(3);
		
		string.display();
	}
	
	

}
