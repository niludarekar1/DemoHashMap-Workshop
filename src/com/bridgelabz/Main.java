package com.bridgelabz;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        //Creating an Empty HashMap
        HashMap<Integer,String> hashMap=new HashMap<>();
        //Mapping string values to int keys
        hashMap.put(10,"Nilesh");
        hashMap.put(11,"Shrinath");
        hashMap.put(12,"Pradeep");
        hashMap.put(13,"DK");

        //Displaying the HashMap
        System.out.println("Displaying the Element "+hashMap);
    }
}
