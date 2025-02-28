package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 스캐너로 문자열 입력받음.
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();   // 제목 입력 변수.
        float rate = sc.nextFloat();    // 별점 입력 실수형 변수.


        String input1 = sc.next();
        String input2 = sc.next();
        String input3 = sc.next();
        String input4 = sc.next();
        String input5 = sc.next();
        String input6 = sc.next();
        String input7 = sc.next();
        String input8 = sc.next();
        String input9 = sc.next();
        String input10 = sc.next();

        // 첫 줄에 제목을 출력.
        title = "[ " + title + " ] ";
        System.out.println(title);

        // 형변환 진행.
        int intRate = (int)rate;

        // 퍼센테지로 변환한 변수 계산법.
        double percentageRate = intRate * 100 / 5.0 ;

        System.out.println("별점 : " + intRate + " (" + rate + "%)");
        // 내용 출력.
        System.out.println("1. " + input1);
        System.out.println("2. " + input2);
        System.out.println("3. " + input3);
        System.out.println("4. " + input4);
        System.out.println("5. " + input5);
        System.out.println("6. " + input6);
        System.out.println("7. " + input7);
        System.out.println("8. " + input8);
        System.out.println("9. " + input9);
        System.out.println("10. " + input10);

    }
}