import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Data structure to store strings and their positions.
 */
public class WordIndex {

	/**
	 * Stores a mapping of words to the positions the words were found.
	 */
	private Map<String, Set<Integer>> index;

	/**
	 * Initializes the index.
	 */
	public WordIndex() {
		/*
		 * TODO: Choose the best data structures. Keep in mind you do not want
		 * duplicates, and do not need to store anything in sorted order.
		 */
		index = null;
	}

	/**
	 * Adds the word and the position it was found to the index.
	 *
	 * @param word
	 *            word to clean and add to index
	 * @param position
	 *            position word was found
	 */
	public void add(String word, int position) {
		/*
		 * TODO: Make sure you initialize any inner data structures.
		 */
	}

	/**
	 * Adds the array of words at once, assuming the first word in the array is
	 * at position 1.
	 *
	 * @param words
	 *            array of words to add
	 *
	 * @see #addAll(String[], int)
	 */
	public void addAll(String[] words) {
		addAll(words, 1);
	}

	/**
	 * Adds the array of words at once, assuming the first word in the array is
	 * at the provided starting position
	 *
	 * @param words
	 *            array of words to add
	 * @param start
	 *            starting position
	 */
	public void addAll(String[] words, int start) {
		/*
		 * TODO: Add each word using the start position. (You can call your
		 * other methods here.)
		 */
	}

	/**
	 * Returns the number of times a word was found (i.e. the number of
	 * positions associated with a word in the index).
	 *
	 * @param word
	 *            word to look for
	 * @return number of times the word was found
	 */
	public int count(String word) {
		/*
		 * TODO: Return the count.
		 */
		return 0;
	}

	/**
	 * Returns the number of words stored in the index.
	 *
	 * @return number of words
	 */
	public int words() {
		/*
		 * TODO: Return number of words. No counting is necessary!
		 */
		return 0;
	}

	/**
	 * Tests whether the index contains the specified word.
	 *
	 * @param word
	 *            word to look for
	 * @return true if the word is stored in the index
	 */
	public boolean contains(String word) {
		/*
		 * TODO: Return whether the word is in the index.
		 */
		return false;
	}

	/**
	 * Returns a copy of the words in this index as a sorted list.
	 *
	 * @return sorted list of words
	 *
	 * @see ArrayList#ArrayList(java.util.Collection)
	 * @see Collections#sort(List)
	 */
	public List<String> copyWords() {
		/*
		 * TODO: Create a copy of the words in the index as a list, and sort
		 * before returning.
		 */
		return null;
	}

	/**
	 * Returns a copy of the positions for a specific word.
	 *
	 * @param word
	 *            to find in index
	 * @return sorted list of positions for that word
	 *
	 * @see ArrayList#ArrayList(java.util.Collection)
	 * @see Collections#sort(List)
	 */
	public List<Integer> copyPositions(String word) {
		/*
		 * TODO: Create a copy of the positions for the word, and sort before
		 * returning.
		 */
		return null;
	}

	/**
	 * Returns a string representation of this index.
	 */
	@Override
	public String toString() {
		return index.toString();
	}
}
