// Abstract base class
abstract class Base {
    abstract void show();  // Abstract method
}

// Derived class 1
class Derv1 extends Base {
    public void show() {
        System.out.println("Derived Class One");
    }
}

// Derived class 2
class Derv2 extends Base {
    public void show() {
        System.out.println("Derived Class Two");
    }
}

// Main class
public class AbstractExample {
    public static void main(String args[]) {
        Base b, c;

        // b = new Base(); // Not allowed, abstract class cannot be instantiated
        
        b = new Derv1(); // Assigning derived class object
        b.show();  // Calls Derv1's show()

        c = new Derv2(); // Assigning another derived class object
        c.show();  // Calls Derv2's show()
    }
}
