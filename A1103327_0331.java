import java.util.Scanner;

class Animal{
    String name;
    double height;
    double weight;
    double speed;

    Animal(String name, double height, double weight, double speed){
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
    }

    void show(){
        System.out.print(name+"      ");
        System.out.print(height+"        ");
        System.out.print(weight+"\t");
        System.out.print("\t\t");
        System.out.print(speed+"\t");
    }

    double distance(double x, double y){
        return x * y * this.speed;
    }
    double distance(double x){
        return x * this.speed;
    }

    static void showinfo(){
        System.out.println("歡迎進入冰雪奇緣系統");
    }
}

class Human extends Animal{
    String gender;

    Human(String name, double height, double weight, String gender, double speed){
        super(name, height, weight, speed);
        this.gender = gender;
    }

    void show(){
        System.out.print(name+"      ");
        System.out.print(height+"        ");
        System.out.print(weight+"\t");
        System.out.print(gender+"\t\t");
        System.out.print(speed+"\t");
    }
}

class Snow extends Human{
    boolean skill;

    Snow(String name, double height, double weight, String gender, boolean skill, double speed){
        super(name, height, weight, gender, speed);
        this.skill = skill;
    }

    void show(){
        System.out.print(name+"      ");
        System.out.print(height+"        ");
        System.out.print(weight+"\t");
        System.out.print(gender+"\t");
        System.out.print((skill ? "YES" : "NO")+ "\t");
        System.out.print(speed+"\t");
    }

    double distance(double x, double y){
        return 2 * super.distance(x,y);
    }

    double distance(double x){
        return 2 * super.distance(x);
    }
}

public class A1103327_0331{
    public static void main(String[] argv){
        Animal a1 = new Animal("雪寶", 1.1, 52, 100);
        Animal a2 = new Animal("驢子", 1.5, 99, 200);
        Human h1 = new Human("阿克", 1.9, 80, "男", 150);
        Human h2 = new Human("漢斯", 1.8, 78, "男", 130);
        Human h3 = new Human("安那", 1.7, 48, "女", 120);
        Snow s1 = new Snow("愛沙", 1.7, 50, "女", true, 120);

        Animal.showinfo();
        
        System.out.println("項目姓名 身高(公尺) 體重(公斤) 性別 冰凍技能 速度(公尺/分鐘)");
        a1.show();
        System.out.println();
        a2.show();
        System.out.println();
        h1.show();
        System.out.println();
        h2.show();
        System.out.println();
        h3.show();
        System.out.println();
        s1.show();
        System.out.println();

        Scanner input = new Scanner(System.in);
        System.out.println("請輸入" +a1.name+ "奔跑的時間:");
        double x = input.nextDouble();
        System.out.println("請輸入" +a1.name+ "奔跑的加速度:");
        double y = input.nextDouble();
        if(y == 0){
            System.out.println(a1.name+ "奔跑的距離為:" +a1.distance(x));
        }else{
            System.out.println(a1.name+ "奔跑的距離為:" +a1.distance(x,y));
        }

        Scanner input2 = new Scanner(System.in);
        System.out.println("請輸入" +a2.name+ "奔跑的時間:");
        double x2 = input2.nextDouble();
        System.out.println("請輸入" +a2.name+ "奔跑的加速度:");
        double y2 = input2.nextDouble();
        if(y2 == 0){
            System.out.println(a2.name+ "奔跑的距離為:" +a2.distance(x2));
        }else{
            System.out.println(a2.name+ "奔跑的距離為:" +a2.distance(x2,y2));
        }

        Scanner input3 = new Scanner(System.in);
        System.out.println("請輸入" +h1.name+ "奔跑的時間:");
        double x3 = input3.nextDouble();
        System.out.println("請輸入" +h1.name+ "奔跑的加速度:");
        double y3 = input3.nextDouble();
        if(y3 == 0){
            System.out.println(h1.name+ "奔跑的距離為:" +h1.distance(x3));
        }else{
            System.out.println(h1.name+ "奔跑的距離為:" +h1.distance(x3,y3));
        }

        Scanner input4 = new Scanner(System.in);
        System.out.println("請輸入" +h2.name+ "奔跑的時間:");
        double x4 = input4.nextDouble();
        System.out.println("請輸入" +h2.name+ "奔跑的加速度:");
        double y4 = input4.nextDouble();
        if(y4 == 0){
            System.out.println(h2.name+ "奔跑的距離為:" +h2.distance(x4));
        }else{
            System.out.println(h2.name+ "奔跑的距離為:" +h2.distance(x4,y4));
        }

        Scanner input5 = new Scanner(System.in);
        System.out.println("請輸入" +h3.name+ "奔跑的時間:");
        double x5 = input5.nextDouble();
        System.out.println("請輸入" +h3.name+ "奔跑的加速度:");
        double y5 = input5.nextDouble();
        if(y5 == 0){
            System.out.println(h3.name+ "奔跑的距離為:" +h3.distance(x5));
        }else{
            System.out.println(h3.name+ "奔跑的距離為:" +h3.distance(x5,y5));
        }

        Scanner input6 = new Scanner(System.in);
        System.out.println("請輸入" +s1.name+ "奔跑的時間:");
        double x6 = input6.nextDouble();
        System.out.println("請輸入" +s1.name+ "奔跑的加速度:");
        double y6 = input6.nextDouble();
        if(y6 == 0){
            System.out.println(s1.name+ "奔跑的距離為:" +s1.distance(x6));
        }else{
            System.out.println(s1.name+ "奔跑的距離為:" +s1.distance(x6,y6));
        }
    }
}