/*A class which contains abstract keyword in its declaration is called abstract class
(1)We caannot create object of abstract class but we can create reference of abstrat class like we can create a subclass of abstract class which is not a abstract class and then we can create
object of child class by taking reference of parent class.
(2)It may or may not contain abstract methods.
(3)to use Abstract class we need to inherit abstract class or super class we can say from sub class.
(4)If we have any partial implementation or means any method which is empty or not doing and printing anything then we should declare that class as abstract as that method is empty so koi mtlb nai h us
class ka object bana k uso call karane ka.
(5)If a class contains any abstrract method then that class needs to be declared abstract compulsory.Abstract class has not implemented method so, we cant create the objec.
But in a simple class where we have all virtual method, able to create an object.
Because it's abstract and an object is concrete. An abstract class is sort of like a template, or an empty/partially empty structure, you have to extend it and build on it before you can use it.

 */
import java.util.*;
abstract class car {
    public abstract void drive();
    public abstract void fly();
    public void music() {
        System.out.println("Playing music");
    }
}
abstract class bmw extends car {
    public void drive() {
        System.out.println("Driving:");
    }
}
class nano extends bmw {
    public void fly() {
        System.out.println("Flying");
    }
}

public class abstractclassandmethod {
    public static void main(String[] args) {
        car c = new nano();
        c.music();
        c.drive();
        c.fly();
    }
}
/*Lets say we have a class car in which we have two methods drive and playmusic now a car dont know how to drive and simply we create another subclass of any car like bmw then it knows how to drive
so any method which we are not implementing then we need to declare it and the method which we are not implementing then why should we create object so if we are declaring then commmpulsory we need to impl
ement it in subclass and we have to name that class of method as abstract.So you need to override the method.
-If a subclass of abstract class is not implementing all the abstractc methods of abstract class then that class also declared as abstract class.
-We call a subclasss of abstract class as concrete class of which we cn make objects.
 */