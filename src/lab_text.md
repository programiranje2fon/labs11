#Laboratory exercises – class no. 11


##Problem 1
*(worked through by the TA with students' help)*

Create public class **TextFiles** in package **problem1** that has:

1. Public static method **readAndReturnText**, which reads a text from the text file whose name is given by the method parameter. If an error occurs when reading content from the keyboard, the method should throw an appropriate exception.

2. Public static method **writeText** that writes two strings, "It's a nice day today." and
"Maybe the temperature is going to be above zero.", in the file whose name is provided as the method parameter. Each string should be in its own row.

3. Create public class *TextFilesCheck** in package **problem1**, which checks class' **TextualFiles** methods; reading from file **text.txt** and writing to file **text2.txt**.

##Problem 2
*(worked through by the TA with students' help)*

Create public class **Person** in package **problem2** that can be serialized and has:

1. Private attributes name and surname.

2. Public constructor that accepts parameters name and surname which it uses in the respective attribute initialization.

3. Matching public get methods for these attributes.

4. Redefine method **toString** so that it returns the values of name and surname fields (use an automatically generated method)

5. Redefine method **equals** using and automatically generated method

Create public class **PersonsDatabase** in package **problem2** that has:

1. Private attribute **persons** that represents a list of objects of class **Person**. This list should be initialized right away.

2. Public method **addPerson** that gets an object of class **Person**  as an arguments and adds it to the list.

3. Public method **saveInFile** that writes (serializes) all persons from the group into the file whose name is provided as an input parameter. If an error occurs when saving the file, the method should throw an appropriate exception.

4. Public method **readFromFile** that reads (deserializes) all persons from the file whose name is provided as an input parameter of the method, fills the list **persons** , and returns it as the return value of the method. Before the read, it is necessary to empty **persons**. If an error occurs when reading the file, the method should throw an appropriate exception.

5. Public method **returnPersons** that returns the list of persons that are currently in the database.

Create public class **PersonsDatabaseCheck** in package **problem2** that checks class **PersonsDatabase**; adding a few persons to the database, writing into a file, and reading from it.
