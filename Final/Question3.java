import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Question3 {

    public static ArrayList<Student> fillupStudent() throws FileNotFoundException {
    
     
    
    ArrayList<Student> slist = new ArrayList<Student>();
    
    ArrayList<Course> course_1 = new ArrayList<>();
    course_1.add(new Course("CIS01", "C++", 90));
    course_1.add(new Course("CIS02", "Python", 80));
    course_1.add(new Course("CIS03", "Java", 90));
    slist.add(new Student("John", "03/01/2002", 1001, 9,course_1 ));


    ArrayList<Course> course_2 = new ArrayList<>();
    course_2.add(new Course("CIS01", "C++", 100));
    course_2.add(new Course("CIS02", "Python", 100));
    course_2.add(new Course("CIS232", "Java2", 90));
    course_2.add(new Course("CNT02", "Cisco", 80));
    slist.add(new Student("Kurt", "05/01/2002", 1002, 12, course_2));
    
    ArrayList<Course> course_3 = new ArrayList<>();
    course_3.add(new Course("CIS01", "C++", 100));
    course_3.add(new Course("CIS232", "Java2", 90));
    slist.add(new Student("Kim", "01/01/1990", 1003, 6, course_3));
    return slist;
    
    }
    
     
    
    public static void printStudent(ArrayList<Student> slist) {
    
    for (int i = 0; i < slist.size(); i++) {
    
    System.out.println(slist.get(i));
    
    }
    
    
    }
    
     
    
    public static void main(String[] args) throws FileNotFoundException {
    
    ArrayList<Student> slist;
    
    slist = fillupStudent();
    
    printStudent(slist);

    
    }
    
}