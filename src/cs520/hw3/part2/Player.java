/**
 * Player.java (Assignment 3, Part 2)
 * @author YOUR NAME
 */

package cs520.hw3.part2;

public class Player {

private int number;
private String name;
private String position;
private String year;

public Player( String name) {
	name=this.name;
}

public int getNumber() {
	return number;
}

public void setNumber(int number) {
	this.number = number;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getPosition() {
	return position;
}

public void setPosition(String position) {
	this.position = position;
}

public String getYear() {
	return year;
}

public void setYear(String year) {
	this.year = year;
}
public double computeScoringAverage() {
	//Random random=new Random;
	return Math.random()*10;
}
@Override
public String toString() {
	//return "# %d: %s (%s, %s)", number,name, position, year;
	return "#"+number+": "+name+ "("+position +","+year+ ")";
}
}
