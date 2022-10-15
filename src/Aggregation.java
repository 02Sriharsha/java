class Address{
    String city, state, country;

    public Address(String city,String state,String country){
        this.city = city;
        this.state = state;
        this.country = country;
    }
}

class Emp{
    String name;
    int ssn;
    Address address;

    public Emp(String name, int ssn, Address address){
        this.name = name;
        this.ssn = ssn;
        this.address = address;
    }

    public void GetInfo(){
        System.out.println(name+" "+ssn+" "+(address.city+" "+address.state+" "+address.country));
    }
}


public class Aggregation {
    public static void main(String[] args) {
        Address ad1 = new Address("Mysore","karnataka","India");
        Address ad2 = new Address("Madikeri","karnataka","India");
        Emp e1 = new Emp("harsha",10819,ad1);
        Emp e2 = new Emp("harshitha",10816,ad2);
        e1.GetInfo();
        e2.GetInfo();
    }
}
