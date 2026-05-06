package com.msa4java.edu.oop;

public class MainOOP {
    public static void main(String[] args) {
        // Whale 클래스를 인스턴스 생성
        Whale whale = new Whale();
        System.out.println("나는 " + whale.name);
        whale.swimming();
        System.out.println("나이는 " + Whale.age);
        whale.breath();
        
        // 접근 제어 지시자 확인용
        AccessModifier accessModifier = new AccessModifier();
        accessModifier();
    }

    private static void accessModifier() {
    }
}