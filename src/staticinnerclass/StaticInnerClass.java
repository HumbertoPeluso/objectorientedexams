package staticinnerclass;

public class StaticInnerClass { //Outer class

   // Describe, in words, the concept of a static nested class and compare it to an inner class.

  /*  A static class created inside a class is called static nested class in java. It cannot access non-static data members and methods. It can be accessed by outer class name.

    It can access static data members of outer class including private.
    Static nested class cannot access non-static (instance) data member or method.*/

   // Inner class means one class which is a member of another class.

    static int data=30;

    static class Inner{
        void msg(){System.out.println("data is "+data);}
    }

    public static void main(String args[]){
        StaticInnerClass.Inner obj= new StaticInnerClass.Inner();
        obj.msg();
    }


}
