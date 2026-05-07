package com.msa4java.edu.oop.abstractclass;

public class Whale extends Mammal implements Swim {
    public Whale(String name) {
        super(name, "바다");
    }
    
    @Override
    public void residence() {
        String result = String.format("%s %s에 삽니다.", this.name, this.residence);
        System.out.println(result);
    }
    
    public void swimming() {
        System.out.println("고래쪽에서 오버라이드");
    }
    
    public void breath() {
        System.out.println("고래쪽에서 오버라이드");
    }
}
