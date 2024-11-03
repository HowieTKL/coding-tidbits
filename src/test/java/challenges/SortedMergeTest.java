package challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SortedMergeTest {

  public SortedMergeTest() {
  }

  /**
   * Test of sort method, of class SortedMerge.
   */
  @Test
  public void testSort1() {
    Comparable[] a = new Integer[]{1, 3};
    Comparable[] b = new Integer[]{2, 4};
    SortedMerge instance = new SortedMerge();
    Comparable[] expResult = new Integer[]{1, 2, 3, 4};
    Comparable[] result = instance.sort(a, b);
    assertArrayEquals(expResult, result);
  }
  
  @Test
  public void testSort2() {
    Comparable[] a = new Integer[]{1, 9};
    Comparable[] b = new Integer[]{5, 6, 10};
    SortedMerge instance = new SortedMerge();
    Comparable[] expResult = new Integer[]{1, 5, 6, 9, 10};
    Comparable[] result = instance.sort(a, b);
    assertArrayEquals(expResult, result);
  }

  @Test
  public void testSort3() {
    Comparable[] a = new Integer[]{1, 9, 22};
    Comparable[] b = new Integer[]{5, 6};
    SortedMerge instance = new SortedMerge();
    Comparable[] expResult = new Integer[]{1, 5, 6, 9, 22};
    Comparable[] result = instance.sort(a, b);
    assertArrayEquals(expResult, result);
  }
 
  @Test
  public void testSortEmpty() {
    Comparable[] a = new Integer[]{};
    Comparable[] b = new Integer[]{};
    SortedMerge instance = new SortedMerge();
    Comparable[] expResult = new Integer[]{};
    Comparable[] result = instance.sort(a, b);
    assertArrayEquals(expResult, result);
  }
  
}
