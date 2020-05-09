

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
 * Do not use any built-in library function such as sqrt.
 * Given a positive integer num, write a function which returns True if num is a perfect square else False.
 *
 * @author sally
 */
public class May9 {

  public boolean isPerfectSquare(long num) {
    if (num <= 0) {
      return false;
    }
    int n = 1;

    while (n * n <= num) {
      if (n * n == num) {
        return true;
      }
      n++;
    }
    return false;
  }

  public static void main(String[] args) {
    May9 may9 = new May9();
    boolean perfectSquare = may9.isPerfectSquare(101);
    System.out.println(perfectSquare);

  }
}
