
import java.util.*;

public class OopsDeepCopyUserInputArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of marks:"); //pahle liya taaki size pehle hi define ho jaaye vrna error
        int n = sc.nextInt();
        
        Student amit = new Student(n); // Initialize the Student with the size of marks
        amit.classname = "A";
        amit.classno = 8;

        System.out.println("Enter marks of Amit:");
        for (int i = 0; i < n; i++) {
            amit.marks[i] = sc.nextInt(); // Taking input for Amit's marks
        }

        Student sumit = new Student(amit); // Create a deep copy of Amit

        System.out.println("Sumit's marks after copying Amit's marks:");
        for (int i = 0; i < n; i++) {
            System.out.println(sumit.marks[i]); // Display Sumit's marks
        }

        System.out.println("Sumit's classno: " + sumit.classno);
        System.out.println("Sumit's classname: " + sumit.classname);

        amit.marks[0] = 78; // Change Amit's marks
        System.out.println("Sumit's marks after changing Amit's marks:");
        for (int i = 0; i < n; i++) { // Verify that Sumit's marks remain unchanged
            System.out.println(sumit.marks[i]);
        }

        sc.close();
    }
}

class Student {
    String classname;
    int classno;
    int[] marks; // Declare marks as an array

    // Constructor to initialize the marks array
    Student(int n) {
        this.marks = new int[n]; // Initialize the marks array with size n
    }

    // Copy constructor for deep copy
    Student(Student amit) {
        this.classname = amit.classname;
        this.classno = amit.classno;
        this.marks = new int[amit.marks.length]; // Allocate new array for deep copy
        for (int i = 0; i < amit.marks.length; i++) {
            this.marks[i] = amit.marks[i]; // Deep copy of marks
        }
    }
}
 