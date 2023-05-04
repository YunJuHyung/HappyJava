package day03;

public class BookExam01 {
    public static void main(String[] args) {
        Book b1 = new Book();
//        b1.price = 100;         //*private 필드는 직접 접근하지 못한다* 고로 필드를 접근할수 있는 메소드를 만들어줘야함
//        System.out.println(b1.price);

            b1.setTitle("윤주형의 즐거운 자바");
            System.out.println(b1.getTitle());
            b1.setPrice(500);
            System.out.println(b1.getPrice());
    }
}
