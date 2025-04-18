package com.romantrippel.dinaked.annotations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Lazy
class LazyAnnotatedClass {}

public class LazyAnnotationTest {

    @Test
    void shouldDetectLazyAnnotation() {
        boolean isLazy = LazyAnnotatedClass.class.isAnnotationPresent(Lazy.class);
        assertTrue(isLazy, "Class should be annotated with @Lazy");
    }
}
