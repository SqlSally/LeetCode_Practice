
import java.util.HashSet;

/**
 *
 * @author sally You're given strings J representing the types of stones that are jewels, and S
 * representing the stones you have. Each character in S is a type of stone you have. You want to
 * know how many of the stones you have are also jewels.
 *
 * The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are
 * case sensitive, so "a" is considered a different type of stone from "A". Input: J = "aA", S =
 * "aAAbbbb" Output: 3 case sensitive
 */
public class JewelsandStones {

  public int numJewelsInStones(String J, String S) {
    HashSet<Character> hashSet = new HashSet<>();

    for (int i = 0; i < J.length(); i++) {
      char jew = J.charAt(i);
      hashSet.add(jew);
    }
    int value = 0;
    for (int i = 0; i < S.length(); i++) {
      char jew = S.charAt(i);
      if (hashSet.contains(jew)) {
        value++;
      }
    }
    return value;
  }

  public static void main(String[] args) {
    String J = "aa";
    String S = "Abbbb";
    int numJewelsInStones = new JewelsandStones().numJewelsInStones(J, S);
    System.out.println(numJewelsInStones);
  }
}
