/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tshirtsort;

import java.util.List;
import tshirtsort.factories.TShirtFactory;
import tshirtsort.models.TShirt;

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
        
        for (TShirt shirt : shirts) {
            System.out.println(shirt);
        }
    }
    
}
