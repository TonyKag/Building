/**
 *   File Name: Building.java<br>
 *
 *   Yutaka<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Oct 2, 2015
 *   
 */

package org.sqa.ao;

/**
 * Building //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * @author Yutaka
 * @version 1.0.0
 * @since 1.0
 *
 */
public class Building {
	private String color;
	private int floors;
	private int rooms;
	private double square;

	Building() {
		square = 1000.0;
		color = "Yellow";
		floors = 1;
		rooms = 1;
	}

	Building(double square, String color, int floors, int rooms) {
		this.square = square;
		this.color = color;
		this.floors = floors;
		this.rooms = rooms;
	}

	public void changeColor(String aColor) {
		color = aColor;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @return the floors
	 */
	public int getFloors() {
		return floors;
	}

	/**
	 * @return the rooms
	 */
	public int getRooms() {
		return rooms;
	}

	/**
	 * @return the square
	 */
	public double getSquare() {
		return square;
	}

	/**
	 * @param color
	 *            the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @param floors
	 *            the floors to set
	 */
	public void setFloors(int floors) {
		this.floors = floors;
	}

	/**
	 * @param rooms
	 *            the rooms to set
	 */
	public void setRooms(int rooms) {
		this.rooms = rooms;
	};

	/**
	 * @param square
	 *            the square to set
	 */
	public void setSquare(double square) {
		this.square = square;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "color=" + color + ", floors=" + floors + ", rooms=" + rooms + ", square=" + square;
	}
}
