package abstractclass;

import lombok.AllArgsConstructor;

// Step 1 - Add abstract to class declaration
@AllArgsConstructor
public abstract class PasswordEncoder {

  // Step 2 - Add state
  private String publicKey;
  // static field, 1 value exists for all instances of this class
  public static String KEY_PREFIX = "PUBLIC";
  // final - Constant fields - Snake case in caps
  public static final String PRIVATE_KEY_PREFIX = "PRIVATE";

  // Step 3 - Add methods with implementation
  public String getPublicKey() {
    // Static method call from non-static method allowed
    printKeyPrefix();
    return publicKey;
  }

  // Step 4 - Declare methods without implementation as abstract
  public abstract String encode (String password);

  public static void printKeyPrefix() {
    System.out.println(KEY_PREFIX);
    // Non-static method call from static method not allowed
    // System.out.println(getPublicKey());
  }
}
