public class Copyconstructors {
    public static void main(String[] args) {
        Student s1 = new Student();        // always create first from which you want to copy
        s1.rollno = 1234;
        s1.name = "asmit";
        s1.marks[0] = 10;
        s1.marks[1] = 9;
        s1.marks[2] = 10;
        Student s2= new Student(s1);
        s2.pass = "qwerty";
        System.out.println(s2.pass);
        System.out.println(s2.rollno);  
        System.out.println("array");    //copy s1 
        //s1.marks[2] = 9;
        for (int i=0;i<3;i++)
        {
            System.out.println(s2.marks[i]);
        }
        System.out.println("@@@@@");
        s1.marks[1] = 8;              // even after changes call by reference so it makes change even in 
        for (int i=0;i<3;i++)
        {
            System.out.println(s2.marks[i]);     // if s2.marks then gives address 
        }

    }
    
}

class Student 
{
    int rollno;
    String name;
    String pass;
    int marks[] = new int[3]; 
    //int marks;      can take here or above
    Student()
    {

    }

     Student(Student s1)      // for copying
    {
        // this.marks= new int[3];
        this.rollno = s1.rollno;
        this.name = s1.name;
        this.marks = s1.marks;
    }
}
