package com.msa4java.edu;

import java.util.Arrays;

public class E05Array {
    public static void main(String[] args) {
//        // 길이 3의 int 배열 생성 및 초기화
//        int[] arrInt = new int[5];
//        arrInt[4] = 50;
//        System.out.println(Arrays.toString(arrInt));
//        
//        // 길이 4의 char 배열 생성 및 초기화(요소의 값도 셋팅)
//        char[] arrChar = {'a', 'b', 'c', 'd'};
//        System.out.println(Arrays.toString(arrChar));
//        
//        // 주소 값이 나옴
//        System.out.println(arrInt);
//        
//        // 그대로 나옴
//        System.out.println(arrChar);
        
//        // 배열의 복사
//        int[] arrInt2 = {1, 2, 3};
//        int[] copyArr = arrInt2;
//        
//        copyArr[1] = 555;
//        System.out.println(arrInt2[1]);
        
//        // for문을 이용한 복사
//        int[] arrInt2 = {1, 2, 3};
//        int[] copyArr = new int[arrInt2.length];
//        for(int i = 0; i < arrInt2.length;) {
//            copyArr[i] = arrInt2[i];
//        }
//        copyArr[1] = 55;
//        System.out.println(arrInt2[1]);
        
//        // System.arraycopy() 이용해서 깊은 복사
//        int[] arrInt2 = {1, 2, 3};
//        int[] copyArr = new int[arrInt2.length];
//        System.arraycopy(arrInt2, srcPos:0, arrInt2, destPos:0, arrInt2/long);
//        
//        // Arrays.copyof() 이용해서 깊은 복사
//        int[] arrInt2 = {1, 2, 3};
//        int[] copyArr = new int[arrInt2.length * 2];
//        arrInt2 = Arrays.copyOf(arrInt2, arrInt2,length);
//        arrInt2[1] = 55;
//        System.out.println(arrInt2[1]);
        
        // 다차원 배열
        int[][] arrMD = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println(arrMD[2][2]);
        
        // 배열의 API
        int[] arrIntA = {1, 2, 3};
        int[] arrIntB = {1, 2, 3, 4};
        // 배열의 길이 반환
        System.out.println(arrIntA.length);
        
        // 배열이 같은지 비교
        System.out.println(arrIntA.equals(arrIntB));
        System.out.println(Arrays.equals(arrIntA, arrIntB));
        
        int[][] arrIntDM1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] arrIntDM2 = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(Arrays.deepEquals(arrIntDM1, arrIntDM2));
        
        // 배열의 정렬
        int[] arrSort = {5, 2, 76, 89, 1, 2};
        Arrays.sort(arrSort);
        System.out.println(Arrays.toString(arrSort));
    }
}