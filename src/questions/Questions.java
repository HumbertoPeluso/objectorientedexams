package questions;

public class Questions {


   // B)  Code in a large Java project can be divided into different packages. There are a number of reasons to do this.
    // List two reasons and briefly discuss each and give an example of a real world scenario for each.

    // Answer
    // https://www.w3schools.com/java/java_packages.asp


  /*  C)  Explain the following terms:
    i) Static Type
    ii) Dynamic Type
    iii) Class Casting
    iv) Wrapper Classes
    v) Implicit Promotion*/

  // Answer

  //  Static: Types checked before run-time (Java)
 //   Dynamic: Types checked on the fly, during execution (javascript)

    /*A cast, instructs the compiler to change the existing type of an object reference to another type.
    In Java, all casting will be checked both during compilation and during execution to ensure that they are legitimate.
    An attempt to cast an object to an incompatible object at runtime will results in a ClassCastException.
    A cast can be used to narrow or downcast the type of a reference to make it more specific.*/

    /*Each primitive type has a wrapper class, which is an object type that
    corresponds to the primitive*/

  //  "Promoted" means: converted to a "larger" type (for example int to long). "Implicit" means that it's done
    //  automatically, without a type cast.

   /* long someMethod() {
        int value = 123;
        return value;  // note: int automatically converted to long
    }*/


 // D) Explain the difference between overloading and overriding in java. Provide code samples to illustrate your
    // answer. Discuss the benefits of these techniques.

    // Answer

  //  Overloading occurs when two or more methods in one class have the same method name but different parameters.
 // Overriding means having two methods with the same method name and parameters

  //  overridden methods allow Java to support run-time polymorphism. Polymorphism is essential to object-oriented
    //  programming for one reason: it allows a general class to specify methods that will be common to all of its
    //  derivatives, while allowing subclasses to define the specific implementation of some or all of those methods.
    //  Overridden methods are another way that Java implements the “one interface, multiple methods” aspect of
    //  polymorphism.

}
