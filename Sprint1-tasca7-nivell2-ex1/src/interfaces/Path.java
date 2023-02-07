package interfaces;

import javax.annotation.processing.SupportedAnnotationTypes;
import java.lang.annotation.*;
import java.lang.reflect.*;
import java.lang.annotation.RetentionPolicy;
@Retention(RetentionPolicy.RUNTIME)
public @interface Path {
    String pathName = "C:\\Users\\marca\\Desktop\\stuff2\\json.txt";
}
