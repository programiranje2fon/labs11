package problem2;

import static org.junit.Assert.*;

import java.io.EOFException;
import java.io.File;
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

	private PersonsDatabase database;

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
		database.addPerson(o1);
		database.addPerson(o2);
		try {
			List<Person> ucitaneOsobe = database.readFromFile("testFile.out");
			boolean isEqual = ucitaneOsobe.get(0).equals(o1) && ucitaneOsobe.get(1).equals(o2);
			assertTrue("Returned persons are not the same (equal) to the ones added to the list", isEqual);
		} catch (IOException e) {
			fail("Error reading the file!");
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

	@Test
	public void method_findPersons() {
		Person o1 = new Person("Pera", "Peric");
		Person o2 = new Person("Mara", "Maric");
		Person o3 = new Person("Dragan", "Djuric");
		Person o4 = new Person("Bojan", "Tomic");
		database.addPerson(o1);
		database.addPerson(o2);
		database.addPerson(o3);
		database.addPerson(o4);

		database.findPersons("Pera", "Tomic");

		PersonsDatabase database2 = new PersonsDatabase();
		try {
			database2.readFromFile("results.ser");
			List<Person> persons2 = database2.returnPersons();

			boolean areEqual = persons2.get(0).equals(o1) && persons2.get(1).equals(o4) && persons2.size() == 2;
			assertTrue("Method does not return the expected list of persons", areEqual);
			
			// delete the file
			File file = new File("results.ser");
			file.delete();
		} catch (IOException e) {
			fail("Error reading persons from the file!");
		}
	}

	private List<Person> readPersonsFromFile(String imeFajla) throws IOException {
		List<Person> persons = new ArrayList<>();

		ObjectInputStream in = new ObjectInputStream(new FileInputStream(imeFajla));

		try {
			while (true) {
				Person person = (Person) in.readObject();
				persons.add(person);
			}
		} catch (EOFException eof) {
		} catch (ClassNotFoundException e) {
		}

		in.close();

		return persons;
	}

}
