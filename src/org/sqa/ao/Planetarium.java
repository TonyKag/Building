/**
 *   File Name: Planetarium.java<br>
 *
 *   Yutaka<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Oct 2, 2015
 *   
 */

package org.sqa.ao;

/**
 * Planetarium //ADDD (description of class)
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

public class Planetarium extends Building {
	private int displayRoomCapacity;
	private double domeDiameter;
	private int programs;

	Planetarium() {
		super();
		displayRoomCapacity = 20;
		domeDiameter = 30.0;
		programs = 1;
	};

	Planetarium(double square, String color, int floors, int rooms, int displayRoomCapacity, double domeDiameter,
			int programs) {
		super(square, color, floors, rooms);
		this.displayRoomCapacity = displayRoomCapacity;
		this.domeDiameter = domeDiameter;
		this.programs = programs;
	}

	public void changePrograms() {
		programs *= 2;
	}

	/**
	 * @return the displayRoomCapacity
	 */
	public int getDisplayRoomCapacity() {
		return displayRoomCapacity;
	}

	/**
	 * @return the domeDiameter
	 */
	public double getDomeDiameter() {
		return domeDiameter;
	}

	/**
	 * @return the programs
	 */
	public int getPrograms() {
		return programs;
	}

	/**
	 * @param displayRoomCapacity
	 *            the displayRoomCapacity to set
	 */
	public void setDisplayRoomCapacity(int displayRoomCapacity) {
		this.displayRoomCapacity = displayRoomCapacity;
	}

	/**
	 * @param domeDiameter
	 *            the domeDiameter to set
	 */
	public void setDomeDiameter(double domeDiameter) {
		this.domeDiameter = domeDiameter;
	}

	/**
	 * @param programs
	 *            the programs to set
	 */
	public void setPrograms(int programs) {
		this.programs = programs;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return super.toString() + "displayRoomCapacity=" + displayRoomCapacity + ", domeDiameter=" + domeDiameter
				+ ", programs=" + programs;
	}
}
