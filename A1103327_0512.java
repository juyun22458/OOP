import java.util.Random;
import java.util.Scanner;

class TimerThread extends Thread{
    dumplingType e;
    String name;
    Random random;
    public TimerThread(dumplingType e, String name){
        this.e = e;
        this.name = name;
        this.random = new Random();
    }
    public void run(){
        int dumplingQuantity = random.nextInt(41) + 10;
        String[] dumplingTypes = {"豬肉水餃", "牛肉水餃", "蔬菜水餃"};
        String dumplingType = dumplingTypes[random.nextInt(dumplingTypes.length)];
        e.eat(dumplingQuantity, dumplingType, name);
    }
}


class dumplingType{
    int pork = 5000;
    int beef = 3000;
    int vegetable = 1000;
    int lastPork = pork;
    int lastBeef = beef;
    int lastVegetable = vegetable;
    public synchronized void eat(int dumplingQuantity, String dumplingType, String eater){
        switch(dumplingType){
            case "豬肉水餃":
                if(lastPork <= 0){
                    System.out.println("豬肉水餃沒有了");
                    System.exit(0);
                }else{
                    lastPork -= dumplingQuantity;
                    System.out.println("豬肉水餃還剩" + lastPork + "顆");
                }
                break;
            case "牛肉水餃":
                if(lastBeef <= 0){
                    System.out.println("牛肉水餃沒有了");
                    System.exit(0);
                }else{
                    lastBeef -= dumplingQuantity;
                    System.out.println("牛肉水餃還剩" + lastBeef + "顆");
                }
                break;
            case "蔬菜水餃":
                if(lastVegetable <= 0){
                    System.out.println("蔬菜水餃沒有了");
                    System.exit(0);
                }else{
                    lastVegetable -= dumplingQuantity;
                    System.out.println("蔬菜水餃還剩" + lastVegetable + "顆");
                }
                break;
            default:
                break;
        }

        if(lastPork == 0 && lastBeef == 0 && lastVegetable == 0){
            System.out.println("打烊了");
        }

        try{
            Thread.sleep(3000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    public void startEat(int customerQuantity){
        for(int i = 1; i <= customerQuantity; i++){
            TimerThread eater = new TimerThread(this, "eater" +i);
            eater.start();
        }
    }
}

public class A1103327_0512{
    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(System.in);
        dumplingType e = new dumplingType();
        System.out.print("請輸入同時光顧的顧客數量:");
        int customerQuantity = input.nextInt();
        e.startEat(customerQuantity);
    }
}
