package RandLotto;

/*
* 1. 1~45 까지 써있는 ball을 기계에 넣는다.
* 2. 로또 기계에 있는 Ball들을 섞는다
* 3. 섞인 ball들 중에서 6개를 꺼낸다  */
public interface LottoMachine {     //인터페이스가 나타내는 메소드는 모두 추상메소드여서 abstract를 생략가능하다.
    int MAX_BALL_COUNT = 45;        //인터페이스가 가지는 모든 필드는 public static이 생략돠어있다.
    int RETURN_BALL_COUNT = 6;
    public void setBalls(Ball[] balls); // Ball[] 이 balss를 여러개 받겠다.
    public void mix(); //자기가 가지고 잇는 ball들을 섞는다.
    public  Ball[] getBalls(); //6개를 반환한다.


}
