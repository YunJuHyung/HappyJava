package src02;

public class Bus2 extends Car2 {
    public Bus2(){
        super("ford");
        System.out.println("Bus2() 기본 생성자.");
    }
    //부모가 가지고 있는 추상메소드는 자식에서 반드시 구현을 해줘야한다.
    @Override
    public void run(){

    }
}
