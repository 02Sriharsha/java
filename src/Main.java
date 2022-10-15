class student{
    String name;
    int rollno;

    student(String name,int rollno){
        this.name = name;
        this.rollno = rollno;
    }

    void getData(){
        System.out.println("The student name is : "+this.name);
        System.out.println(" The student roll number is : "+this.rollno);
    }
}

public class Main{
    public static void main(String[] args) {
        student s = new student("harsha",10819);
        s.getData();
    }
}



