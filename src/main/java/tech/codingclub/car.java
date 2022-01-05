package tech.codingclub;

public class car {
    int maxspeed = 300;
    int currentspeed = 0;

    void accelerate() {
        currentspeed++;
    }

    public static void main(String[] args) {

        car audi = new car();
        System.out.println("current speed:" + audi.currentspeed);

        audi.accelerate();
        System.out.println("current speed:" + audi.currentspeed);
        car bmw = new car();
        System.out.println("current speed:" + bmw.currentspeed);


    }


}
