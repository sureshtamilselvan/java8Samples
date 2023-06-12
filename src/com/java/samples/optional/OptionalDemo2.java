package com.java.samples.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalDemo2 {
	// Driver code
    public static void main(String[] args)
    {
 
        // creating a string array
        String[] str = new String[5];
        List al = new ArrayList();
        al.add("hi");
        al.add("how");
        al.add("are");
        al.add(null);
 
        // Setting value for 2nd index
        //str[2] = "Geeks Classes are coming soon";
        str[2] = null;
        
 
        // It returns an empty instance of Optional class
        Optional<String> empty = Optional.empty();
        System.out.println(empty);
 
        // It returns a non-empty Optional
       // Optional<String> value = Optional.of(str[2]);
        Optional<List> value = Optional.of(al);
        // It returns value of an Optional.
        // If value is not present, it throws
        // an NoSuchElementException
        System.out.println(value.get());
 
        // It returns hashCode of the value
        System.out.println(value.hashCode());
 
        // It returns true if value is present,
        // otherwise false
        System.out.println(value.isPresent());
    }
}
