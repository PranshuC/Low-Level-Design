package interfaces;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class PasswordEncoderTest {

  @Test
  public void testPasswordEncoder() {
    PasswordEncoder encoder = new ReverseEncoder();
    String encoded = encoder.encode("password");
    assertEquals("Password should be reversed","drowssap" , encoded);
  }

  @Test
  public void testDefaultPasswordEncoder() {
    PasswordEncoder encoder = new DefaultEncoder();
    String encoded = encoder.encode("password");
    assertEquals("Password should be reversed","password" , encoded);
  }

  @Test
  public void testTwoClasses() {
    List<PasswordEncoder> encoders = List.of(new ReverseEncoder(), new DefaultEncoder());
    List<String> expected = List.of("malayalam", "malayalam");
    /*List<String> actual = new ArrayList<>();
    for( PasswordEncoder encoder : encoders) {
      actual.add(encoder.encode("malayalam"));
    }*/
    List<String> actual = encoders.stream()
        .map(encoder -> encoder.encode("malayalam"))
        .collect(Collectors.toList());
    assertArrayEquals("All encoders should return expected results", expected.toArray(),
        actual.toArray());
  }
}
