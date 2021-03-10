/* Darragh Fahey
 * G00352047@gmit.ie
 * 10 MAR 2021
 */
package ie.gmit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EmployeeTest {
    private static String fullTime = "Full-time", partTime = "Part-time";
    Employee employee;

    @BeforeEach
    public void setUp() {
        employee = new Employee();
    }

    @Test
    public void testDefaultEmployee() {
        assertEquals("Mr", employee.getTitle());
        assertEquals("Joe Blogs", employee.getName());
        assertEquals("123456", employee.getPPSID());
        assertEquals("0123456", employee.getPhone());
        assertEquals("Full-time", employee.getEmploymentType());
        assertEquals(35, employee.getAge());
    }


    @Test
    public void testValidEmployee() {
        employee = new Employee("Miss", "Regina Tower", "987654", "9123456", partTime, 18);
        assertEquals("Miss", employee.getTitle());
        assertEquals("Regina Tower", employee.getName());
        assertEquals("987654", employee.getPPSID());
        assertEquals("9123456", employee.getPhone());
        assertEquals(partTime, employee.getEmploymentType());
        assertEquals(18, employee.getAge());
    }

    @Test
    public void testEmployeeWithInvalidTitleValues() {
        Exception e = assertThrows(IllegalArgumentException.class, ()->{new Employee("Master", "Joe Bloggs", "123456", "0123456", fullTime, 35);});
        assertEquals("Not a valid Title", e.getMessage());
    }

    @Test
    public void testEmployeeWithInvalidNameValues() {
        Exception e = assertThrows(IllegalArgumentException.class, ()->{new Employee("Mrs", "Joe", "12345", "0123456", fullTime, 35);});
        assertEquals("Name provided is not valid", e.getMessage());

        e = assertThrows(IllegalArgumentException.class, ()->{new Employee("Mr", "Honorificabilitudinitatibus", "12345", "0123456", fullTime, 35);});
        assertEquals("Name provided is not valid", e.getMessage());
    }

    @Test
    public void testEmployeeWithInvalidPPSIDValues() {
        Exception e = assertThrows(IllegalArgumentException.class, ()->{new Employee("Miss", "Joe Bloggs", "12345", "0123456", fullTime, 35);});
        assertEquals("Employee PPS should be 6 characters", e.getMessage());

        e = assertThrows(IllegalArgumentException.class, ()->{new Employee("Mr", "Joe Bloggs", "1234567", "0123456", fullTime, 35);});
        assertEquals("Employee PPS should be 6 characters", e.getMessage());
    }

    @Test
    public void testEmployeeWithInvalidPhoneNumberValues() {
        Exception e = assertThrows(IllegalArgumentException.class, ()->{new Employee("Mr", "Joe Bloggs", "123456", "012345", fullTime, 35);});
        assertEquals("Employee phone number should be 7 numbers", e.getMessage());

        e = assertThrows(IllegalArgumentException.class, ()->{new Employee("Mr", "Joe Bloggs", "123456", "01234567", fullTime, 35);});
        assertEquals("Employee phone number should be 7 numbers", e.getMessage());
    }

    @Test
    public void testEmployeeWithInvalidEmploymentValues() {
        Exception e = assertThrows(IllegalArgumentException.class, ()->{new Employee("Mr", "Joe Bloggs", "123456", "0123456", "Part", 35);});
        assertEquals("Employee should be Full-time or Part-time", e.getMessage());
    }

    @Test
    public void testEmployeeWithInvalidAgeValues() {
        Exception e = assertThrows(IllegalArgumentException.class, ()->{new Employee("Mr", "Joe Bloggs", "123456", "0123456", fullTime, 15);});
        assertEquals("Employee age must be over 18", e.getMessage());
    }

}
