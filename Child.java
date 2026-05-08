package coreJavaExamples;

public class Child extends Parent{

    public Child(String name) {
        super(name);
    }
    public void fly() {
        System.out.println("Let's fly!");
    }

    public final void getDetails(){
        System.out.println("Parent class..");
    }
}
