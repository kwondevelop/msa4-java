package com.msa4java.edu.error;

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            System.out.println("try 시작");
            double result = 10 / 2;
            System.out.println("try 끝");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception 에러");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("catch 들어옴");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finally");
        }
    }
}
