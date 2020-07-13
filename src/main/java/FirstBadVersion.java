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
public class FirstBadVersion {

  public int firstBadVersion(int n) {
    int l = 1, r = n;
    while (l < r) {
      int m = l + (r - l) / 2;
      if (isBadVersion(m)) {
        r = m;
        continue;
      }
      l = m + 1;
    }
    return l;
  }

  private boolean isBadVersion(int i) {
    if (i >= 4) {
      return true;
    }
    return false;
  }

  public static void main(String[] args) {
    FirstBadVersion mayFirst = new FirstBadVersion();
    int firstBadVersion = mayFirst.firstBadVersion(5);
    System.out.println(firstBadVersion);
  }
}
