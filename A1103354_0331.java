import java.util.Scanner;

public class A1103354_0331 {
    static class animal {
        String name;
        double height;
        int weight;
        int speed;

        animal(String name, double height, int weight, int speed) {
            this.name = name;
            this.height = height;
            this.weight = weight;
            this.speed = speed;
        }

        String getName() {
            return name;
        }

        double getHeight() {
            return height;
        }

        double getWeight() {
            return weight;
        }

        double getSpeed() {
            return speed;
        }

        void show() {
            System.out.printf("%s \t\t%.1f \t\t%d \t\t\t\t\t%d\n", name, height, weight, speed);
        }

        int distance(int x, int y) {
            int a = x * y * speed;
            return a;
        }

        int distance(int x) {
            int a = x * speed;
            return a;
        }

        static void showinfo() {
            System.out.println("歡迎進入冰雪奇緣系統");
        }
    }

    static class human extends animal {
        String gender;

        String getGender() {
            return gender;
        }

        public human(String name, double height, int weight, int speed, String gender) {
            super(name, height, weight, speed);
            this.gender = gender;
        }

        @Override
        void show() {
            System.out.printf("%s \t\t%.1f \t\t%.0f \t\t%s \t\t\t%.0f\n", getName(), getHeight(), getWeight(),getGender(), getSpeed());
        }

    }

    static class snow extends human {
        String skill;

        String getSkill() {
            return skill;
        }

        public snow(String name, double height, int weight, int speed, String gender, String skill) {
            super(name, height, weight, speed, gender);
            this.skill = skill;
        }

        @Override
        void show() {
            System.out.printf("%s \t\t%.1f \t\t%.0f \t\t%s \t%s\t\t%.0f\n", getName(), getHeight(), getWeight(),getGender(), getSkill(), getSpeed());
        }

        @Override
        int distance(int x, int y) {
            int a = x * y * speed;
            return a*2;
        }
        @Override
        int distance(int x) {
            int a = x * speed;
            return a*2;
        }
    }

    public static void main(String[] args) {

        animal animal1 = new animal("雪寶", 1.1, 52, 100);
        animal animal2 = new animal("驢子", 1.5, 99, 200);

        human human1 = new human("阿克", 1.9, 80, 150, "男");
        human human2 = new human("漢斯", 1.8, 78, 130, "男");
        human human3 = new human("安那", 1.7, 48, 120, "女");

        snow snow1 = new snow("愛沙", 1.7, 50, 120, "女", "Yes");
        animal.showinfo();

        System.out.println("項目姓名\t身高(公尺)\t體重(公斤)\t性別\t冰凍技能\t速度(公尺/分鐘)");
        animal1.show();
        animal2.show();
        human1.show();
        human2.show();
        human3.show();
        snow1.show();

        int x,y;
        Scanner input = new Scanner(System.in);

        System.out.print("請輸入"+animal1.name+"奔跑的時間: ");
        x=input.nextInt();
        if(x==0){
            System.out.print("error");
            return;
        }
        System.out.print("請輸入"+animal1.name+"奔跑的加速度: ");
        y=input.nextInt();
        if(y==0){
            System.out.print(animal1.name+"的奔跑距離為: "+ animal1.distance(x));
        }else{
            System.out.println(animal1.name+"的奔跑距離為: "+animal1.distance(x, y));
        }

        System.out.print("請輸入"+animal2.name+"奔跑的時間: ");
        x=input.nextInt();
        if(x==0){
            System.out.print("error");
            return;
        }
        System.out.print("請輸入"+animal2.name+"奔跑的加速度: ");
        y=input.nextInt();
        if(y==0){
            System.out.print(animal2.name+"的奔跑距離為: "+ animal2.distance(x));
        }else{
            System.out.println(animal2.name+"的奔跑距離為: "+animal2.distance(x, y));
        }

        System.out.print("請輸入"+human1.name+"奔跑的時間: ");
        x=input.nextInt();
        if(x==0){
            System.out.print("error");
            return;
        }
        System.out.print("請輸入"+human1.name+"奔跑的加速度: ");
        y=input.nextInt();
        if(y==0){
            System.out.print(human1.name+"的奔跑距離為: "+ human1.distance(x));
        }else{
            System.out.println(human1.name+"的奔跑距離為: "+human1.distance(x, y));
        }

        System.out.print("請輸入"+human2.name+"奔跑的時間: ");
        x=input.nextInt();
        if(x==0){
            System.out.print("error");
            return;
        }
        System.out.print("請輸入"+human2.name+"奔跑的加速度: ");
        y=input.nextInt();
        if(y==0){
            System.out.print(human2.name+"的奔跑距離為: "+ human2.distance(x));
        }else{
            System.out.println(human2.name+"的奔跑距離為: "+human2.distance(x, y));
        }

        System.out.print("請輸入"+human3.name+"奔跑的時間: ");
        x=input.nextInt();
        if(x==0){
            System.out.print("error");
            return;
        }
        System.out.print("請輸入"+human3.name+"奔跑的加速度: ");
        y=input.nextInt();
        if(y==0){
            System.out.print(human3.name+"的奔跑距離為: "+ human3.distance(x));
        }else{
            System.out.println(human3.name+"的奔跑距離為: "+human3.distance(x, y));
        }

        System.out.print("請輸入"+snow1.name+"奔跑的時間: ");
        x=input.nextInt();
        if(x==0){
            System.out.print("error");
            return;
        }
        System.out.print("請輸入"+snow1.name+"奔跑的加速度: ");
        y=input.nextInt();
        if(y==0){
            System.out.print(snow1.name+"的奔跑距離為: "+ snow1.distance(x));
        }else{
            System.out.println(snow1.name+"的奔跑距離為: "+snow1.distance(x, y));
        }
    }
}