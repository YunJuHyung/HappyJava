package src02;

public class CarExam01 {
    public static void main(String[] args) {
        Bus b1 = new Bus();
        b1.run();
//        b1.안내방송();

        Car c1 = new Bus();
        c1.run();
        Bus b2 = (Bus)c1;         //c1이 참조하는 Bus인스턴스를 원래의
        b2.안내방송();               // Bus형태로 참조해서 사용하겠다고 선언하는것

        Car c2 = new SuperCar();
        c2.run();
    }
}
