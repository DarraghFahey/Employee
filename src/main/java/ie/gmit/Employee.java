package ie.gmit;

public class Employee {

    private String title, name, ppsID, phone, employmentType;
    private int age;

    public Employee() {
        this.title = "Mr";
        this.name  = "Joe Blogs";
        this.ppsID = "123456";
        this.phone = "0123456";
        this.employmentType = "Full-time";
        this.age = 35;
    }

    public Employee(String t, String n, String pID, String pN, String e, int a) {
        if(t != "Mr" && t != "Mrs" && t != "Miss")
            throw new IllegalArgumentException("Not a valid Title");
        if(n.length() < 5 || n.length() > 22)
            throw new IllegalArgumentException("Name provided is not valid");
        if(pID.length() != 6)
            throw new IllegalArgumentException("Employee PPS should be 6 characters");
        if(pN.length() != 7)
            throw new IllegalArgumentException("Employee phone number should be 7 numbers");
        if(e != "Full-time" && e != "Part-time")
            throw new IllegalArgumentException("Employee should be Full-time or Part-time");
        if(a < 18)
            throw new IllegalArgumentException("Employee age must be over 18");
        else {
            this.title = t;
            this.name  = n;
            this.ppsID = pID;
            this.phone = pN;
            this.employmentType = e;
            this.age = a;
        }
    }

    public String getTitle() {
        return title;
    }

    public String getName() {
        return name;
    }

    public String getPPSID() {
        return ppsID;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmploymentType() {
        return employmentType;
    }

    public int getAge() {
        return age;
    }
}
