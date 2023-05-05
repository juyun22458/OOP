import java.io.*;
import java.util.Scanner;

public class A1103327_0421_2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("請輸入日期(格式為YYYY/MM/DD 或 MM/DD/YYYY):");
        String date = input.nextLine();

        if(date.matches("[0-9]{4}/[0-9]{2}/[0-9]{2}")){
            System.out.println("您輸入的日期是" +date.substring(0,4)+ "年" +date.substring(5,7)+ "月" +date.substring(8,10)+ "日");
        }else if(date.matches("[0-9]{2}/[0-9]{2}/[0-9]{4}")){
            System.out.println("您輸入的日期是" +date.substring(6,10)+ "年" +date.substring(0,2)+ "月" +date.substring(3,5)+ "日");
        }else{
            System.out.println("您輸入的日期是錯誤的");
        }
    }
}