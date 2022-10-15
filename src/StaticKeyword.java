class StudentInfo{
    String name;
    int rollno;
    static String college = "CPC";

    public StudentInfo(String name,int rollno){
        this.name = name;
        this.rollno = rollno;
    }

    public void getInfo(){
        System.out.println("Name : "+name+" Roll.No : "+rollno+" College : "+college);
    }
}

public class StaticKeyword {
    public static void main(String[] args) {
        StudentInfo st1 = new StudentInfo("harsha",10819);
        StudentInfo st2 = new StudentInfo("harshitha",10816);
        st1.getInfo();
        st2.getInfo();
    }
}
