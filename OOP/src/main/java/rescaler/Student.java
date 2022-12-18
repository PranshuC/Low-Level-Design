package rescaler;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class Student {

  private String name;
  private String email;
  private String batchName;
  private Double psp;
  private StudentStatus status = StudentStatus.ACTIVE;

  public Student(String name, String email, String batchName, Double psp, StudentStatus status) {
    if(psp > 100 || psp < 0) {
      throw new IllegalArgumentException("PSP should be between 0 and 100");
    }
    this.name = name;
    this.email = email;
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
