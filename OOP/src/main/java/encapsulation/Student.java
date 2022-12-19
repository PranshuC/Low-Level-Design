package encapsulation;

import inheritance.User;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
public class Student extends User {

  private String batchName;
  private Double psp;
  private StudentStatus status = StudentStatus.ACTIVE;

  // Parameterized Constructor
  public Student(String name, String email, String batchName, Double psp, StudentStatus status) {
    super(name, email);
    if(psp > 100 || psp < 0) {
      throw new IllegalArgumentException("PSP should be between 0 and 100");
    }
    this.batchName = batchName;
    this.psp = psp;
    this.status = status;
  }


  public StudentStatus changeStatus(StudentStatus newStatus) {
    // Except DONE, change status
    if (this.status != StudentStatus.DONE) {
      this.status = newStatus;
    }
    return this.status;
  }

}
