package jreflection;

/**
 * An immutable data class.
 */
class Person {

	// avoid inlining by calling newString("unnamed")
	public static final String DEFAULT = new String("unnamed");
	private final String name;

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}