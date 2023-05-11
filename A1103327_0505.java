import java.util.Scanner;

class MyException extends Exception{
    MyException(String message){
        super (message);
    }
}

public class A1103327_0505{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] prizeNumber = {4,12,23,26,28,30,42};
        int[] userNumber = new int[6];

        for(int i = 0; i <= 5; i++){
            try{
                System.out.println("請輸入您的第" +(i+1)+ "個樂透號碼(1~49內):");
                int n = input.nextInt();
                if(n < 1 || n > 49){
                    throw new MyException("請輸入1~49範圍內的數字");
                }
                userNumber[i] = n;
            }catch(MyException e){
                System.out.println(e);
                i--;
            }
        }
        boolean win = false;
        for(int i = 0; i <= 5; i++){
            for(int j = 0; j <= 5; j++){
                if(prizeNumber[j] == userNumber[i]){
                    win = true;
                    break;
                }
            }
        }
        if(win){
            System.out.println("恭喜中獎!");
        }else{
            System.out.println("很遺憾，祝您下次好運!");
        }
    }
}