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
