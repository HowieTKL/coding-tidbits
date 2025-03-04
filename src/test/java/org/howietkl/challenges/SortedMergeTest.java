package org.howietkl.challenges;

import org.howietkl.challenges.SortedMerge;
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
    Integer[] a = new Integer[]{1, 3};
    Integer[] b = new Integer[]{2, 4};
    SortedMerge<Integer> instance = new SortedMerge<>();
    Integer[] expResult = new Integer[]{1, 2, 3, 4};
    Integer[] result = instance.sort(a, b);
    assertArrayEquals(expResult, result);
  }
  
  @Test
  public void testSort2() {
    Integer[] a = new Integer[]{1, 9};
    Integer[] b = new Integer[]{5, 6, 10};
    SortedMerge<Integer> instance = new SortedMerge<>();
    Integer[] expResult = new Integer[]{1, 5, 6, 9, 10};
    Integer[] result = instance.sort(a, b);
    assertArrayEquals(expResult, result);
  }

  @Test
  public void testSort3() {
    Integer[] a = new Integer[]{1, 9, 22};
    Integer[] b = new Integer[]{5, 6};
    SortedMerge<Integer> instance = new SortedMerge<>();
    Integer[] expResult = new Integer[]{1, 5, 6, 9, 22};
    Integer[] result = instance.sort(a, b);
    assertArrayEquals(expResult, result);
  }
 
  @Test
  public void testSortEmpty() {
    Integer[] a = new Integer[]{};
    Integer[] b = new Integer[]{};
    SortedMerge<Integer> instance = new SortedMerge<>();
    Integer[] expResult = new Integer[]{};
    Integer[] result = instance.sort(a, b);
    assertArrayEquals(expResult, result);
  }
  
}
