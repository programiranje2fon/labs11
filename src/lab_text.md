# Laboratory exercises – class no. 11


## Problem 1
*(to be done by the tutor together with students)*

Create public class **TextFiles** in package **problem1** that has:

1. Public static method **readAndReturnText** that reads text from the text file whose name is passed to the method as its input parameter. If an error occurs when reading content from the file, the method should throw an appropriate exception.

2. Public static method **writeText** that writes two strings, "It's a nice day today." and "Maybe the temperature is going to be above zero.", in the file whose name is provided as the method's parameter. Each string should be in a separate row.

Create public class **TextFilesCheck** in package **problem1**, which checks the methods from the **TextualFiles** class, namely reading from file **text.txt** and writing to file **text2.txt**.


## Problem 2
*(to be done by the tutor together with students)*

Create public class **Person** in package **problem2** that can be serialized and has:

1. Private attributes *name* and *surname*.

2. Public constructor that receives two input parameters (name and surname) that it uses in the respective attribute initialization.

3. Matching public get methods for the two attributes.

4. Redefine method **toString** so that it returns the values of the name and surname attributes (use an automatically generated method)

5. Redefine method **equals** using the automatically generated method

Create public class **PersonsDatabase** in package **problem2** that has:

1. Private attribute **persons** that represents a list of objects of the **Person** class. The list should be initialized right away.

2. Public method **addPerson** that receives an object of class **Person** as an argument and adds it to the list.

3. Public method **saveInFile** that writes (serializes) all persons from the group into the file whose name is provided as an input parameter. If an error occurs when saving the file, the method should throw an appropriate exception.

4. Public method **readFromFile** that reads (deserializes) all persons from a file (the name of the file is provided as the input parameter), fills the list **persons** with the read objects, and returns the list as its return value. Before deserialisation, it is necessary to clear the **persons** list. If an error occurs when reading the file, the method should throw an appropriate exception.

5. Public method **returnPersons** that returns a list of persons that are currently in the database.

Create public class **PersonsDatabaseCheck** in package **problem2** that checks the methods from the **PersonsDatabase** class: add a few persons to the database, write the corresponding objects to a file, and read the person data from the file.
