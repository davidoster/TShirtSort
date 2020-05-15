/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tshirtsort.sorting;

import java.util.List;
import tshirtsort.models.TShirt;

/**
 *
 * @author mac
 */
public class QuickSort {
    
    // low = arr.get(low), low = 4
    // high = arr.get(high), high = 0
    // boolean sortType, sortType == true, ASC --  sortType == false, DESC
    public void sort(List<TShirt> arr, int low, int high, boolean sortType) {
        if (low < high) {
            /* pi is partitioning index, arr[pi] is  
              now at right place */
            int pi = partition(arr, low, high, sortType);

            // Recursively sort elements before 
            // partition and after partition 
            sort(arr, low, pi - 1, sortType);
            sort(arr, pi + 1, high, sortType);
        }
    }

    // boolean sortType, sortType == true, ASC --  sortType == false, DESC
    int partition(List<TShirt> arr, int low, int high, boolean sortType) {
        TShirt pivot = arr.get(high);
        int i = (low - 1); // index of smaller element 
        for (int j = low; j < high; j++) {
            // If current element is smaller than the pivot 
            if(sortType) {
                if (arr.get(j).getSize().ordinal() < pivot.getSize().ordinal()) {
                    i++;

                    // swap arr[i] and arr[j] 
                    TShirt temp = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, temp);
                }
            } else {
                if (arr.get(j).getSize().ordinal() > pivot.getSize().ordinal()) {
                    i++;

                    // swap arr[i] and arr[j] 
                    TShirt temp = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, temp);
                }
            }
            
        }

        // swap arr[i+1] and arr[high] (or pivot) 
        TShirt temp = arr.get(i + 1);
        arr.set(i + 1, arr.get(high));
        arr.set(high, temp);

        return i + 1;
    }
}
