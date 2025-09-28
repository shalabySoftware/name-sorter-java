Name Sorter

A simple Java console program that sorts a list of names by last name, then by given names.


Problem Statement

Given a file of names, the program sorts them:

First by last name

Then by any given names

Supports names with 1–3 given names


Project Structure

NameSorter.java → main program

NameSorterTest.java → unit test using JUnit 4

unsorted-names-list.txt → sample input file

junit-4.13.2.jar & hamcrest-core-1.3.jar → JUnit libraries for testing

README.md → this file


Run the Program

Compile the main program:
javac NameSorter.java

Run the program:
java NameSorter unsorted-names-list.txt

Output will be printed to the console

A file sorted-names-list.txt will also be created/overwritten with the sorted names

Example Run

Input (unsorted-names-list.txt):
Janet Parsons
Vaughn Lewis
Adonis Julius Archer
Shelby Nathan Yoder

Console output:
Adonis Julius Archer
Vaughn Lewis
Janet Parsons
Shelby Nathan Yoder

sorted-names-list.txt will contain the same sorted list.


Running Unit Tests

Requirements: JUnit 4.13.2 and Hamcrest 1.3 jar files in the same folder as .java files.

Compile the tests:
javac -cp ".;junit-4.13.2.jar;hamcrest-core-1.3.jar" NameSorterTest.java

Run the tests:
java -cp ".;junit-4.13.2.jar;hamcrest-core-1.3.jar" org.junit.runner.JUnitCore NameSorterTest

Expected output:
OK (1 test)


Notes

No package declarations used for simplicity

Handles names with 1–3 given names

Overwrites sorted-names-list.txt if it already exists

Reviewer only needs Java 8+ to compile and run