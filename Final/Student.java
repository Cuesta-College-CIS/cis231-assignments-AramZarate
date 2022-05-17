import java.util.ArrayList;

public class Student extends Person {

    private int sid;
    private int credit;
    private ArrayList<Course> clist;
    
    
    public Student(String name, String dOB, int sid, int credit, ArrayList<Course> clist) {
        super(name, dOB);
        this.sid = sid;
        this.credit = credit;
        this.clist = clist;
    }


    @Override
    void PrintPerson() {
        toString();
        
    }

    @Override
    public String toString() {

        String str = super.toString();
        str += "\nID:   " + sid + "\t\tCredits: \t" + credit + "\n";
        for (int i = 0; i < clist.size(); i++) {
            str += clist.get(i).toString()+"\n";            
        }
        return str;
    }
    
    }