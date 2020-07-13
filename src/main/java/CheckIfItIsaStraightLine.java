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
 * May 8
 * You are given an array coordinates, coordinates[i] = [x, y], where [x, y] represents the coordinate of a point. Check if these points make a straight line in the XY plane.
 *
 * @author sally
 */
public class CheckIfItIsaStraightLine {

  public boolean checkStraightLine(int[][] coordinates) {
    //y = ax + b

    if (coordinates.length == 2) {
      return true;
    }

    if (coordinates[0][0] == coordinates[1][0] && coordinates[0][1] != coordinates[1][1]) {
      return false;
    }
    int[] ab = calcualtion(coordinates[0], coordinates[1]);

    for (int[] coordinate : coordinates) {

      if (ab[0] * coordinate[0] + ab[1] != coordinate[1]) {
        return false;
      }
    }
    return true;

  }

  private int[] calcualtion(int[] coordinate1, int[] coordinate2) {
    int[] ab = new int[2];
    int x1 = coordinate1[0];
    int y1 = coordinate1[1];
    int x2 = coordinate2[0];
    int y2 = coordinate2[1];

    int a = (y2 - y1) / (x2 - x1);
    int b = y1 - a * x1;
    ab[0] = a;
    ab[1] = b;
    return ab;
  }

}
