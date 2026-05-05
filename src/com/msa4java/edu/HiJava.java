package com.msa4java.edu;

//public class HiJava {
//    public static void main(String[] args) {
//        System.out.println(12);
//        System.out.print(1);
//        System.out.print(2);
//
//        String str = "자바";
//        int num = 5;
//        System.out.printf("안녕 %s : %d", str, num);
//    }
//}

public class HiJava {
    public static void main(String[] args) {
        int i;
        int j;
        for (i = 1; i <= 5; i++) {
            System.out.println("");
            for (j = 1; j <= 5; j++) {
                System.out.print("*");
            }
        }
    }
}