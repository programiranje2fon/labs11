package problem2;

import static org.junit.Assert.*;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import problem2.PersonsDatabase;
import problem2.Person;

public class PersonsDatabaseTest {

	PersonsDatabase database;
	
	@Before
	public void setUp() throws Exception {
		database = new PersonsDatabase();
	}

	@After
	public void tearDown() throws Exception {
		database = null;
	}

	@Test
	public void method_addPerson() {
		Person o = new Person("Pera", "Peric");
		database.addPerson(o);
		boolean added = (database.returnPersons().get(0) == o);
		assertTrue("Person was not added well", added);
	}

	@Test
	public void method_saveInFile() {
		Person o1 = new Person("Pera", "Peric");
		Person o2 = new Person("Mara", "Maric");
		database.addPerson(o1);
		database.addPerson(o2);
		
		try {
			database.saveInFile("testFile.out");
			List<Person> persons = readPersonsFromFile("testFile.out");			
			boolean isEqual = persons.get(0).equals(o1) && persons.get(1).equals(o2); 			
			assertTrue("Persons were not saved properly", isEqual);
		} catch (IOException e) {
			fail("File saving error!");
		}		
	}

	@Test
	public void method_readFromFile() {
		Person o1 = new Person("Pera", "Peric");
		Person o2 = new Person("Mara", "Maric");		
		try {
			List<Person> ucitaneOsobe =  database.readFromFile("testFile.out");
			boolean isEqual = ucitaneOsobe.get(0).equals(o1) && ucitaneOsobe.get(1).equals(o2);
			assertTrue("Osobe nisu dobro ucitane", isEqual);
		} catch (IOException e) {
			fail("Greska prilikom citanja iz fajla!");
		}
	}

	@Test
	public void method_returnPersons() {
		Person o1 = new Person("Pera", "Peric");
		Person o2 = new Person("Mara", "Maric");
		database.addPerson(o1);
		database.addPerson(o2);
		
		List<Person> persons = database.returnPersons();
		
		boolean isEqual = persons.get(0).equals(o1) && persons.get(1).equals(o2);
		assertTrue("Method does not return the expected list", isEqual);		
	}

	
	private List<Person> readPersonsFromFile(String imeFajla) throws IOException {
		List<Person> persons = new ArrayList<>();
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(imeFajla));
		
		try {
			while (true) {
				Person person = (Person) in.readObject();
				persons.add(person);
			}
		} catch(EOFException eof) { }
		  catch (ClassNotFoundException e) { }
		
		
		in.close();		
		
		return persons;
		
	}
	
}
