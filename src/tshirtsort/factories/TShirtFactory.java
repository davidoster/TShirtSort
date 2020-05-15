/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tshirtsort.factories;

import tshirtsort.randomizer.RandomTShirt;

/**
 *
 * @author mac
 */
public class TShirtFactory {
    
    public void tShirtGenerateX(int x) {
        RandomTShirt rt = new RandomTShirt();
        
        for (int i = 0; i < x; i++) {
            rt.generate();
        }
    }
    
}
