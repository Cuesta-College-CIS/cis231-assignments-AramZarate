public class Course implements CourseActivity {

    private String cid;
    private String coursename;
    private int score;
    private String grade;
    
    public Course(String cid, String coursename, int score) {
        this.cid = cid;
        this.coursename = coursename;
        this.score = score;
        decideGrade();
    }

    //decide what grade
    @Override
    public void decideGrade() {
        if(score >= 80){
            grade = "A";
        }else if(score < 80 && score >= 60){
            grade = "B";
        }else {
            grade = "C";
        }
        
    }

    @Override
    public void printCourseinfo() {
        toString();
        
    }

    @Override
    public String toString() {
        return "Course ID\t\t" + cid + "\tName: " + coursename + "\t\tScore: " + score + "\t\tGrade " + grade;
    }
     
    
    }
