package problem2;

import java.io.IOException;

public class PersonsDatabaseCheck {

	public static void main(String[] args) {
		PersonsDatabase baza = new PersonsDatabase();

		baza.addPerson(new Person("Pera", "Peric"));
		baza.addPerson(new Person("Sara", "Saric"));
		baza.addPerson(new Person("Laza", "Lazic"));

		try {
			baza.saveInFile("database.out");
		} catch (IOException e) {
			System.out.println("Error while writing from the database!");
		}

		try {
			baza.readFromFile("database.out");
			System.out.println(baza.returnPersons());
		} catch (IOException e) {
			System.out.println("Error while reading from the database!");
		}

	}

}
