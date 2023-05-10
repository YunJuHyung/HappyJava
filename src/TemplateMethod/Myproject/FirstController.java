package TemplateMethod.Myproject;

import TemplateMethod.fw.Controller;

public class FirstController extends Controller {
    @Override
    protected void run(){
        System.out.println("별도로 동작하는 코드 11111");
    }

}
