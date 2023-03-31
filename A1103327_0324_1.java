import java.util.Scanner;

class Animal{
    String name;
    double height;
    double weight;
    double speed;

    void show(){
        System.out.print(name+"\t");
        System.out.print(height+"\t");
        System.out.print(weight+"\t");
        System.out.print(speed+"\t");
    }

    double distance(double x, double y){
        return x * y * this.speed;
    }
    double distance(double x){
        return x * this.speed;
    }
}

public class A1103327_0324_1{
    public static void main(String[] argv){
        Animal[] animals = new Animal[4];

        Scanner input = new Scanner(System.in);

        animals[0] = new Animal();
        animals[0].name = "雪寶";
        animals[0].height = 60.0;
        animals[0].weight = 45.0;
        animals[0].speed = 20.0;

        animals[1] = new Animal();
        animals[1].name = "驢子";
        animals[1].height = 80.0;
        animals[1].weight = 60.0;
        animals[1].speed = 50.5;

        animals[2] = new Animal();
        animals[2].name = "安那";
        animals[2].height = 155.0;
        animals[2].weight = 45.0;
        animals[2].speed = 40.0;

        animals[3] = new Animal();
        animals[3].name = "愛沙";
        animals[3].height = 160.0;
        animals[3].weight = 45.0;
        animals[3].speed = 45.0;
        
        System.out.println("姓名\t身高\t體重\t速度\t");
        for(Animal a : animals){
        a.show();
        System.out.println();
        }

        for(int i = 0; i < animals.length; i++){
            System.out.println("請輸入" +animals[i].name+ "奔跑的時間:");
            double x = input.nextDouble();
            System.out.println("請輸入" +animals[i].name+ "奔跑的加速度:");
            double y = input.nextDouble();
            if(y == 0){
                System.out.println(animals[i].name+ "奔跑的距離為:" +animals[i].distance(x));
            }else{
                System.out.println(animals[i].name+ "奔跑的距離為:" +animals[i].distance(x,y));
            }
        }
    }
}