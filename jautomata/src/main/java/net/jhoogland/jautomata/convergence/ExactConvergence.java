package net.jhoogland.jautomata.convergence;

import java.util.Objects;

/**
 *
 * The weight convergence condition that yields true if and only if the previous and current weights are
 * equal according to the weight type's equal(Object) method.
 *
 * @author Jasper Hoogland
 *
 * @param <K>
 * weight type
 * (Boolean for regular automata and Double for weighted automata)
 */

public class ExactConvergence<K> implements WeightConvergenceCondition<K>
{
	@Override
	public boolean converged(K w1, K w2)
	{
		return Objects.equals(w1, w2);
	}
}
