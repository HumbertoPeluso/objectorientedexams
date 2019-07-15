package accessmodifiers;

public class AccessModifiers {

  /*        ------------+-------+---------+--------------+--------------+--------
                | Class | Package | Subclass     | Subclass     |Outside|
                |       |         |(same package)|(diff package)|Class  |
             ————————————+———————+—————————+——————————----+—————————----—+————————
    public      | Yes   |  Yes    |    Yes       |    Yes       |   Yes |
             ————————————+———————+—————————+—————————----—+—————————----—+————————
    protected   | Yes   |  Yes    |    Yes       |    Yes       |   No  |
             ————————————+———————+—————————+————————----——+————————----——+————————
    default     | Yes   |  Yes    |    Yes       |    No        |   No  |
             ————————————+———————+—————————+————————----——+————————----——+————————
    private     | Yes   |  No     |    No        |    No        |   No  |
            ------------+-------+---------+--------------+--------------+--------*/

    private double num = 100;
    private int square(int a){
        return a*a;
    }

    }


 class ExamplePrivate {
    public static void main(String args[]) {
        AccessModifiers obj = new AccessModifiers();
        //  System.out.println(obj.num);
        //  System.out.println(obj.square(10));
    }
}

 class ExampleProtected {

    protected int addTwoNumbers(int a, int b){
        return a+b;
    }
}

class TestProtected extends ExampleProtected{
    public static void main(String args[]){
        TestProtected obj = new TestProtected();
        System.out.println(obj.addTwoNumbers(11, 22));
    }
}