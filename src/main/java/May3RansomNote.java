
import java.util.HashMap;

/*
 * Copyright 2020 sally.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 *
 * @author sally
 */
public class May3RansomNote {

  public boolean canConstruct(String ransomNote, String magazine) {
// add magazine character and count of each character into hashmap
    HashMap<Character, Integer> hashMap = new HashMap<>();
    for (int i = 0; i < magazine.length(); i++) {
      char magazineChar = magazine.charAt(i);
      if (hashMap.containsKey(magazineChar)) {
        int count = hashMap.get(magazineChar);
        count++;
        hashMap.put(magazineChar, count);
      } else {
        hashMap.put(magazineChar, 1);
      }
    }

    for (int i = 0; i < ransomNote.length(); i++) {
      char noteChar = ransomNote.charAt(i);
      if (hashMap.containsKey(noteChar)) {
        int count = hashMap.get(noteChar);
        if (count <= 0) {
          return false;
        }
        count--;
        hashMap.put(noteChar, count);
        continue;
      }
      return false;
    }
    return true;
  }

  public static void main(String[] args) {
    //bjaajgea
    //"affhiiicabhbdchbidghccijjbfjfhjeddgggbajhidhjchiedhdibgeaecffbbbefiabjdhggihccec"
    String find = "aa";
    String manazine = "ab";
    boolean canConstruct = new May3RansomNote().canConstruct(find, manazine);
    System.out.println(canConstruct);
  }
}
