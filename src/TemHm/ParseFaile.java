package TemHm;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tiago
 */
public class ParseFaile {
    List<Integer> temp;
    List<Integer> hm;
    public ParseFaile(){
         temp = new ArrayList<Integer>();
         hm = new ArrayList<Integer>();
        
        String faileContent= null; 
        File logFile = new File("logFile.txt");
        String line;
        List<String> tokens= null;
       
        try{
            BufferedReader br = new BufferedReader(new FileReader(logFile));
    
    while ((line = br.readLine()) != null) {
       // process the line.
       // System.out.println(line);
         tokens =Arrays.asList(line.split(";"));
         System.out.println("splited");
        temp.add(Integer.parseInt(tokens.get(0)));
        hm.add(Integer.parseInt(tokens.get(1)));
    }
    
    } 
        catch (Exception ex) {
             System.out.println("file errado");
        }
        System.out.println("Nas Listas");
    for(int i=0;i<temp.size();i++){
        System.out.println(temp.get(i));
         System.out.println(hm.get(i));
          System.out.println("xxxxxxxxxxxxxx");
    }
        System.out.println(((int)hm.get(3)));
    }
    public  List<Integer> getTmp(){
    return temp;}
   
    public  List<Integer> getHm(){
    return hm;}

    
  public static void main(String[] args) {
       ParseFaile p = new ParseFaile();
}

    
}
