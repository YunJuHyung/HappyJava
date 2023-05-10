package TemplateMethod.Main;

import TemplateMethod.Myproject.FirstController;
import TemplateMethod.fw.Controller;

public class MainController {
    public static void main(String[] args) {
        Controller c1 = new FirstController();
        c1.execute();
    }
}
