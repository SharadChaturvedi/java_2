import java.util.ArrayList;
import java.util.Collections;

public class TSAlgo {
    // Define the number of cities
    private static final int NUM_CITIES = 5;

    // Define the distance matrix
    private static final int[][] distanceMatrix = {
        {0, 10, 15, 20, 25},
        {10, 0, 35, 30, 20},
        {15, 35, 0, 25, 30},
        {20, 30, 25, 0, 15},
        {25, 20, 30, 15, 0}
    };

    // Define the tour (path) to store the cities
    private ArrayList<Integer> tour = new ArrayList<>();

    public TSAlgo() {
        // Initialize the tour with the first city (0)
        tour.add(0);
    }

    // Nearest Neighbor algorithm
    public void nearestNeighbor() {
        int currentCity = 0;
        boolean[] visited = new boolean[NUM_CITIES];

        // Mark the first city as visited
        visited[currentCity] = true;

        // Loop until all cities are visited
        while (true) {
            int nearestCity = -1;
            int minDistance = Integer.MAX_VALUE;

            // Find the nearest unvisited city
            for (int i = 0; i < NUM_CITIES; i++) {
                if (!visited[i]) {
                    int distance = distanceMatrix[currentCity][i];
                    if (distance < minDistance) {
                        minDistance = distance;
                        nearestCity = i;
                    }
                }
            }

            // Add the nearest city to the tour
            tour.add(nearestCity);
            visited[nearestCity] = true;

            // If all cities are visited, break the loop
            if (tour.size() == NUM_CITIES) {
                break;
            }

            // Move to the next city
            currentCity = nearestCity;
        }

        // Add the first city to the end of the tour to complete the cycle
        tour.add(0);
    }

    // Calculate the total distance of the tour
    public int calculateDistance() {
        int distance = 0;
        for (int i = 0; i < tour.size() - 1; i++) {
            distance += distanceMatrix[tour.get(i)][tour.get(i + 1)];
        }
        return distance;
    }

    // Print the tour
    public void printTour() {
        System.out.print("Tour: ");
        for (int city : tour) {
            System.out.print(city + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        TSAlgo tsp = new TSAlgo();
        tsp.nearestNeighbor();
        tsp.printTour();
        System.out.println("Total distance: " + tsp.calculateDistance());
    }
}