package com.romantrippel.dinaked.annotations;

import com.romantrippel.dinaked.enums.ScopeType;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Scope {
    ScopeType value() default ScopeType.SINGLETON;
}
