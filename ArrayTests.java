import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test 
	public void testReverseInPlace2() {
    int[] input1 = { 3, 2 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 2, 3 }, input1);
	}

  @Test 
	public void testReverseInPlace3() {
    int[] input1 = { 3, 2, 1 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 1, 2, 3 }, input1);
	}



  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed2() {
    int[] input1 = { 1, 2 };
    assertArrayEquals(new int[]{ 2, 1 }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed3() {
    int[] input1 = { 1, 2, 3 };
    assertArrayEquals(new int[]{ 3, 2, 1 }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testAverageWithoutLowes3() {
    double[] input1 = { 2, 1, 4 };
    assertEquals(3.0, ArrayExamples.averageWithoutLowest(input1), 0.000000001);
  }

  @Test
  public void testAverageWithoutLowesEmpty() {
    double[] input1 = { };
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(input1), 0.000000001);
  }

  @Test
  public void testAverageWithoutLowest1() {
    double[] input1 = { 2 };
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(input1), 0.000000001);
  }

  @Test
  public void testAverageWithoutLowestDuplicates() {
    double[] input1 = { 2, 1, 4 ,1};
    assertEquals(3.0, ArrayExamples.averageWithoutLowest(input1), 0.000000001);
  }
}
