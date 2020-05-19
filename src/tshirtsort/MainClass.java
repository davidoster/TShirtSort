/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tshirtsort;

import java.util.ArrayList;
import java.util.List;
import tshirtsort.factories.TShirtFactory;
import tshirtsort.models.TShirt;
import tshirtsort.sorting.BubbleSort;
import tshirtsort.sorting.BucketSort;
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
        List<TShirt> shirts = tFactory.tShirtGenerateX(5);
        QuickSort qs = new QuickSort();
        BubbleSort bs = new BubbleSort();
        BucketSort bus = new BucketSort();

        for (TShirt shirt : shirts) {
            System.out.println(shirt);
        }
//        performQuickSort(qs, shirts);
//        performBubbleSort(bs, shirts);
//        performBucketSort(bus, shirts);
        performBucketSortPerProperty(bus, shirts);
        
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
    
    public static void performBucketSort(BucketSort bus, List<TShirt> shirts) {
        bucketSort(bus, shirts, true, 1);
        bucketSort(bus, shirts, false, 1);
        
        bucketSort(bus, shirts, true, 2);
        bucketSort(bus, shirts, false, 2);
        
        bucketSort(bus, shirts, true, 3);
        bucketSort(bus, shirts, false, 3);
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
    public static void bucketSort(BucketSort bus, List<TShirt> shirts, boolean sortType, int sortByProperty) {
        System.out.println("/// --------- ///");
        long startTime = 0;
        long endTime = 0;
        List<TShirt> sorted_shirts = new ArrayList<>();
        switch (sortByProperty) {
            // Size - 1
            case 1:
                startTime = System.currentTimeMillis();
                sorted_shirts = bus.sort(shirts, 6, sortType, 1);
                endTime = System.currentTimeMillis();

                if (sortType) {
                    System.out.println("Time Lapsed for BUS by Size ASC: " + (endTime - startTime));
                } else {
                    System.out.println("Time Lapsed for BUS by Size DESC: " + (endTime - startTime));
                }
                break;
            // Color - 2
            case 2:
                startTime = System.currentTimeMillis();
                sorted_shirts = bus.sort(shirts, 6, sortType, 2);
                endTime = System.currentTimeMillis();

                if (sortType) {
                    System.out.println("Time Lapsed for BUS by Color ASC: " + (endTime - startTime));
                } else {
                    System.out.println("Time Lapsed for BUS by Color DESC: " + (endTime - startTime));
                }
                break;
            // Fabric - 3
            case 3:
                startTime = System.currentTimeMillis();
                sorted_shirts = bus.sort(shirts, 6, sortType, 3);
                endTime = System.currentTimeMillis();

                if (sortType) {
                    System.out.println("Time Lapsed for BUS by Fabric ASC: " + (endTime - startTime));
                } else {
                    System.out.println("Time Lapsed for BUS by Fabric DESC: " + (endTime - startTime));
                }
                break;
        }

        for (TShirt shirt : sorted_shirts) {
            System.out.println(shirt);
        }
    }
    
    public static void performBucketSortPerProperty(BucketSort bus, List<TShirt> shirts) {
        /*
        1. Make a BUS per Size
        2. Find which TShirts have the same Size on the sorted (previous)list
        3. Get the ones of the same Size in a sublist
        4. Make a BUS per Color on the previous sublist
        5. Find which TShirts have the same Color on the previous sorted list (from step 4)
        6. Make a BUS per Fabric
        */
        List<List<TShirt>> subLists = new ArrayList<List<TShirt>>(); // instantiate a List of Lists!
        
        // step 1 - Make a BUS per Size
        List<TShirt> shirtsBySize = bus.sort(shirts, 6, true, 1);
        
        // step 2 - Find which TShirts have the same Size on the sorted (previous)list
        int[] sBySize = new int[7];
        for(int i = 0; i < 7; i++) {
            sBySize[i] = 0;
        }
        for (TShirt tShirt : shirtsBySize) {
            sBySize[tShirt.getSize().ordinal()]++; //sBySize[0] == 2
        }
        for (int i : sBySize) {
            System.out.println("i : " + i);
        }
        
        // step 3 - Get the ones of the same Size in a sublist
        TStruct[] allSizes = new TStruct[7];
        int counter = 0; // shirts.get(counter) <-- 0 
        for(int i = 0; i < 7; i++) {
            allSizes[i] = new TStruct();
            if(sBySize[i] == 0) {
                allSizes[i].start = -1;
                allSizes[i].end = -1;
            } else {
                allSizes[i].start = counter; // 0 
                allSizes[i].end = counter + sBySize[i] - 1;
                subLists.add(shirtsBySize.subList(allSizes[i].start, allSizes[i].end)); // this line isn't correct we need to correct it
            }
            counter += sBySize[i];
        }
        
        // step 4 - Make a BUS per Color on the previous sublist
        // step 5 - Find which TShirts have the same Color on the previous sorted list (from step 4) (TOGETHER because of the List of Lists
        List<Integer[]> sByColor = new ArrayList<Integer[]>();
        for(int i = 0; i <= subLists.size(); i++) {
            sByColor.add(new Integer[7]);
            Integer[] t = new Integer[7];
            for (Integer integer : sByColor.get(sByColor.size() - 1)) {
                integer = 0;
            }
        }
        int sByColorCounter = 0;
        for(List<TShirt> sList: subLists) {
            List<TShirt> shirtsByColor = bus.sort(sList, 6, true, 2);
            for(TShirt tShirt : sList) {
                Integer[] t =  sByColor.get(sByColorCounter);
                if(t[tShirt.getColor().ordinal()] == null) t[tShirt.getColor().ordinal()] = 0;
                t[tShirt.getColor().ordinal()]++;
            }
            sByColorCounter++;
        }
        counter = 0;
        for (Integer[] integers : sByColor) {
            System.out.println("counter: " + counter);
            for (Integer integer : integers) {
                System.out.println("i : " + integer);
            }
        }
        
        // go to these subLists and make a sort

        // 0 (XS), 0 start, 1 end
        // 1 (S) , 2 start, 4 end
        // 2 (M) , 5 start, 8 end
        // 3 (L) , 9 start, 10 end 
        //shirtsBySize.subList(0, 1);
        
    }
    
    static class TStruct {
        public int start;
        public int end;
    }
}
