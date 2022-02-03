/**
 * StringTest.java (Assignment 3, Part 1)
 * @author YOUR NAME
 */

package cs520.hw3.part1;

//import java.util.Random;
import java.util.Scanner;

public class StringTest {

		public static void main(String[] arg) {
			try {
				Scanner scan =new Scanner(System.in);
				System.out.println("Enter name, age and city:\n");
				String input=scan.nextLine().trim();
				int index1=input.indexOf(',');
				String name=input.substring(0,index1).trim();
				System.out.printf("Name:%s (length:%d)\n", name, name.length());
				int index2=input.indexOf(',',index1+1);
				String ageString=input.substring(index1+1,index2).trim();
				int age=Integer.parseInt(ageString);
				System.out.printf("Age : %d\nAge in 10 years: %d\n", age, age+10);
				String city=input.substring(index2+1).trim();
				System.out.printf("city:%s (length:%d)", city, city.length());
				scan.close();
			}
			catch(Exception e){
				System.out.println("Oops there is something going on!");
				System.out.println(e);
				
			}
		}



	}
