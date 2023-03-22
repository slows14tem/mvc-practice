package org.example.reflection.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE}) //대상 지정
@Retention(RetentionPolicy.RUNTIME) //유지기간
public @interface Controller {
}
