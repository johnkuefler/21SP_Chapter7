/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author johnk
 */
public class ArrayExercisesTest {

    public ArrayExercisesTest() {
    }

    @Test
    public void testArrayContainsValue_ReturnsTrue() {
        System.out.println("arrayContainsValue");
        int[] array = {1, 3, 4, 5};
        int value = 4;
        boolean expResult = true;
        boolean result = ArrayExercises.arrayContainsValue(array, value);
        assertEquals(expResult, result);
    }

    @Test
    public void testArrayContainsValue_ReturnsFalse() {
        System.out.println("arrayContainsValue");
        int[] array = {1, 3, 5};
        int value = 4;
        boolean expResult = false;
        boolean result = ArrayExercises.arrayContainsValue(array, value);
        assertEquals(expResult, result);
    }

    @Test
    public void testReverseArrayOneNumber() {
        System.out.println("reverseArray");
        int[] array = {1};
        int[] expResult = {1};
        int[] result = ArrayExercises.reverseArray(array);
        assertArrayEquals(expResult, result);
    }

    @Test
    public void testReverseArrayMultipleNumbers() {
        System.out.println("reverseArray");
        int[] array = {1, 2, 3};
        int[] expResult = {3, 2, 1};
        int[] result = ArrayExercises.reverseArray(array);
        assertArrayEquals(expResult, result);
    }

    @Test
    public void testReverseArrayMultipleNumbers2() {
        System.out.println("reverseArray");
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] expResult = {8, 7, 6, 5, 4, 3, 2, 1};
        int[] result = ArrayExercises.reverseArray(array);
        assertArrayEquals(expResult, result);
    }

    @Test
    public void testArraysAreEqual() {
        System.out.println("arraysAreEqual");
        int[] array1 = {1, 2, 3};
        int[] array2 = {1};
        boolean expResult = false;
        boolean result = ArrayExercises.arraysAreEqual(array1, array2);
        assertEquals(expResult, result);
    }

    @Test
    public void testArraysAreEqual2() {
        System.out.println("arraysAreEqual");
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 3, 2};
        boolean expResult = false;
        boolean result = ArrayExercises.arraysAreEqual(array1, array2);
        assertEquals(expResult, result);
    }

    @Test
    public void testArraysAreEqual3() {
        System.out.println("arraysAreEqual");
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        boolean expResult = true;
        boolean result = ArrayExercises.arraysAreEqual(array1, array2);
        assertEquals(expResult, result);
    }
}
