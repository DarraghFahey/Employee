/* Darragh Fahey
 * G00352047@gmit.ie
 * 10 MAR 2021
 */
package ie.gmit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EmployeeListTest {
    EmployeeList employeeList = new EmployeeList();

    @Test
    public void testAddEmployee() {
        Employee employee = new Employee();
        employeeList.addEmployee(employee);
        assertEquals(1, employeeList.employeeArrayListSize());
    }

    @Test
    public void testAddInvalidEmployee() {
        Exception e = assertThrows(IllegalArgumentException.class, ()->{new Employee("Master", "Joe Bloggs", "123456", "0123456", "Full-Time", 35);});
        assertEquals("Not a valid Title", e.getMessage());
        assertEquals(0, employeeList.employeeArrayListSize());
    }

    @Test void testRemoveEmployee() {
        Employee employee = new Employee();
        employeeList.addEmployee(employee);
        assertEquals(1, employeeList.employeeArrayListSize());
        employeeList.deleteEmployee("Joe Blogs");
        assertEquals(0, employeeList.employeeArrayListSize());
    }

    @Test
    void testFindEmployeeNotFound() {
        Employee employee = new Employee();
        employeeList.addEmployee(employee);
        Exception e = assertThrows(IllegalArgumentException.class, ()->{new EmployeeList().deleteEmployee("Jerry Blogs");});
        assertEquals("No Employee found with name provided", e.getMessage());
    }
}
