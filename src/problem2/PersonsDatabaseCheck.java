package problem2;

import java.io.IOException;

public class PersonsDatabaseCheck {

	public static void main(String[] args) {
		PersonsDatabase database = new PersonsDatabase();

		database.addPerson(new Person("Pera", "Peric"));
		database.addPerson(new Person("Sara", "Saric"));
		database.addPerson(new Person("Laza", "Lazic"));
		database.addPerson(new Person("Milan", "Tosic"));

		try {
			database.saveInFile("database.out");
		} catch (IOException e) {
			System.out.println("Error while writing from the database!");
		}

		try {
			database.readFromFile("database.out");
			System.out.println(database.returnPersons());
		} catch (IOException e) {
			System.out.println("Error while reading from the database!");
		}
		
		database.findPersons("Pera", "Tosic");

	}

}
