package jreflection;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Doh {

	/**
	 * force field to be accessible & modifiable
	 * @param fieldName
	 */
	protected static void makeModifiable(Field field) throws Exception {
		field.setAccessible(true);
		int modifiers = field.getModifiers(); 
		Field modifierField = field.getClass().getDeclaredField("modifiers");
		modifiers = modifiers & ~Modifier.FINAL;
		modifierField.setAccessible(true);
		modifierField.setInt(field, modifiers);
	}
}
