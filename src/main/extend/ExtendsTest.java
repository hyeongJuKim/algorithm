package main.extend;

public class ExtendsTest {

    public static void main(String[] args) {
        C cClass = new C();
        A aClass = cClass;
        aClass.print();
    }


}

class A {
    public void print(){ System.out.println("A"); }
}

class B extends A {
    public void print(){ System.out.println("B"); }
}

class C extends B {
    public void print(){ System.out.println("C"); }
}
