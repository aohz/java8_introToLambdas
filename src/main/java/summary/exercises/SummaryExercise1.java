package summary.exercises;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;

import org.junit.Test;

import summary.Exercise;

/**
 * Using the listFiles(FileFilter) and isDirectory methods of the java.io.File
 * class, write a method that returns all subdirectories of a given directory.
 * Use a lambda expression instead of a FileFilter object. Repeat with a method
 * expression.
 * 
 * @author aohz
 *
 */
public class SummaryExercise1 implements Exercise {

	@Test
	@Override
	public void perform() {
		Arrays.asList(getChildDirsWithLambda(".")).forEach(System.out::println);
		System.out.println("---------------------------------------------");
		Arrays.asList(getChildDirsWithMethodReference(".")).forEach(System.out::println);
	}

	private static File[] getChildDirsWithLambda(String dir) {
		File f = new File(dir);
		//f.listFiles();
		return null;
	}

	private static File[] getChildDirsWithMethodReference(String dir) {	
		File f = new File(dir);
		//f.listFiles(nul);
		return null;
	}

}
