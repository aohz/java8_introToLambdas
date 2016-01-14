package summary.exercises;

import java.io.File;

import org.junit.Test;

import summary.Exercise;

/**
 * Using the list(FilenameFilter) method of the java.io.File class, write a
 * method that returns all files in a given directory with a given extension.
 * Use a lambda expression, not a FilenameFilter. Which variables from the
 * enclosing scope does it capture?
 */
public class SummaryExercise2 implements Exercise {

	@Test
	@Override
	public void perform() {	
	}

	private static File[] list(String dir, String ext) {
		return null;
	}
}
