package summary.exercises;

import java.util.ArrayList;
import java.util.Collection;

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
public class SummaryExercise4 implements Exercise {

	@Test
	@Override
	public void perform() {
		
	}
}

interface Collection2<T> extends Collection<T> {
	
}

class ArrayList2<T> extends ArrayList<T> implements Collection2<T> {
}
