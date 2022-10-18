import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.*;


public class ListTests {
    @Test 
    public void testFilter() {
    List<String> test = new ArrayList<>();
    StringCheck check = new StringCheck();
    test.add("hello");
    test.add("");
    test.add("bits");
    List<String> expectedTest = new ArrayList<>();
    expectedTest.add("hello");
    expectedTest.add("bits");
    assertEquals(expectedTest.toString() , ListExamples.filter(test, check).toString());
  }
}
