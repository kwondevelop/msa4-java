package com.msa4java.edu.oop.basic;

public class Whale {
    // Class는 Field와 Method로 구성되어 있다.
    
    // Field
    public String name = "고래";
    public static int age = 20;
    
    // Method
    public void swimming() {
        System.out.println("고래가 헤엄칩니다."); 
    }
    
    // Static Method    
    public static void breath() {
        System.out.println("고래가 숨을 쉽니다.");
    }
}
