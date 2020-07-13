
import java.util.HashMap;
import java.util.Map;

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
 * Given an array of size n, find the majority element. The majority element is the element that
 * appears more than ⌊ n/2 ⌋ times.
 *
 * You may assume that the array is non-empty and the majority element always exist in the array.
 * Input: [3,2,3] Output: 3 Input: [2,2,1,1,1,2,2] Output: 2
 *
 * @author sally
 */
public class MajorityElement {

  public int majorityElement(int[] nums) {

    HashMap<Integer, Integer> hashMap = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      if (hashMap.containsKey(nums[i])) {
        hashMap.put(nums[i], hashMap.get(nums[i]) + 1);
      } else {
        hashMap.put(nums[i], 1);
      }
    }

    int max = Integer.MIN_VALUE;

    for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
      int key = entry.getKey();
      int val = entry.getValue();
      if (key > max && val > nums.length / 2) {
        max = key;
      }
    }
    return max;
  }

  public static void main(String[] args) {
    int[] nums = new int[3];
    nums[0] = 6;
    nums[1] = 5;
    nums[2] = 5;

    int majorityElement = new MajorityElement().majorityElement(nums);
    System.out.println(majorityElement);

  }
}
