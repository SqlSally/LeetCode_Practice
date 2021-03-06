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
public class RunningSumof1dArray {

  class Solution {

    public int[] runningSum(int[] nums) {
      int[] output = new int[nums.length];
      for (int i = 0; i < nums.length; i++) {
        int sum = 0;
        for (int j = 0; j <= i; j++) {
          sum += nums[j];
        }
        output[i] = sum;
      }
      return output;
    }
  }
}
