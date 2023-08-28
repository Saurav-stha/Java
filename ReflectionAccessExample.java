import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class MyClass {
    private int privateField;

    private MyClass(int value) {
        this.privateField = value;
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
        MyClass instance = constructor.newInstance(42);

        // Access the private field
        Field privateField = MyClass.class.getDeclaredField("privateField");
        privateField.setAccessible(true);
        int fieldValue = (int) privateField.get(instance);
        System.out.println("Private Field Value: " + fieldValue);

        // Access the private method
        Method privateMethod = MyClass.class.getDeclaredMethod("privateMethod");
        privateMethod.setAccessible(true);
        privateMethod.invoke(instance);
    }
}
