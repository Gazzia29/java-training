package fr.manulep.entrainement;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Array sort")
public class Series3Test {
	
	/**
	 * write selection sort
	 */
	@Test
	public void sortTabBySelection() {
		int[] arrayIn = new int[] {0,23,52,17,-5,17,15,9,16};
		int[] arrayOut = {-5,0,9,15,16,17,17,23,52};
		assertArrayEquals(arrayOut, Series3.sortTabBySelection(arrayIn));
	}
	
	/**
	 * write insertion sort
	 */
	@Test
	public void sortTabByInsertion() {
		int[] arrayIn = {0,23,52,17,-5,17,15,9,16};
		int[] arrayOut = {-5,0,9,15,16,17,17,23,52};
		assertArrayEquals(arrayOut, Series3.sortTabByInsertion(arrayIn));
	}
	
	/**
	 * write bubble sort
	 */
	@Test
	public void sortTabByBubble() {
		int[] arrayIn = new int[] {0,23,52,17,-5,17,15,9,16};
		int[] arrayOut = {-5,0,9,15,16,17,17,23,52};
		assertArrayEquals(arrayOut, Series3.sortTabByBubble(arrayIn));
	}
	
	/**
	 * write dichotomy search
	 */
	@Test
	public void findIndexByDichotomy() {
		int[] arrayIn = {-5,0,9,15,16,17,17,23,52};
		assertEquals(7, Series3.findIndexByDichotomy(23,arrayIn));
		assertEquals(1, Series3.findIndexByDichotomy(0,arrayIn));
		assertEquals(8, Series3.findIndexByDichotomy(52,arrayIn));
		assertEquals(4, Series3.findIndexByDichotomy(16,arrayIn));
		assertEquals(0, Series3.findIndexByDichotomy(-5,arrayIn));
		assertEquals(-1, Series3.findIndexByDichotomy(10,arrayIn));
	}

}
