package com.romantrippel.dinaked.annotations;

import org.junit.jupiter.api.Test;

import static com.romantrippel.dinaked.enums.ScopeType.PROTOTYPE;
import static com.romantrippel.dinaked.enums.ScopeType.SINGLETON;
import static org.junit.jupiter.api.Assertions.*;

public class ScopeTest {

    @Scope
    static class ExampleDefault {}

    @Scope(PROTOTYPE)
    static class ExamplePrototype {}

    @Test
    void testDefaultScopeValue() {
        Scope scope = ExampleDefault.class.getAnnotation(Scope.class);
        assertNotNull(scope);
        assertEquals(SINGLETON, scope.value());
    }

    @Test
    void testCustomScopeValue() {
        Scope scope = ExamplePrototype.class.getAnnotation(Scope.class);
        assertNotNull(scope);
        assertEquals(PROTOTYPE, scope.value());
    }
}
