import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {

        Class<?> cls = Test.class;


        System.out.print("Name of class is: " + cls.getName());
        System.out.print(" ");


        try {
            Constructor<?> constructor = cls.getConstructor();
            System.out.print("The name of constructor is: " + constructor.getName());
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }


        System.out.print("The public methods of the class are: ");
        Method[] methods = cls.getMethods();
        for (Method m : methods) {
            System.out.print(m.getName() + " ");
        }


        try {

            Method methodCall1 = cls.getDeclaredMethod("method1");
            methodCall1.setAccessible(true);


            Object instance = cls.getDeclaredConstructor().newInstance();


            methodCall1.invoke(instance);

            Method methodCall2 = cls.getDeclaredMethod("method2", int.class);
            methodCall2.invoke(instance,15);

            Field field = cls.getDeclaredField("s");
            field.setAccessible(true);
            System.out.print(field.get(instance));

            System.out.print("Print the changed value of s");
            field.set(instance,"VALUE");
            methodCall1.invoke(instance);

            Method MethodCall3 = cls.getDeclaredMethod("method3");
            MethodCall3.setAccessible(true);
            MethodCall3.invoke(instance);

        } catch (NoSuchMethodException e) {
            throw new RuntimeException("Method not found: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
