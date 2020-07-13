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
 * You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once. Find this single element that appears only once
 *Input: [1,1,2,3,3,4,4,8,8]
 * Output: 2
 *
 * @author sally
 */
public class SingleElementinaSortedArray {

  public int singleNonDuplicate(int[] nums) {
    if (nums.length == 1) {
      return nums[0];
    }
    for (int i = 0; i < nums.length; i = i + 2) {
      if (i == nums.length - 1) {
        return nums[i];
      }
      if (nums[i] == nums[i + 1]) {
      } else {
        return nums[i];
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int[] name = new int[5];
    name[0] = 1;
    name[1] = 1;
    name[2] = 2;
    name[3] = 2;
    name[4] = 3;
//    name[5] = 4;
//    name[6] = 4;
//    name[7] = 5;
//    name[8] = 5;
    SingleElementinaSortedArray may12SingleElementinaSortedArray = new SingleElementinaSortedArray();
    int singleNonDuplicate = may12SingleElementinaSortedArray.singleNonDuplicate(name);
    System.out.println(singleNonDuplicate);
  }

}
