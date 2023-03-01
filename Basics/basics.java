package Basics;
import java.lang.*;
import java.io.*;
import java.util.*;
public class basics {

    public static void main(String[] args) {
        System.out.println("Reverse Strings");

        String str = "hello";
        String temp  = "";
        //One way 
        for (int i = str.length()-1; i >=0; --i) {
            temp+=str.charAt(i);
        }
        System.out.println(temp);

        //Using String Builder 
        StringBuilder newStr = new StringBuilder();
        newStr.append(str);
        newStr.reverse();
        System.out.println(newStr);



    }
}