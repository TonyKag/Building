/**
 *   File Name: HighSchool.java<br>
 *
 *   Yutaka<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Oct 2, 2015
 *   
 */

package org.sqa.ao;

/**
 * HighSchool //ADDD (description of class)
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
public class HighSchool extends School {
	private int gymNumStearmasters;

	HighSchool() {
		super();
		gymNumStearmasters = 20;
	}

	HighSchool(double square, String color, int floors, int rooms, int lunchRoomCapacity, boolean hasPool,
			int backYardEquipment) {
		super(square, color, floors, rooms, lunchRoomCapacity, hasPool);
		this.gymNumStearmasters = gymNumStearmasters;
	}

	public void addOneStearmaster() {
		gymNumStearmasters += 1;
	}

	/**
	 * @return the gymNumStearmasters
	 */
	public int getGymNumStearmasters() {
		return gymNumStearmasters;
	}

	public void removeOneStearmaster() {
		gymNumStearmasters -= 1;
	}

	/**
	 * @param gymNumStearmasters
	 *            the gymNumStearmasters to set
	 */
	public void setGymNumStearmasters(int gymNumStearmasters) {
		this.gymNumStearmasters = gymNumStearmasters;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return super.toString() + "gymNumStearmasters=" + gymNumStearmasters;
	}
}
