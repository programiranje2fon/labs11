package problem2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import problem2.Person;

public class PersonTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void constructor_testPerson() {
		Person o = new Person("Pera", "Peric");
		String name = o.getName();
		String surname = o.getSurname();
		
		assertTrue("Name not initialized well. Check the constructor and the getter.", name.equals("Pera"));
		assertTrue("Surname not initialized well. Check the constructor and the getter.", surname.equals("Peric"));
	}

	@Test
	public void method_getName() {
		Person o = new Person("Pera", "Peric");
		String name = o.getName();
		
		assertTrue("Name not initialized well. Check the constructor and the getter.", name.equals("Pera"));	
	}

	@Test
	public void method_getSurname() {
		Person o = new Person("Pera", "Peric");
		String surname = o.getSurname();
		
		assertTrue("Surname not initialized well. Check the constructor and the getter.", surname.equals("Peric"));		
	}

	@Test
	public void method_equals() {
		Person o1 = new Person("Pera", "Peric");
		Person o2 = new Person("Pera", "Peric");
		Person o3 = new Person("Luka", "Lukic");
		
		assertTrue("Method equals does not compare objects well", o1.equals(o2));
		assertFalse("Method equals does not compare objects well", o1.equals(o3));
		
	}
	
	
	@Test
	public void method_toString() {
		Person o = new Person("Pera", "Peric");
		
		assertTrue("Method toString does not return the expected value", o.toString().equals("Person [name=Pera, surname=Peric]"));
	}

}
