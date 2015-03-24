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
public class Lab1 {
    public static void main(String[] args) {
        
        List list = new ArrayList();
        
        list.add("Guitar");
        list.add("Netflix");
        list.add("Video Games");
        list.add("Disc Golfing");
        
        for(Object obj : list){
            System.out.println(obj.toString());
        }
        
        list.add("Electronics Tinkering");
        list.add("Skateboarding");
        
        for(Object obj : list){
            System.out.println(obj.toString());
        }
        
        list.remove(1);
        
        for(Object obj : list){
            System.out.println(obj.toString());
        }
    }
}
