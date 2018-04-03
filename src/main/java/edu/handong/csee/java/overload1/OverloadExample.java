package edu.handong.csee.java.overload1;

//TODO add javadoc later
public class OverloadExample {

	public static void main(String[] args) {
		
		double average1 = getAverage(30,40); // 
		double average2 = getAverage(30, 40,20);
		char average3 = getAverage('a','c');
		
		System.out.println(average1);
		System.out.println(average2);
		System.out.println(average3);

	}
	
	
	public static double getAverage(double first, double second) {
		return ((first+second)/2);
	}
	
	public static double getAverage(double first, double second, double three) {
		return(first+second+three)/3;
	}
	
	public static char getAverage(char fisrt, char second) {
		return (char)((fisrt+second)/2);
	}
	
}
