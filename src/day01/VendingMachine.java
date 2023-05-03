package day01;

public class VendingMachine {
    public String pushProductButton(int menuId){
        System.out.println(menuId + "를 전달받았습니다.");
        return "콜라";
    }


    public static void  printVersion(){
        System.out.println("v1,0");

    }
}

//    javac Hello java           클래스 컴파일
//        Hello.java Hello.class     자바/컴파일 파일 생김
//        java Hello
//        JVM 자바 버츄얼 머신은 CLASSPATH 경로에서 Hello클래스를 찾아서 실행한다.CLASSPATH=. 이라고 적혀있다고 생각하자.

//JVM 은 프로그램 시작점인main메소드를 찾게됩니다.그리고 main 메소드를 실행하게 됩니다 >
//JAVA STACK이라고 불리는 메모리 영역에 실행된 메소드 정보가 올라가게 됩니다> 여기서 STACK이란 FILO 구조 선입선출의 구조
//JVM은 PERM메모리에 올라가 있는 VendingMachine클래스에서 main 메소드가 있는지를 찾음

//main 메소드안에 선언된 지역 변수들은 stack entry에 저장됨 argd 는 String배열 타입