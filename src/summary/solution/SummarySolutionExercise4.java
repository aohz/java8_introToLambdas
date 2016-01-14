package summary.solution;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import org.junit.Test;

import summary.Exercise;

/**
 * Form a subclass Collection2 from Collection and add a default method void
 * forEachIf(Consumer<T> action, Predicate<T> filter) that applies action to
 * each element for which filter returns true. How could you use it?
 * 
 * @author aohz
 *
 */
public class SummarySolutionExercise4 implements Exercise {

	@Test
	@Override
	public void perform() {
		Collection2<Integer> c = new ArrayList2<>();
		c.add(100);
		c.add(-5);
		List<Integer> list = new ArrayList<>();
		c.forEachIf(list::add, e -> e > 0);
		assertEquals(1, list.size());
		assertEquals(100, list.toArray()[0]);		
	}
}

interface Collection2<T> extends Collection<T> {
	default void forEachIf(Consumer<T> action, Predicate<T> filter) {
		forEach(e -> {
			if (filter.test(e)) {
				action.accept(e);
			}
		});
	}
}

class ArrayList2<T> extends ArrayList<T> implements Collection2<T> {
}
