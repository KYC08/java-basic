package poly.diamond;

import poly.ex5.InterfaceAnimal;

public class DiamondMain {

    public static void main(String[] args) {
        InterfaceA a = new Child();
        a.methodA();
        a.methodCommon();
    }
}
