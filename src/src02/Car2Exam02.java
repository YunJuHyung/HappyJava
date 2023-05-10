package src02;

public class Car2Exam02 {
    public static void main(String[] args) {
      //  Ca2 c = new Car2("ferrari");

        Bus2 b = new Bus2();
        b.run();

        SportsCar s1 = new SportsCar("lamborgini ");
        s1.run();

        Car2 c =  new Bus2();
        c.run();

        Car2[] array = new Car2[2];
        array[0] = new Bus2();
        array[1] = new SportsCar("martiz");
        for(Car2 c2 : array){
            c2.run();
        }

    }
}
