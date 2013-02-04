package jreflection;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * @see http://zarnekow.blogspot.ch/2013/01/java-hacks-changing-final-fields.html?m=1
 */
public class Doh {

	public static void main(String[] args) throws SecurityException, IllegalArgumentException, NoSuchFieldException, IllegalAccessException  {
		Person p = new Person("Piter");
		System.out.println(p.getName());
		System.out.println(Person.DEFAULT);

		setName(p, "New Name");
		setDefault("Bob");
		
		System.out.println(p.getName());
		System.out.println(Person.DEFAULT);
	}
	
	private static void setDefault(String newDefault) throws SecurityException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException  {
		Field staticField = Person.class.getDeclaredField("DEFAULT");
		setValue(null, staticField, newDefault);
	}

	private static void setName(Person p, String newName) throws SecurityException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException  {
		Field field = Person.class.getDeclaredField("name");
		setValue(p, field, newName);
	}

	private static void setValue(Object owner, Field field, Object value) throws SecurityException, IllegalArgumentException, NoSuchFieldException, IllegalAccessException  {
		makeModifiable(field);
		field.set(owner, value);
	}

	/**
	 * force field to be accessible & modifiable
	 * @param fieldName
	 * @throws NoSuchFieldException 
	 * @throws SecurityException 
	 * @throws IllegalAccessException 
	 * @throws IllegalArgumentException 
	 */
	protected static void makeModifiable(Field field) throws SecurityException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException  {
		field.setAccessible(true);
		int modifiers = field.getModifiers(); 
		Field modifierField = field.getClass().getDeclaredField("modifiers");
		modifiers = modifiers & ~Modifier.FINAL;
		modifierField.setAccessible(true);
		modifierField.setInt(field, modifiers);
	}
}
