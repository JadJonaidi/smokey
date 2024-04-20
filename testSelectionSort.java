package Package1;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class testSelectionSort {
	
    @Test
    public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 5;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = 5;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;
        
        SelectionSort sorter = new SelectionSort();
        arr = sorter.basicSelectionSort(arr);
        
    	assertArrayEquals(Sortedarr, arr);

        /* add tests to check for this unit test */
    }
    @Test
    public void testNegative(){
        
        int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = -9;
        arr[2] = -7;
        arr[3] = -11;
        arr[4] = -2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = -11;
        Sortedarr[1] = -9;
        Sortedarr[2] = -8;
        Sortedarr[3] = -7;
        Sortedarr[4] = -2;
        SelectionSort sorter = new SelectionSort();
        arr = sorter.basicSelectionSort(arr);
        
    	assertArrayEquals(Sortedarr, arr);

    }
    @Test
    public void testMixed(){
        
        int[] arr = new int[5];
        arr[0] = -11;
        arr[1] = 9;
        arr[2] = -7;
        arr[3] = 10;
        arr[4] = -3;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = -11;
        Sortedarr[1] = -7;
        Sortedarr[2] = -3;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;
        SelectionSort sorter = new SelectionSort();
        arr = sorter.basicSelectionSort(arr);
        
    	assertArrayEquals(Sortedarr, arr);

    }
    @Test
    public void testDuplicates(){
        
        int[] arr = new int[5];
        arr[0] = 6;
        arr[1] = 6;
        arr[2] = 6;
        arr[3] = 10;
        arr[4] = 2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 6;
        Sortedarr[2] = 6;
        Sortedarr[3] = 6;
        Sortedarr[4] = 10;
        SelectionSort sorter = new SelectionSort();
        arr = sorter.basicSelectionSort(arr);
        
    	assertArrayEquals(Sortedarr, arr);

    }


}
