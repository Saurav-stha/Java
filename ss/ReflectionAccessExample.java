import java.lang.reflect.*; //has Constructor,Field and Method classes

class MyClass {
    private int privateField;

    MyClass(int value) {
        this.privateField = value;
        System.out.println("in constructor");
    }

    private void privateMethod() {
        System.out.println("Private method called");
    }
}

public class ReflectionAccessExample {
    public static void main(String[] args) throws Exception {
        // Access the public constructor
        Constructor<MyClass> constructor = MyClass.class.getDeclaredConstructor(int.class);
        constructor.setAccessible(true);
        MyClass inst = constructor.newInstance(42);

        // Access the private field
        Field privateField = MyClass.class.getDeclaredField("privateField");
        privateField.setAccessible(true);
        int fieldValue = (int) privateField.get(inst);
        System.out.println("Private Field Value: " + fieldValue);

        // Access the private method
        Method privateMethod = MyClass.class.getDeclaredMethod("privateMethod");
        privateMethod.setAccessible(true);
        privateMethod.invoke(inst);
    }
}
