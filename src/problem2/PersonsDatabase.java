package problem2;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class PersonsDatabase {
	private List<Person> persons = new ArrayList<>();

	public void addPerson(Person person) {
		persons.add(person);
	}

	public void saveInFile(String fileName) throws IOException {
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName));

		for(Person person : persons) {
			out.writeObject(person);
		}

		out.flush();
		out.close();
	}

	public List<Person> readFromFile(String fileName) throws IOException {
		persons.clear();

		ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName));

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

	public List<Person> returnPersons() {
		return persons;
	}


}
