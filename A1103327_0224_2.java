import java.util.Scanner;

public class A1103327_0224_2{
    public static void main(String[] argv){
        System.out.println("請輸入攝氏溫度:");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        double b = ( a * 9.0/5 )+ 32;
        System.out.println("換算為華氏溫度:"+b);
    }
}