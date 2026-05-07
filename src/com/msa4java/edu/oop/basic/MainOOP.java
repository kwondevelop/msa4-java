package com.msa4java.edu.oop.basic;

public class MainOOP {
    public static void main(String[] args) {
        // Whale 클래스를 인스턴스 생성
        Whale whale = new Whale();
        System.out.println("나는 " + whale.name);
        whale.swimming();
        System.out.println("나이는 " + whale.age);
        whale.breath();
        
        // 접근 제어 지시자 확인용
        AccessModifier accessModifier = new AccessModifier();
        accessModifier();
    }

    private static void accessModifier() {
    }
    
//    OverLoading overLoading = new OverLoading();
//    overLoading.print(1, 2);
//    
//    // 생성자
//    ConJava conJava = new ConJava(20);
//    ConJava conJava1 = new ConJava(30);
//    
//    System.out.println(conJava.age);
//    System.out.println(conJava1.age);
    
//    Marine marine = new Marine(40, 6, 0);
//    System.out.println(marine.getHp());
//    marine.setHp(1000);
//    System.out.println(marine.getHp());
}