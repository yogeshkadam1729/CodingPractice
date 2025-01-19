package com.practice.code;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Define the annotation
@Retention(RetentionPolicy.RUNTIME) // The annotation is available at runtime
@Target(ElementType.METHOD) // The annotation can be applied to methods
public @interface MyAnnotation {
    String value() default "Default Value"; // Annotation element with a default value
    int count() default 1; // Another element with a default value
}
