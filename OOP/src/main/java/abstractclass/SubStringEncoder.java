package abstractclass;

// Abstract classes are extended, not implemented
public class SubStringEncoder extends PasswordEncoder {

  // Abstract class' constructor always implemented by child class
  public SubStringEncoder(String publicKey) {
    super(publicKey);
  }

  @Override
  public String encode(String password) {
    return password.substring(0, 2) + getPublicKey();
  }
}
