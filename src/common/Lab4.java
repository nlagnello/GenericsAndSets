/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author nagnello
 */
public class Lab4 {
    public static void main(String[] args) {
        Set set = new HashSet();
        
        set.add(new Employee("Agnello","Nick","123-45-6789"));
        set.add(new Employee("Smith","John","111-11-1111"));
        set.add(new Employee("Agnello","Nick","123-45-6789"));
        
        
        for(Object obj : set){
            System.out.println(obj.toString());
        }
        
        
    }
}
