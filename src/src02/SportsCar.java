package src02;

public class SportsCar extends Car2{
    //부모가 기본 생성자가 없기때문에 반드시 super()를 호출해줘야한다.
    public SportsCar(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("4륜구동으로 동작한다.");
    }
}
