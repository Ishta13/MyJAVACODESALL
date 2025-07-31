import java.util.*;

public class OopsDeepCopy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creating the first student object
        Student amit = new Student();
        amit.classname = "A";
        amit.classno = 8;

        // Taking input for marks
        System.out.println("Enter marks of Amit:");
        for (int i = 0; i < amit.marks.length; i++) {
            amit.marks[i] = sc.nextInt();  // Assigning values directly to Amit's marks array
        }

        // Creating a deep copy of Amit
        Student sumit = new Student(amit);

        // Display Sumit's copied marks
        System.out.println("Sumit's copied marks:");
        for (int i = 0; i < sumit.marks.length; i++) {
            System.out.println(sumit.marks[i]);
        }

        // Displaying Sumit's class details
        System.out.println("Sumit's class number: " + sumit.classno);
        System.out.println("Sumit's class name: " + sumit.classname);

        // Modifying Amit's marks to check if Sumit's marks remain unchanged (Deep Copy Validation)
        amit.marks[0] = 78;
        System.out.println("modified amit's marks : ");
        for(int i=0;i<4;i++)
        {
            System.out.println(amit.marks[i]);
        }

        System.out.println("Sumit's marks after changing Amit's marks:");
        for (int i = 0; i < sumit.marks.length; i++) {
            System.out.println(sumit.marks[i]);
        }

        sc.close();
    }
}

// Student class
class Student {
    int[] marks;  // Declaring an array reference
    String classname;
    int classno;

    // Default constructor
    Student() {
        marks = new int[4];  // Initializing marks array
    }

    // Copy constructor (Deep Copy)
    Student(Student amit) {
        this.classname = amit.classname;
        this.classno = amit.classno;
        this.marks = new int[4]; // Initializing marks array for deep copy
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = amit.marks[i]; // Deep copy (element-wise copy)
        }
    }
}
