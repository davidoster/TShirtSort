/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tshirtsort;

import java.util.List;
import tshirtsort.factories.TShirtFactory;
import tshirtsort.models.TShirt;
import tshirtsort.sorting.BubbleSort;
import tshirtsort.sorting.QuickSort;

/**
 *
 * @author mac
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TShirtFactory tFactory = new TShirtFactory();
        List<TShirt> shirts = tFactory.tShirtGenerateX(3);
        QuickSort qs = new QuickSort();
        BubbleSort bs = new BubbleSort();
        // BucketSort bus = new BucketSort();

        for (TShirt shirt : shirts) {
            System.out.println(shirt);
        }
        performQuickSort(qs, shirts);
        performBubbleSort(bs, shirts);
        
        
        
        

    }
    
    public static void performQuickSort(QuickSort qs, List<TShirt> shirts) {
        quickSort(qs, shirts, true, 1); // Size ASC
        quickSort(qs, shirts, false, 1); // Size DESC
        
        quickSort(qs, shirts, true, 2); // Color ASC
        quickSort(qs, shirts, false, 2); // Color DESC
        
        quickSort(qs, shirts, true, 3); // Fabric ASC
        quickSort(qs, shirts, false, 3); // Fabric DESC

    }
    
    public static void performBubbleSort(BubbleSort bs, List<TShirt> shirts) {
        bubbleSort(bs, shirts, true, 1);
        bubbleSort(bs, shirts, false, 1);
        
        bubbleSort(bs, shirts, true, 2); 
        bubbleSort(bs, shirts, false, 2);
        
        bubbleSort(bs, shirts, true, 3);
        bubbleSort(bs, shirts, false, 3);
    }
    
    // quicksort
    private static void quickSort(QuickSort qs, List<TShirt> shirts, boolean sortType, int sortByProperty) {
        System.out.println("/// --------- ///");
        long startTime = 0;
        long endTime = 0;
        switch (sortByProperty) {
            // Size - 1
            case 1:
                startTime = System.currentTimeMillis();
                qs.sort(shirts, 0, shirts.size() - 1, sortType, 1);
                endTime = System.currentTimeMillis();

                if (sortType) {
                    System.out.println("Time Lapsed for QS by Size ASC: " + (endTime - startTime));
                } else {
                    System.out.println("Time Lapsed for QS by Size DESC: " + (endTime - startTime));
                }
                break;
            // Color - 2
            case 2:
                startTime = System.currentTimeMillis();
                qs.sort(shirts, 0, shirts.size() - 1, sortType, 2);
                endTime = System.currentTimeMillis();

                if (sortType) {
                    System.out.println("Time Lapsed for QS by Color ASC: " + (endTime - startTime));
                } else {
                    System.out.println("Time Lapsed for QS by Color DESC: " + (endTime - startTime));
                }
                break;
            // Fabric - 3
            case 3:
                startTime = System.currentTimeMillis();
                qs.sort(shirts, 0, shirts.size() - 1, sortType, 3);
                endTime = System.currentTimeMillis();

                if (sortType) {
                    System.out.println("Time Lapsed for QS by Fabric ASC: " + (endTime - startTime));
                } else {
                    System.out.println("Time Lapsed for QS by Fabric DESC: " + (endTime - startTime));
                }
                break;
        }

        for (TShirt shirt : shirts) {
            System.out.println(shirt);
        }
    }
    
    // bubbleSort
    private static void bubbleSort(BubbleSort bs, List<TShirt> shirts, boolean sortType, int sortByProperty) {
        System.out.println("/// --------- ///");
        long startTime = 0;
        long endTime = 0;
        switch (sortByProperty) {
            // Size - 1
            case 1:
                startTime = System.currentTimeMillis();
                bs.sort(shirts, sortType, 1);
                endTime = System.currentTimeMillis();

                if (sortType) {
                    System.out.println("Time Lapsed for BS by Size ASC: " + (endTime - startTime));
                } else {
                    System.out.println("Time Lapsed for BS by Size DESC: " + (endTime - startTime));
                }
                break;
            // Color - 2
            case 2:
                startTime = System.currentTimeMillis();
                bs.sort(shirts, sortType, 2);
                endTime = System.currentTimeMillis();

                if (sortType) {
                    System.out.println("Time Lapsed for BS by Color ASC: " + (endTime - startTime));
                } else {
                    System.out.println("Time Lapsed for BS by Color DESC: " + (endTime - startTime));
                }
                break;
            // Fabric - 3
            case 3:
                startTime = System.currentTimeMillis();
                bs.sort(shirts, sortType, 3);
                endTime = System.currentTimeMillis();

                if (sortType) {
                    System.out.println("Time Lapsed for BS by Fabric ASC: " + (endTime - startTime));
                } else {
                    System.out.println("Time Lapsed for BS by Fabric DESC: " + (endTime - startTime));
                }
                break;
        }

        for (TShirt shirt : shirts) {
            System.out.println(shirt);
        }
    }
    
    // bucketSort
    public static void bucketSort(QuickSort qs, List<TShirt> shirts, boolean sortType, int sortByProperty) {
        
    }
}
