package jreflection;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Doh {

	public static void main(String[] args) throws Exception {
		Person p = new Person("Piter");
		System.out.println(p.getName());
		System.out.println(Person.DEFAULT);

		setName(p, "New Name");
		setDefault("Bob");
		
		System.out.println(p.getName());
		System.out.println(Person.DEFAULT);
	}
	
	private static void setDefault(String newDefault) throws Exception {
		Field staticField = Person.class.getDeclaredField("DEFAULT");
		setValue(null, staticField, newDefault);
	}

	private static void setName(Person p, String newName) throws Exception {
		Field field = Person.class.getDeclaredField("name");
		setValue(p, field, newName);
	}

	private static void setValue(Object owner, Field field, Object value) throws Exception {
		makeModifiable(field);
		field.set(owner, value);
	}

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
