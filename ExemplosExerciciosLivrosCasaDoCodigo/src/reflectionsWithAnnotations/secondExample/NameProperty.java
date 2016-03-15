package reflectionsWithAnnotations.secondExample;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface NameProperty {

	String value();
	
}
