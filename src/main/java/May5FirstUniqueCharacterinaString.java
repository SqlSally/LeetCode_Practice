
import java.util.HashMap;

/**
 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't
 * exist, return -1. s = leetcode return 0.
 *
 * s = loveleetcode return 2.
 *
 * @author sally
 */
public class May5FirstUniqueCharacterinaString {

  public int firstUniqChar(String s) {

    HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
    for (int i = 0; i < s.length(); i++) {

      char c = s.charAt(i);
      if (hashMap.containsKey(c)) {
        hashMap.put(c, hashMap.get(c) + 1);
      } else {
        hashMap.put(c, 1);

      }
    }

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (hashMap.get(c) == 1) {
        return i;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    May5FirstUniqueCharacterinaString may5 = new May5FirstUniqueCharacterinaString();
    int firstUniqChar = may5.firstUniqChar("loveleetcode");
    System.out.println(firstUniqChar);
  }
}
