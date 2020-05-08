
/**
 * Given a positive integer, output its complement number. The complement strategy is to flip the bits of its binary representation.
 * Input: 5
 * Output: 2
 * Explanation: The binary representation of 5 is 101 (no leading zero bits), and its complement is 010. So you need to output 2.
 *
 * @author sally
 */
public class May4 {

  public int findComplement(int num) {
    String toBinaryString = Integer.toBinaryString(num);
    String complement = "";
    for (int i = 0; i < toBinaryString.length(); i++) {
      if (toBinaryString.charAt(i) == '1') {
        complement = complement + "0";
      } else {
        complement = complement + "1";
      }
    }
    return Integer.parseInt(complement, 2);
  }

  public static void main(String[] args) {
    May4 may4 = new May4();
    int findComplement = may4.findComplement(1);
    System.out.println(findComplement);
  }
}
