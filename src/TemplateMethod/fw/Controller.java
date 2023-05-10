package TemplateMethod.fw;

/*
Controller의 종류가 여러개
* 초기화 -같은 코드
* 실행    -다른 코드
* 마무리   -같은 코드
* */
public abstract class Controller {
    //protected 는 같은 package이거나 상속받았을 경우에 접근 가능
    protected final void init(){
        System.out.println("초기화 하는 코드");
    }
    protected final void close(){
        System.out.println("종료하는 코드");
    }

    //내가 가지고 있는 메소드를 호출한다.
    //어떤 순서를 가지고 있다. 이런 메소드를 템플릿 메소드라고한다
    protected abstract void run();  //메번 다른 코드
    public void execute(){
        this.init();//초기화
        this.run();//실행
        this.close();//마무리
    }
}
