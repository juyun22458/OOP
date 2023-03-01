import java.util.Scanner;

public class A1103327_0224_1{
    public static void main(String[] argv){
        System.out.println("請輸入一個整數:");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        if(a % 2 == 0){
            System.out.println("你輸入的整數是偶數");
        }else{
            System.out.println("您輸入的整數是奇數");
        }
    }
}