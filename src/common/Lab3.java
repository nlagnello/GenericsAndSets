/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nagnello
 */
public class Lab3 {
    public static void main(String[] args) {
        List list = new ArrayList();
        
        list.add(new Employee("Agnello","Nick","123-45-6789"));
        list.add(new Employee("Smith","John","111-11-1111"));
        list.add(new Dog("Fido", 12345));
        
        for(Object obj : list){
            System.out.println(obj.toString());
        }
        
    }
}
