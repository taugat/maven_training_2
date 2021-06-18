package fr.lenerjo.tester.internal;

import fr.lenerjo.tester.api.TestMethod;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestClassDescription {

    private final Class<?> obj;

    public TestClassDescription(Class<?> obj) {

        this.obj = obj;
    }

    public List<Method> listTestMethods(){
        return Arrays.stream(obj.getDeclaredMethods())
            .filter(m -> Modifier.isPublic(m.getModifiers()))
            .filter(m -> m.getReturnType().equals(Void.TYPE))
            .filter(method -> method.getParameterCount() == 0)
            .filter(method -> method.isAnnotationPresent(TestMethod.class))
            .collect(Collectors.toList());

    }
}
