package org.example5;

public class OuterClass {
    private String poleTestowe = "pole testowe";

    public class InnerClass {
        public void display() {
            System.out.println("Inner Class");
            System.out.println(poleTestowe);
            test();
        }
    }

    public void displayInner() {
        InnerClass innerClass = new InnerClass();
        innerClass.display();

    }

    public void test() {
        System.out.println("test");
    }
}
