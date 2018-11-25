#Laboratory exercises – class no. 11


##Problem 1
*(worked through by the TA with students' help)*

1. Create class **TextFiles** in package **problem1** that has:

2. Public static method **readString**, which reads a text from the textual file whose name is determind by the method parameter.(creating txt files in Eclipse, working with text files - BufferedReader, PrintWriter, FileReader, FileWriter, readLine...)

3. Public static method **writeText** that writes two strings, "It's a nice day today." and
"Maybe the temperature is going to be above zero.", in the file whose name is provided as the method parameter. Each string should be in its own row. (println method)

4. Create class *TextFilesCheck** in package **problem1**, which checks class' **TextualFiles** methods; reading from file **text.txt** and writing to file **text2.txt**.

##Problem 2
*(worked through by the TA with students' help)*

1. Create class **Person** in package **problem2** that can be serializedh and has: (serialization and the Serializable interface, immutable objects)

2. Private attributes name and surname.

3. A constructor that accepts parameters name and surname which it uses in the respective attribute initialization.

4. Matching public get methods for these attributes.

5. Redefine method **toString** so that it returns the values of name and surname fields (use an automatically generated method)

6. Redefine method **equals** using and automatically generated method

7. Create class **PersonsDatabase** in package **problem2** that has:

8. Private attribute **persons** that represents a list of objects of class **Person**. This list should be initialized right away.

9. Public method **addPerson** that gets an object of class **Person**  as an arguments and adds it to the list.

10. Public method **saveInFile** that writes (serializes) all persons from the group into the file whose name is provided as an input parameter. (ObjectOutputstream and writeObject, serialized files can not be manually written and read, serialization automatically saves transitively connected objects).

11. Public method **readFromFile** that reads (deserializes) all persons from the file whose name is provided as an input parameter of the method, fills the list **persons** , and returns it as the return value of the method. Before the read, it is necessary to empty **persons**. (ObjectInputStream and readObject, end of file can be detected only when EOFException is thrown, deserialization automatically reads transitively connected objects)

12. Public method **returnPersons** that returns the list of persons that are currently in the database.

13. Create class **PersonsDatabaseCheck** in package **problem2** that checks class **PersonsDatabase**; adding a few persons to the database, writing into a file, and reading from it.
