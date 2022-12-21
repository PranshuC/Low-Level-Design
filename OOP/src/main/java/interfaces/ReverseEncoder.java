package interfaces;

public class ReverseEncoder implements PasswordEncoder {

  @Override
  public String encode(String password)  {
    // Reverse the password
    StringBuilder sb = new StringBuilder(password);
    return sb.reverse().toString();
  }
}
