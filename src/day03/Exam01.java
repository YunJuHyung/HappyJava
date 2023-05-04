package day03;

public class Exam01 {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        System.out.println(p1.i);
        p1.printI();

        System.out.println("-----------------");
        Child c1 = new Child();
        System.out.println(c1.i);
        c1.printI();
        System.out.println("-----------------");
        Parent p2 = new Child(); //Child 는 Parent 의 후손이다. 혹은 자식이다.
        System.out.println(p2.i);   //**메소드가 오버라이딩되면 값은 부모의 값을 가지지만 실행은 자식의 메소드가 실행된다.**
        p2.printI();
        p2.printII();

    }
}
