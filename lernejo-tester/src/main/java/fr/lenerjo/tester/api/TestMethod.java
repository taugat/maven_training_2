package fr.lenerjo.tester.api;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) // (1)
@Target(ElementType.METHOD)
public @interface TestMethod {

}
