package src02;

public class Car {
    private String name; //필드는 가지는 것

    //생성자는 메소드와 비슷하다.
    //return type이 없다.
    //매개변수 0개인 생성자 기본생성자라고 한다.
    //생성자가 하나도 없으 아무일도 안하 기본생성자가 자동으로 만들어진다.
    public Car() {
        System.out.println("자동차가 한대 생성됩니다.");
    }

    public Car(String name) {
        this.name = name;

    }

    public void printname(){
        System.out.println("자동차 이름: " + name);
    }
    public void run(){
        System.out.println("전륜구동으로 달리다.");

    }

    @Override
    public String toString() {
        return "자동차!!";
    }
}
