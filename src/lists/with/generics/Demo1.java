/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lists.with.generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author nagnello
 */
public class Demo1 {
    
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        
        list.add("5");
        list.add("Beer");
        list.add("Chips");
        list.add("Beef Sticks");
        list.add("Beer");
        
        String item = (String)list.get(1);
        
        for(int i = 0; i < list.size(); i++){
            String s = (String)list.get(i);
            System.out.println(s);
        }
        
        list.remove(3);
        
        
        for(String s2 : list){
            System.out.println(s2);
        }
        
        list.add(2, "Steak");
        
        for(int i = 0; i < list.size(); i++){
            String s = (String)list.get(i);
            System.out.println(s);
        }
        
        
    }
    
}
