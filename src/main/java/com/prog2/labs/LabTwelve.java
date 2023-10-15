package com.prog2.labs;

import java.util.HashMap;
import java.util.Map;

/**
 * @author adinashby
 *
 */
public class LabTwelve {

    /**
     * Write your test code below in the main (optional).
     *
     */
    public static void main(String[] args) {

    }

    /**
     * Please refer to the README file for question(s) description
     */
    public static int numberOfBoomerangs(int[][] points) {
        int count = 0;  // Initialize boomerang count to 0

        // Loop over each point as a reference point
        for (int[] point1 : points) {
            Map<Integer, Integer> distanceCount = new HashMap<>();  // Create a map to store count of squared distances

            // Loop over each point to calculate squared distance to the reference point
            for (int[] point2 : points) {
                // Ensure we don't calculate distance with itself
                if (point1 != point2) {
                    int distance = calcDistance(point1, point2);  // Get squared distance
                    // Update the count of this squared distance in the map
                    distanceCount.put(distance, distanceCount.getOrDefault(distance, 0) + 1);
                }
            }

            // Calculate number of boomerangs for each distance
            for (int val : distanceCount.values()) {
                count += val * (val - 1);
            }
        }
        return count;  
    }

    public static int calcDistance(int[] p1, int[] p2) {
        return (int) Math.sqrt(((p2[0] - p1[0]) * (p2[0] - p1[0])) + ((p2[1] - p1[1]) * (p2[1] - p1[1])));
    }

}
