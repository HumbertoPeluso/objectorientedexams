package basicfeaturesoo;

public class Encapsulation {

   /* The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users. To achieve this, you must:

    declare class variables/attributes as private (only accessible within the same class)
    provide public setter and getter methods to access and update the value of a private variable*/

    public static void main(String[] args) {
        Person myObj = new Person();
     //   myObj.name = "John";  // error
      //  System.out.println(myObj.name); // error
    }

}

 class Person {
    private String name; // private = restricted access

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String newName) {
        this.name = newName;
    }
}