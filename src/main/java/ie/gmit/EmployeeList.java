package ie.gmit;

import java.util.ArrayList;

public class EmployeeList {

    private ArrayList<Employee> employeeArrayList = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employeeArrayList.add(employee);
    }

    public void deleteEmployee(String name) {
        int initialSize = employeeArrayList.size(), endSize;
        for(int i = 0; i < employeeArrayList.size(); i++) {
            if (employeeArrayList.get(i).getName() == name) {
                Employee employee = employeeArrayList.get(i);
                employeeArrayList.remove(employee);
            }
        }
        endSize = employeeArrayList.size();
        if(initialSize == endSize)
            throw new IllegalArgumentException("No Employee found with name provided");
    }

    public int employeeArrayListSize() {
        return employeeArrayList.size();
    }
}
