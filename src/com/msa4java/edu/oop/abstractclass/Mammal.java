package com.msa4java.edu.oop.abstractclass;

public abstract class Mammal {
    protected String name;
    protected String residence;
    
    public Mammal(String name, String residence) {
        this.name = name;
        this.residence = residence;
    }
    
    public void breath() {
        System.out.println(this.name + " 권민재 바보.");
    }
    
    // 추상 메소드: 반드시 자식 클래스에서 오버라이드해서 사용해야 한다.
    public abstract void residence();
}
