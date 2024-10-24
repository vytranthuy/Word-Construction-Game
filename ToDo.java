package toDo;

public class ToDo {
  public static String[] words;

  /**
   * 
   * @param ch
   * @return true if the character is an English letter, false otherwise
   */
  public static boolean isEnglishLetter(char ch) {

    // Check if the character is within the ASCII range of lowercase 'a' to 'z' or
    // uppercase 'A' to 'Z'
    if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
      return true; // Return true if the character is an English letter
    } else {
      return false; // Return false if the character is not an English letter
    }
  }

  /**
   * 
   * @param c
   * @return true if the character is a vowel, false otherwise
   */
  public static boolean isVowel(char c) {

    // Check if the character is equal to any of the vowels ('a', 'e', 'i', 'o', 'u'
    // in both lowercase and uppercase)
    if (c == 'u' || c == 'U' || c == 'e' || c == 'E' || c == 'o' || c == 'O' || c == 'a' || c == 'A' || c == 'i'
        || c == 'I') {
      return true; // Return true if the character is a vowel
    } else {
      return false; // Return false if the character is not a vowel
    }
  }

  /**
   * 
   * @param c
   * @return true if the character is a constant, false otherwise
   */
  public static boolean isConsonant(char c) {
    boolean result = true; // Assume the character is a consonant initially

    // Check if the character is not a letter, if so, it is not a consonant
    if (!Character.isLetter(c)) {
      result = false;
    }

    // Check if the character is a vowel ('a', 'e', 'i', 'o', 'u' in both lowercase
    // and uppercase), if so, it is not a consonant
    if (c == 'u' || c == 'U' || c == 'e' || c == 'E' || c == 'o' || c == 'O' || c == 'a' || c == 'A' || c == 'i'
        || c == 'I') {
      result = false;
    }

    return result; // Return true if the character is a consonant, false otherwise
  }

  /**
   * 
   * @param s
   * @return the number of vowels in the string
   */
  public static int countVowels(String s) {
    int count = 0; // Initialize count to 0

    // Iterate through each character in the string
    for (int i = 0; i < s.length(); i++) {
      char pos = s.charAt(i); // Get the character at the current position

      // Check if the character is a vowel ('a', 'e', 'i', 'o', 'u' in both lowercase
      // and uppercase)
      if (pos == 'u' || pos == 'U' || pos == 'e' || pos == 'E' || pos == 'o' || pos == 'O' || pos == 'a' || pos == 'A'
          || pos == 'i' || pos == 'I') {
        count++; // Increment count if the character is a vowel
      }
    }
    return count; // Return the total count of vowels in the input string
  }

  /**
   * 
   * @param arr
   * @param word
   * @return true if the array contains the word, false otherwise
   */
  public static boolean contains(String[] arr, String word) {
    boolean result = false; // Initialize the result to false

    // Iterate through each element in the array
    for (int i = 0; i < arr.length; i++) {

      // Check if the current element is equal to the word
      if (arr[i] == word) {
        result = true; // Set result to true if the word is found
      }
    }
    return result; // Return true if the word is found, false otherwise
  }

  /**
   * 
   * @param word
   * @param minCharacters
   * @return true if the String word is at least minCharacters long and exists in
   *         array words, false otherwise
   * 
   *         IMPORTANT: Note the array of Strings (words) is available as a field
   *         in this class, so you don't need to pass it.
   *         Note: Array words holds Strings in uppercases
   */
  public static boolean isValid(String word, int minCharacters) {
    // Convert the word to uppercase for case-insensitive comparison
    String wordUpperCase = word.toUpperCase();

    // Initialize variables for checking and result
    boolean check = false; // Indicates if the word is found in the array
    boolean result = false; // Indicates if the word is valid based on criteria

    // Iterate through the array to check if the word exists
    for (int i = 0; i < words.length; i++) {
      if (words[i].equals(wordUpperCase)) { // Check if the word is found
        check = true; // Set check to true if the word is found
        break; // Exit the loop since the word is found
      }
    }

    // Check if the word is found in the array and its length is greater than
    // minCharacters
    if (check && wordUpperCase.length() > minCharacters) {
      result = true; // Set result to true if the word meets the criteria
    }

    return result; // Return true if the word is valid, false otherwise
  }

  /**
   * 
   * @param s
   * @return true if the string is a palindrome, false otherwise
   */
  public static boolean isPalindrome(String s) {
    boolean result = true; // Assume the string is a palindrome initially
    String sLowerCase = s.toLowerCase(); // Convert the string to lowercase for case-insensitive comparison

    // Iterate through the characters of the string
    for (int i = 0; i < s.length(); i++) {

      // Check if the character at index i is not equal to its corresponding character
      // from the end
      if (sLowerCase.charAt(i) != sLowerCase.charAt(s.length() - i - 1)) {
        result = false; // Set result to false if characters don't match
      }
    }
    return result; // Return true if the string is a palindrome, false otherwise
  }

  /**
   * 
   * @param s
   * @return true if the string contains any letter more than once, false
   *         otherwise
   */
  public static boolean containsDuplicateLetter(String s) {
    String sLowerCase = s.toLowerCase(); // Convert the string to lowercase for case-insensitive comparison
    boolean result = false; // Assume no duplicate letters initially

    // Iterate through the characters of the string
    for (int i = 0; i < s.length() - 1; i++) {

      // Iterate through the remaining characters to check for duplicates
      for (int k = i + 1; k < s.length(); k++) {

        // Check if the characters at positions i and k are the same
        if (sLowerCase.charAt(i) == sLowerCase.charAt(k)) {
          result = true; // Set result to true if duplicate letters are found
        }
      }
    }

    return result; // Return true if the string contains duplicate letters, false otherwise
  }

  /**
   * 
   * @param s
   * @return true if the string is sorted in ascending order, false otherwise
   */
  public static boolean isAscending(String s) {
    boolean result = true; // Assume the string is sorted in ascending order initially
    String sLowerCase = s.toLowerCase(); // Convert the string to lowercase for case-insensitive comparison

    // Iterate through the characters of the string
    for (int i = 0; i < sLowerCase.length() - 1; i++) {

      // Check if the current character is greater than the next character
      if (sLowerCase.charAt(i) > sLowerCase.charAt(i + 1)) {
        result = false; // Set result to false if characters are not in ascending order
      }
    }
    return result; // Return true if the string is sorted in ascending order, false otherwise
  }

  /**
   * 
   * @param s
   * @return true if the string is sorted in descending order, false otherwise
   */
  public static boolean isDescending(String s) {
    boolean result = true; // Assume the string is sorted in descending order initially
    String sLowerCase = s.toLowerCase(); // Convert the string to lowercase for case-insensitive comparison

    // Iterate through the characters of the string
    for (int i = 0; i < sLowerCase.length() - 1; i++) {

      // Check if the current character is less than the next character
      if (sLowerCase.charAt(i) < sLowerCase.charAt(i + 1)) {
        result = false; // Set result to false if characters are not in descending order
      }
    }
    return result; // Return true if the string is sorted in descending order, false otherwise
  }

  /**
   * 
   * @param s
   * @return true if the string is sorted in ascending or descending order, false
   *         otherwise
   */
  public static boolean isSorted(String s) {
    boolean asc = true; // Assume the string is sorted in ascending order initially
    boolean desc = true; // Assume the string is sorted in descending order initially
    String sLowerCase = s.toLowerCase(); // Convert the string to lowercase for case-insensitive comparison

    if (sLowerCase.length() == 1) {
      return true; // Return true if the string has only one character (it's considered sorted)
    }

    // Iterate through the characters of the string
    for (int i = 0; i < sLowerCase.length() - 1; i++) {

      // Check if the current character is greater than the next character (ascending
      // order)
      if (sLowerCase.charAt(i) > sLowerCase.charAt(i + 1)) {
        asc = false; // Set asc to false if characters are not in ascending order
      }

      // Check if the current character is less than the next character (descending
      // order)
      if (sLowerCase.charAt(i) < sLowerCase.charAt(i + 1)) {
        desc = false; // Set desc to false if characters are not in descending order
      }
    }

    // Return true if either ascending or descending order is detected, false
    // otherwise
    return asc || desc;
  }

  /**
   * @param from
   * @param s
   * @return true if it is possible to create the string "s" from the string
   *         "from", false otherwise
   */
  public static boolean checkIfPossible(String from, String s) {
    String fromLowerCase = from.toLowerCase(); // Convert "from" to lowercase
    String sLowerCase = s.toLowerCase(); // Convert "s" to lowercase
    boolean result = false; // Assume it's not possible to create "s" from "from" initially

    // Check if the length of "s" is greater than the length of "from"
    if (s.length() > from.length()) {
      return false; // Return false if "s" cannot be created from "from"
    }

    // Iterate through the characters of "s"
    for (int i = 0; i < s.length(); i++) {

      // Iterate through the characters of "from"
      for (int k = 0; k < from.length(); k++) {

        // Check if the current character of "s" matches any character in "from"
        if (sLowerCase.charAt(i) == fromLowerCase.charAt(k)) {
          result = true; // Set result to true if a match is found
        }
      }
    }

    return result; // Return true if it is possible to create "s" from "from", false otherwise
  }

  /**
   * 
   * @param word
   * @param minCharacters
   * @return the first word in the array words that matches target, null if no
   *         word matches it.
   *         the dot character ('.') should be treated like a wildcard.
   *         So, match(".elong", 5) should return "belong", "b.llo" should return
   *         "bello",
   *         while "pcka." should return null.
   * 
   *         IMPORTANT: Note the array of Strings (words) is available as a field
   *         in this class, so you don't need to pass it.
   *         Note: Array words holds Strings in uppercases
   * 
   *         minCharacters is a bit of a confusing point here.
   *         Just return null if target.length() < minCharacters, and after that,
   *         if the control is still in the function, ignore it all together.
   * 
   *         The word you return, if any, should be of the same length as target.
   */
  public static String match(String target, int minCharacters) {
    String targetUpperCase = target.toUpperCase();
    String result = null; // Initialize result to null

    // Check if target length is less than minCharacters
    if (target.length() < minCharacters) {
      result = null; // Return null if target length is less than minCharacters
    }

    String check = targetUpperCase.replace(".","\\w");
    for(int i=0; i < words.length; i++) {
      String word = words[i];
      if (word.matches(check)) {
        result = word;
      }
    }
    return result;
  }

  public static Node removeNth(Node start1, int n) {
		Node dummy = new Node(-1);
		dummy.next = start1;

		Node first = dummy;
		Node second = dummy;

		for (int i=0; i<n; i++) {
			second = second.next;
		}

		while (second.next != null) {
			first = first.next;
			second = second.next;
		}

		first.next = first.next.next;
		return dummy.next;
	}
}




