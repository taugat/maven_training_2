package fr.lernejo.tester.internal;

import org.assertj.core.api.Assertions;

import fr.lenerjo.tester.api.TestMethod;
import fr.lenerjo.tester.internal.TestClassDescription;
import fr.lernejo.tester.SomeLernejoTests;

import java.lang.reflect.Method;
import java.util.List;

class TestClassDescriptionTest {

    @TestMethod
    public void listing_test_methods_returns_only_annoted_ones(){
        TestClassDescription description = new TestClassDescription(SomeLernejoTests.class);

        List<Method> methods = description.listTestMethods();

        Assertions.assertThat(methods)
            .extracting(method -> method.getName())
            .containsExactlyInAnyOrder("ok","ko");
    }

    public static void main(String[] args){
        new TestClassDescriptionTest().listing_test_methods_returns_only_annoted_ones();
    }
}
