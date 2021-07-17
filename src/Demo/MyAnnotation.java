package Demo;

import java.lang.annotation.Repeatable;

/**
 * @author WhiteRunner
 * @create 2021-07-07 20:50
 */
@Repeatable(MyAnnotations.class)
public @interface MyAnnotation {
    String value() default "test";
}
