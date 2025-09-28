package org.example.util;

public class Metrics {
    public static void trackDepth(int depth) {
        System.out.println("Recursion depth: " + depth);
    }

    public static void trackComparison(int comparisons) {
        System.out.println("Comparisons: " + comparisons);
    }
}
