package summary.solution;

import org.junit.Test;

import summary.Exercise;

import java.io.File;
import java.util.Arrays;

/**
 * Using the list(FilenameFilter) method of the java.io.File class, write a
 * method that returns all files in a given directory with a given extension.
 * Use a lambda expression, not a FilenameFilter. Which variables from the
 * enclosing scope does it capture?
 */
public class SummarySolutionExercise2 implements Exercise {

	@Test
	@Override
	public void perform() {
		String[] files = list(".", "md");
		Arrays.asList(files).forEach(System.out::println);
	}

	private static String[] list(String inputDir, String ext) {
		File dirFile = new File(inputDir);
		return dirFile.list((File dir, String name) -> {			
			return name.endsWith(ext);
		});
	}
}
