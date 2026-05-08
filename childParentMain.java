package coreJavaExamples;

public class childParentMain {
    public static void main(String[] args) {
        Parent hero1 = new Parent("Maximus");
        Parent hero2 = new Child("Superman");
        hero1.fight(); //Let's fight
        hero2.fight(); //Let's fight
        //hero2.fly(); //-- will give compile time error
        /*
            At compile time, Java checks methods based on reference type, not object type.
            Reference type = Parent
            So compiler only allows methods present in Parent.
            At runtime, Child object executes Parent method (since not overridden)
         */
        hero2.getDetails();
    }
}
