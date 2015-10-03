/**
 *   File Name: School.java<br>
 *
 *   Yutaka<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Oct 2, 2015
 *   
 */

package org.sqa.ao;

/**
 * School //ADDD (description of class)
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

public class School extends Building {
	private boolean hasPool;
	private int lunchRoomCapacity;

	School() {
		super();
		lunchRoomCapacity = 10;
		hasPool = false;
	}

	School(double square, String color, int floors, int rooms, int lunchRoomCapacity, boolean hasPool) {
		super(square, color, floors, rooms);
		this.lunchRoomCapacity = lunchRoomCapacity;
		this.hasPool = hasPool;
	}

	public void changeLunchRoomCapacity(int aLunchRoomCapacity) {
		lunchRoomCapacity = aLunchRoomCapacity;
	}

	/**
	 * @return the lunchRoomCapacity
	 */
	public int getLunchRoomCapacity() {
		return lunchRoomCapacity;
	}

	/**
	 * @return the hasPool
	 */
	public boolean isHasPool() {
		return hasPool;
	}

	/**
	 * @param hasPool
	 *            the hasPool to set
	 */
	public void setHasPool(boolean hasPool) {
		this.hasPool = hasPool;
	}

	/**
	 * @param lunchRoomCapacity
	 *            the lunchRoomCapacity to set
	 */
	public void setLunchRoomCapacity(int lunchRoomCapacity) {
		this.lunchRoomCapacity = lunchRoomCapacity;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return super.toString() + "hasPool=" + hasPool + ", lunchRoomCapacity=" + lunchRoomCapacity;
	}
}
