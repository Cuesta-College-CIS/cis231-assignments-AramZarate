public abstract class Person {

    private String name;
    private String DOB;
    
    public Person(String name, String dOB) {
        this.name = name;
        this.DOB = dOB;
    }

    abstract void PrintPerson();

    @Override
    public String toString() {
        return "Name: " + name + "\t \tDOB: " + DOB;
    }
    
    
    }