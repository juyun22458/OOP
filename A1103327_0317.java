import java.util.Scanner;

public class A1103327_0317{
    public static void main(String[] argv){
        System.out.println("請輸入第一個數字:");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("請輸入第二個數字:");
        Scanner input2 = new Scanner(System.in);
        int m = input2.nextInt();

        int [][] arr = new int[n][m];
        for (int a = 0; a < n; a++) {
            for (int b = 0; b < m; b++) {
                arr[a][b] = (a + 1) * (b + 1);
            }
        }

        System.out.println("二維陣列:");
        for (int a = 0; a < n; a++) {
            for (int b = 0; b < m; b++) {
                System.out.print(arr[a][b] + "\t");
            }
            System.out.println();
        }

        int [][] arr2 = new int[n][m];
        int count = 1;
        for (int a = 0; a < n; a++) {
            for (int b = 0; b < m; b++) {
                arr2[a][b] = count;
                count++;
            }
        }

        // 使用 for each 讀出資料
        System.out.println("for each:");
        for (int[] row : arr2) {
            for (int c : row) {
                System.out.print(c + "\t");
            }
            System.out.println();
        }
    }
}