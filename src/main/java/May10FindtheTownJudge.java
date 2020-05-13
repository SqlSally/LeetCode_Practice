
import java.util.HashSet;

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
 * Input: N = 2, trust = [[1,2]] Output: 2
 *
 * 3 （1，3） （2，3） (3.1)
 *
 * j =
 * N-1 = 2
 *
 * @author sally
 */
public class May10FindtheTownJudge {

  public int findJudge(int N, int[][] trust) {

    HashSet<Integer> hashSet;

    for (int j = 1; j <= N; j++) {
      hashSet = new HashSet<>();
      int isjudge = 0;
      for (int[] trt : trust) {
        if (trt[0] == j) {
          isjudge = 1;
        }
        if (trt[1] == j) {
          hashSet.add(trt[0]);
        }
      }
      if (isjudge == 0 && hashSet.size() == (N - 1) && !hashSet.contains(j)) {
        return j;
      }
    }
    return -1;
  }

}
