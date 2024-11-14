package net.jhoogland.jautomata.semirings;

/**
 * Semifields must implement this interface. A semifield is a semiring with a
 * multiplicative inverse for all non-zero values. The Boolean, real, and
 * tropical semirings are examples of semifields. The multiplicative inverse is
 * used by the {@link net.jhoogland.jautomata.operations.Determinization Determinization} operation.
 *
 * @author Jasper Hoogland
 *
 * @param <K> the type of the elements of the semifield
 */
public interface Semifield<K> extends Semiring<K> {

	/**
	 * @return the multiplicative inverse of the specified weight
	 */
	K inverse(K x);
}
