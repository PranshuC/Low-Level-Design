package encapsulation;

import inheritance.Mentor;
import inheritance.User;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class StudentTest {

  @Test(expected = IllegalArgumentException.class)
  public void testInvalidPSP() {
    new Student("Sherlock", "sh@uk.com", "Detective", 102.0, StudentStatus.ACTIVE);
  }

  @Test
  public void testChildClass() {
    User mentor = new Mentor("Sherlock", "sherlock@in", 1.0);
    assertEquals("Parent variable not set using super in child", "Sherlock", mentor.getName());
  }

  /*@Test
  public void testStudentInstance() {
    Student student = new Student(); // Default constructor - no arguments
    assertNotNull("If default constructor is called, instance must not be null", student);
    assertNull("If default constructor is called, name must be null", student.getName());
    assertEquals("If default constructor is called, status must be ACTIVE", StudentStatus.ACTIVE,
        student.getStatus());
  }*/
}
