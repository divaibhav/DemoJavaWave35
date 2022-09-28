/*
Create a Student class, containing following attributes:
Name, Age, Email, Mobile, Address.

Display the following menu to user,
1. to add details of new student,
2. to display all the entered student
3. to exit
 */
public class Student {
    //ENCAPSULATED
    // BINDING OF DATA AND METHOD
    // HIDING OF DATA
    private String name;//name of variable starts with lower cases character, if more than one words
    // all consecutive words will start with uppers case
    int age;
    String email;
    long mobile;
    String address;

    //getter
    public String getName() {
        return name;
    }

    //Address address;
    //getter and setter
    // accessor and mutator
    //getter will help you in accessing private attribute or field
    //setter will help you in updating or modifying private attribute
    //setter
    // public void setAttributeName( type and name) type -> similar to data
    // type of attribute and name can be anything, convention suggest,
    // name should be same as attribute
    public void setName(String name) {
        this.name = name;
    }
}
