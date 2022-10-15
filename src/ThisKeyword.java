class STInfo{
    String name , course;
    int rollno;
    float fee;

    STInfo(String name,String course,int rollno){
        this.name = name;
        this.course = course;
        this.rollno = rollno;
    }

    STInfo(String name,String course,int rollno,float fee){
        this(name, course, rollno); //we can call already initialized "this." variables through this() method
        this.fee = fee;
    }

    public void GetInfo(){
        System.out.println(name+" "+rollno+" "+course+" "+fee);
    }

}

public class ThisKeyword {
    public static void main(String[] args) {
        STInfo st1 = new STInfo("harsha","CS",10819);
        STInfo st2 = new STInfo("harshitha","CS",10816,20000f);
        st1.GetInfo();
        st2.GetInfo();
    }
}
