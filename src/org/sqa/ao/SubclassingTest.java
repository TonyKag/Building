/**
 *   File Name: SubclassingTest.java<br>
 *
 *   Yutaka<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Oct 2, 2015
 *   
 */

package org.sqa.ao;

import org.junit.Test;

/**
 * SubclassingTest
 * 
 * @author Yutaka
 * @version 1.0.0
 * @since 1.0
 *
 */
public class SubclassingTest {
	@Test
	public void testSubclasses() {
		Building b1 = new Building();
		System.out.println("Building was created (default constructor):");
		System.out.println(b1);
		Building b2 = new Building(2400, "blue", 2, 230);
		System.out.println("Building was created (constructor with parameters):");
		System.out.println(b2);
		b2.changeColor("black");
		System.out.println("Color was changed");
		System.out.println(b2);

		School s1 = new School();
		System.out.println("\nSchool was created (default constructor):");
		System.out.println(s1);
		School s2 = new School(3200.0, "green", 4, 345, 65, true);
		System.out.println("School was created (constructor with parameters):");
		System.out.println(s2);
		s2.changeLunchRoomCapacity(75);
		System.out.println("Lunch Room Capacity was changed");
		System.out.println(s2);

		ElementarySchool es1 = new ElementarySchool();
		System.out.println("\nElementary School was created (default constructor):");
		System.out.println(es1);
		ElementarySchool es2 = new ElementarySchool(3400, "Pink", 2, 125, 25, false, 12);
		System.out.println("Elementary School was created (constructor with parameters):");
		System.out.println(es2);
		es2.changeNumEquipment();
		System.out.println("Number of Equipment was increased");
		System.out.println(es2);

		HighSchool hs1 = new HighSchool();
		System.out.println("\nHigh School was created (default constructor):");
		System.out.println(hs1);
		HighSchool hs2 = new HighSchool(4500, "Brown", 4, 370, 75, true, 35);
		System.out.println("High School was created (constructor with parameters):");
		System.out.println(hs2);
		hs2.addOneStearmaster();
		System.out.println("One Stearmaster was added");
		System.out.println(hs2);

		Planetarium p1 = new Planetarium();
		System.out.println("\nPlanetarium was created (default constructor):");
		System.out.println(p1);
		Planetarium p2 = new Planetarium(650, "red", 1, 3, 25, 45, 3);
		System.out.println("Planetarium was created (constructor with parameters):");
		System.out.println(p2);
		p2.changePrograms();
		System.out.println("Number Programms was increased");
		System.out.println(p2);

	}
}
