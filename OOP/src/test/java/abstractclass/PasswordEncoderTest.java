package abstractclass;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PasswordEncoderTest {

  @Test
  public void testEncoder() {
    PasswordEncoder encoder = new SubStringEncoder("public");
    String encoded = encoder.encode("abc");
    assertEquals("String appended with public key should be returned", "abpublic", encoded);
  }

  @Test
  public void testStatic() {
    PasswordEncoder encoder1 = new SubStringEncoder("public");
    // Warning use : PasswordEncoder.KEY_PREFIX
    encoder1.KEY_PREFIX = "PUBLIC_01";
    PasswordEncoder encoder2 = new SubStringEncoder("public");
    encoder2.KEY_PREFIX = "PUBLIC_02";
    // Change in static field value for 1 instance, reflects for all
    System.out.println(encoder1.KEY_PREFIX + " " + encoder2.KEY_PREFIX);

    // No changes allowed to final fields whatsoever
    // PasswordEncoder.PRIVATE_KEY_PREFIX = "NEW_PRIVATE";
    System.out.println(PasswordEncoder.PRIVATE_KEY_PREFIX);

    // Static methods accesses via class reference, not instance of class
    PasswordEncoder.printKeyPrefix();
  }
}
