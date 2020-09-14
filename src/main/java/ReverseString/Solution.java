package ReverseString;

/**
 * Input: ["h","e","l","l","o"] Output: ["o","l","l","e","h"]
 *
 * @author sally
 */
public class Solution {

  public void reverseString(char[] s) {
    int size = s.length - 1;
    char temp;
    int j = 0;

    while (j < size) {
      temp = s[j];
      s[j] = s[size];
      s[size] = temp;
      j++;
      size--;
    }
    System.out.print(s);
  }


  public static void main(String[] args) {
    Solution solution = new Solution();
    char[] JavaCharArray = {'h', 'e'};
    solution.reverseString(JavaCharArray);
  }
}
