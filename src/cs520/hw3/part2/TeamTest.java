/**
 * TeamTest.java (Assignment 3, Part 2)
 * @author YOUR NAME
 */

package cs520.hw3.part2;

public class TeamTest {
	public static void main(String[] arg) {
		try {
	Player player1=new Player(50,"George Washington","F","So.");
	System.out.println(player1.toString()+":"+player1.computeScoreAverage());
	
	Player player2=new Player(12,"John Adams","D","Jr.");
	System.out.println(player2.toString()+":"+player2.computeScoreAverage());
	
	Player player3=new Player(2 ,"Case McCarthy" ,"D","Jr." );
	System.out.println(player3.toString()+":"+player3.computeScoreAverage());
	
	Player player4=new Player(5 ,"Thomas Jarman","D","So.");
	System.out.println(player4.toString()+":"+player4.computeScoreAverage());
	
	Player player5=new Player(5 ,"Thomas Jarman","D","So." );
	System.out.println(player5.toString()+":"+player5.computeScoreAverage());
	
	Player player6=new Player(7 ,"Alex Vlasic","D" ,"Jr.");
	System.out.println(player6.toString()+":"+player6.computeScoreAverage());
	
	Player player7=new Player(8 ,"Cade Webber","D","So." );
	System.out.println(player7.toString()+":"+player7.computeScoreAverage());
	
	Player player8=new Player(9 ,"Logan Cockerill","F","Sr.");
	System.out.println(player8.toString()+":"+player8.computeScoreAverage());
	
	Player player9=new Player(10,"Nick Zabaneh" ,"F","So.");
	System.out.println(player9.toString()+":"+player9.computeScoreAverage());
	
	Player player10=new Player(11,"Luke Touch","F" ,"So.");
	System.out.println(player10.toString()+":"+player10.computeScoreAverage());
	
	double Total=player1.computeScoreAverage()+player2.computeScoreAverage()+player3.computeScoreAverage()+
			player4.computeScoreAverage()+	player5.computeScoreAverage()+player6.computeScoreAverage()+
			player7.computeScoreAverage()+player8.computeScoreAverage()+player9.computeScoreAverage()+
			player10.computeScoreAverage();
	
	System.out.println("Average score is: "+(Total/10));
	
		}
		catch(Exception e){
			System.out.println("Oops there is something going on!");
			System.out.println(e);
			
		}
}

}
