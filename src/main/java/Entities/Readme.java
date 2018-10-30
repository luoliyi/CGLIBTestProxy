package Entities;

import java.lang.annotation.*;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Readme {
    String value() default "该方法无描述信息.";
}
