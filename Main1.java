// Abstract class
abstract class AbstractClass {
    // Abstract method
    public abstract void abstractMethod();

    // Concrete method
    public void concreteMethod() {
        System.out.println("Concrete method in AbstractClass");
    }
}

// Interface
interface MyInterface {
    // Abstract method
    void interfaceMethod();

    // Default method (Java 8+)
    default void defaultMethod() {
        System.out.println("Default method in MyInterface");
    }
}

// Concrete class implementing the interface and extending the abstract class
class ConcreteClass extends AbstractClass implements MyInterface {
    // Implementing abstract method from AbstractClass
    @Override
    public void abstractMethod() {
        System.out.println("Abstract method implementation in ConcreteClass");
    }

    // Implementing abstract method from MyInterface
    @Override
    public void interfaceMethod() {
        System.out.println("Interface method implementation in ConcreteClass");
    }
}

public class Main1 {
    public static void main(String[] args) {
        // Create an instance of ConcreteClass
        ConcreteClass instance = new ConcreteClass();
        // Call methods
        instance.abstractMethod();
        instance.interfaceMethod();
        instance.concreteMethod();
        // Call default method from the interface
        instance.defaultMethod();
    }
}
