package com.fluex404.java5And4;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

public class AnnotationExample {
    public static void main(String... args) throws NoSuchMethodException {
        // accessing annotation
        Hello hello = new Hello();
        Method m = hello.getClass().getMethod("sayHello");
        MyAnnotation manno = m.getAnnotation(MyAnnotation.class);
        System.out.println("value is : "+manno.value());
    }

}

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface
MyAnnotation{
    int value();
    String value2();
}
class Hello{
    @MyAnnotation(value = 10, value2 = "20")
    public void sayHello(){
        System.out.println("hello annotation");
    }
}
