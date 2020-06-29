package ua.com.alevel.nix.solidteamsports.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Value {

    String value() default "";
}
