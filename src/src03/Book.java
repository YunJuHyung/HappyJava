package src03;

public class Book {
    private String Title;
    private int price; //field price

    //필드의 값을 수정하고 얻기 위한 메소드를 만든. setter, getter
    //setter, getter - 프로퍼티(property) - price 프로퍼티

    public int getPrice() {
        return this.price * 2;          //this. = 내 필드를 가리, 내 자신 인스턴를 창조하는 예약어
    }

    public void setPrice(int price) { //지역 변수 price
        this.price = price;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        this.Title = title;
    }

}
