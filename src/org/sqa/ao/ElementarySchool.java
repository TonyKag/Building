/**
 *   File Name: ElementarySchool.java<br>
 *
 *   Yutaka<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Oct 2, 2015
 *   
 */

package org.sqa.ao;

/**
 * ElementarySchool //ADDD (description of class)
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
public class ElementarySchool extends School {
	private int backYardEquipment;

	ElementarySchool() {
		super();
		backYardEquipment = 10;
	}

	ElementarySchool(double square, String color, int floors, int rooms, int lunchRoomCapacity, boolean hasPool,
			int backYardEquipment) {
		super(square, color, floors, rooms, lunchRoomCapacity, hasPool);
		this.backYardEquipment = backYardEquipment;
	}

	public void changeNumEquipment() {
		backYardEquipment += 1;
	}

	/**
	 * @return the backYardEquipment
	 */
	public int getBackYardEquipment() {
		return backYardEquipment;
	}

	/**
	 * @param backYardEquipment
	 *            the backYardEquipment to set
	 */
	public void setBackYardEquipment(int backYardEquipment) {
		this.backYardEquipment = backYardEquipment;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return super.toString() + "backYardEquipment=" + backYardEquipment;
	}
}
