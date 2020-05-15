/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tshirtsort;

import java.util.List;
import tshirtsort.factories.TShirtFactory;
import tshirtsort.models.TShirt;
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
        List<TShirt> shirts = tFactory.tShirtGenerateX(10);
        QuickSort qs = new QuickSort();
        
        for (TShirt shirt : shirts) {
            System.out.println(shirt);
        }
        quickSort(qs, shirts, true);
        quickSort(qs, shirts, false);
        
        
    }
    
    public static void quickSort(QuickSort qs, List<TShirt> shirts, boolean sortType) {
        System.out.println("/// --------- ///");
        long startTime = System.currentTimeMillis();
        qs.sort(shirts, 0, shirts.size() - 1, sortType);
        long endTime = System.currentTimeMillis();
        if(sortType) {
            System.out.println("Time Lapsed for QS by Size ASC: " + (endTime - startTime));
        } else {
            System.out.println("Time Lapsed for QS by Size DESC: " + (endTime - startTime));
        }
            
        
        for (TShirt shirt : shirts) {
            System.out.println(shirt);
        }
    }
}
