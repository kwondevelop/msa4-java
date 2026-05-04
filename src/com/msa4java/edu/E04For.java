package com.msa4java.edu;

public class E04For {
    public static void main(String[] args) {
        
//        int i;
//        int j;
//        for (i = 2; i <= 9; i++) {
//            System.out.printf("** %d단 **\n", i);
//            for (j = 1; j <= 9; j++) {
//                System.out.printf("%d X %d = %d\n", i, j, i * j);
//            }
//        }
        int dan = 2;
        for (int i = dan; i <= 9; i++) {
            String strDan = String.format("** %d단 **", i);
            System.out.println(strDan);
            for(int z = 1; z <= 9; z++) {
                String strMulti = String.format("%d X %d = %d", i, z, i * z);
                System.out.println(strMulti);
            }
        }
    }
}
