package src02;

public abstract class Car2 {
    public Car2(String name){
        //String name 값을 받았기 때문에 기본생성자가 없음
        System.out.println("Car2() 생성자 호출");
        }

    //추상메소드. Car2를 만든사람은 run()이라는 메소드가 필요할거같다 생각했다.
    //run()은 자동차마다 다르게 구현할 것 같아.
    public abstract void run();{
        System.out.println("후륜구동으로 동작하게 된다.");
        }
}
