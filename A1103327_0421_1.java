import java.util.Scanner;

public class A1103327_0421_1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("請輸入您的email帳號:");
        String email = input.nextLine();

        boolean account = email.matches("^[a-z0-9.]+@[a-z0-9]+\\.[a-z]{2,}$");

        if(account){
            System.out.println("您輸入的是正確格式的email");
        }else{
            System.out.println("您輸入的是錯誤格式的email");
        }
    }
}