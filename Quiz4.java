import java.util.ArrayList;

public class Quiz4 {

    public static ArrayList<Student> fillupStudent() {

       
        int numberOfClasses;

        ArrayList<Student> slist = new ArrayList<Student>();
       
        numberOfClasses = 3;
        //adding student 1
        ArrayList<Course> courseList1 = new ArrayList<Course>();
        courseList1.add(new Course("CIS01", "C++", 3, "A+"));
        courseList1.add(new Course("CIS02", "Python", 3, "A0"));
        courseList1.add(new Course("CIS231", "Java", 3, "A+"));
        slist.add(new Student(1001, "John", courseList1, numberOfClasses));


        //adding student 2 
        ArrayList<Course> courseList2 = new ArrayList<Course>();
        
        numberOfClasses = 4;
        courseList2.add(new Course("CIS01", "C++", 3, "A0"));
        courseList2.add(new Course("CIS02", "Python", 3, "A0"));
        courseList2.add(new Course("CIS232", "Java2", 3, "A+"));
        courseList2.add(new Course("CNT02", "Cisco", 3, "A0"));
        slist.add(new Student(1002, "Kurt", courseList2, numberOfClasses));

        //adding student 3
        ArrayList<Course> courseList3 = new ArrayList<Course>();
        
        numberOfClasses = 2;
        courseList3.add(new Course("CIS01", "C++", 3, "A0"));
        courseList3.add(new Course("CIS232", "Java2", 3, "A+"));
        slist.add(new Student(1003, "Kim", courseList3, numberOfClasses));

        return slist;
    }

//print student info
    public static void printStudent(ArrayList<Student> slist) {

        for (int i = 0;i<slist.size();i++){
            System.out.println(slist.get(i).toString());
        }

    }


    public static void printStudent(ArrayList<Student> slist, Integer id) {
        for (Student student : slist) {
            if ((int) student.sid == (int) id) {
                System.out.println(student);
                break;
            }
        }
    }

//Find the student who has the greatest total credits.
    public static Integer findStudent(ArrayList<Student> slist) {

        int max = Integer.MIN_VALUE;
        int id = 0;

        for (Student student : slist) {
            int total = student.getTotalCredits();
            if (total > max) {
                max = total;
                id = student.sid;
            }
        }
        return id;
    }
//calls methods to print student info and student with greatest credits
    public static void main(String[] args) {

        Integer sid;

        ArrayList<Student> slist = fillupStudent();

        printStudent(slist);

        sid = findStudent(slist);

        System.out.println("The student with the greatest credits: ");
        printStudent(slist, sid);
    }

}

class Student {

    Integer sid;
    String sname;
    ArrayList<Course> clist;

    int numberOfClasses;

    public Student(Integer id, String name, ArrayList<Course> list) {
        sid = id;
        sname = name;
        clist = list;
    }

    public Student(Integer id, String name, ArrayList<Course> list, int numOfClasses) {
        sid = id;
        sname = name;
        clist = list;
        numberOfClasses = numOfClasses;
    }
    
// to get the total credits for a student object
    public Integer getTotalCredits() {
        int total = 0;

        for (int i = 0; i < numberOfClasses; i++) {
            total = total + clist.get(i).credit;
        }


        return total;
    }

//print Student Object
    public String toString() {
        String s = "Student: " + sid + " " + sname;

        for (int i = 0; i < numberOfClasses; i++) {
            s += "\n\t" + clist.get(i).toString();   //toString method of Course class will be called here
        }

        s += "\n Total credits: " + getTotalCredits() + "\n";
        return s;
    }
}

class Course {

    String cid;
    String cname;
    Integer credit;
    String grade;

    public Course(String id, String name, Integer c, String g) {
        cid = id;
        cname = name;
        credit = c;
        grade = g;
    }
//print the course object
    public String toString() {
        return "Course: " + cid + " " + cname + " " + credit + " " + grade;
    }
}