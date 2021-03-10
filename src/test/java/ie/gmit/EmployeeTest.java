package ie.gmit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

}
