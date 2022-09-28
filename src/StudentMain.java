import java.util.Scanner;

/*
Create a Student class, containing following attributes:
Name, Age, Email, Mobile, Address.

Display the following menu to user,
1. to add details of new student,
2. to display all the entered student
3. to exit
 */
public class StudentMain {
    public static void main(String[] args) {
        // menu
        // storage for storing Student object --> an array --> of type(primitive or non-primitive) Student
        //don't know --> size we don't --> we are assuming 100 student data we will get
        // max size as 100 -> the size of student array is 100
        //count of student object
        final int MAX_SIZE = 1;
        Scanner scanner = new Scanner(System.in);

        // type[] nameOfArray = new type[int size];
        Student[] students = new Student[MAX_SIZE];
        int count = 0;
        //iterative statement or loops
        //for, while , do while
        int choice;
        do {
            System.out.println("Select form following choices");
            System.out.println("press 1. to add details of new student");
            System.out.println("press 2 to display all the entered student");
            System.out.println("press 3 to exit");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1: // do it by calling a method to preform case 1
                        // do it here -- using this way
                    /*Student object = new Student();
                    System.out.println("enter name");
                    //updating the value of name

                    String name = scanner.nextLine(); //vaibhav diwan
                    object.setName(name);
                    System.out.println("enter age");
                    object.age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("enter email");
                    object.email = scanner.nextLine();
                    System.out.println("enter mobile");
                    object.mobile = scanner.nextLong();
                    scanner.nextLine();
                    System.out.println("enter address");
                    object.address = scanner.nextLine();

                    //assign the object to array
                    students[count] = object;*/
                    if (count != MAX_SIZE) {
                        students[count] = new Student();
                        //students[count].setName(scanner.nextLine());
                        //Student obj = students[count];
                        //String name = scanner.nextLine();
                        System.out.println("enter name");
                        students[count].setName(scanner.nextLine());
                        System.out.println("enter age");
                        students[count].age = scanner.nextInt();
                        scanner.nextLine();//skipping \n
                        System.out.println("enter email");
                        students[count].email = scanner.nextLine();
                        System.out.println("enter mobile");
                        students[count].mobile = scanner.nextLong();
                        scanner.nextLine();
                        System.out.println("enter address");
                        students[count].address = scanner.nextLine();
                        count++;
                    } else {
                        System.out.println("no more space to store details");
                        //System.exit(0);
                        //choice = 3;
                    }
                    break;
                case 2:
                    //display all the element of student array
                    display(students, count);
                    break;
                case 3:
                    System.out.println("exiting.....");
                    break;
                default:
                    System.out.println("enter valid choice");

            }

        } while (choice != 3);
    }

    public static void display(Student[] array, int noOfObjects) {
        for (int i = 0; i <= noOfObjects; i++) {
            Student object = array[i];
            System.out.println("object.name = " + object.getName());
            System.out.println("object.age = " + object.age);
            System.out.println("object.email = " + object.email);
            System.out.println("object.mobile = " + object.mobile);
            System.out.println("object.address = " + object.address);
        }
    }

}
