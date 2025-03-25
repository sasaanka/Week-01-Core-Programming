import java.util.Random;

public class Football {
    public static int[] generatePlayerHeights(int size) {
        int[] heights = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            heights[i] = 150 + random.nextInt(101);
        }

        return heights;
    }
    public static int calculateSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }
    public static double calculateMeanHeight(int[] heights) {
        return (double) calculateSum(heights) / heights.length;
    }
    public static int findShortestPlayer(int[] heights) {
        int min = heights[0];
        for (int height : heights) {
            min = Math.min(min, height);
        }
        return min;
    }
    public static int findTallestPlayer(int[] heights) {
        int max = heights[0];
        for (int height : heights) {
            max = Math.max(max, height);
        }
        return max;
    }

    public static void main(String[] args) {
        int size = 11; 
        int[] playerHeights = generatePlayerHeights(size); 
        double meanHeight = calculateMeanHeight(playerHeights);
        int shortestHeight = findShortestPlayer(playerHeights);
        int tallestHeight = findTallestPlayer(playerHeights);
        System.out.print("Player Heights: ");
        for (int height : playerHeights) {
            System.out.print(height + "cm ");
        }
        System.out.println("\nMean Height: " + String.format("%.2f", meanHeight) + " cm");
        System.out.println("Shortest Player: " + shortestHeight + " cm");
        System.out.println("Tallest Player: " + tallestHeight + " cm");
    }
}
