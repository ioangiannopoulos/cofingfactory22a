package gr.aueb.cf.ch6;

/**
 * Αναζητα το ελαχιστο και μεγιστο
 * στοιχειο ενος πινακα.
 */

public class ArrayMinMaxApp {

    public static void main(String[] args) {
        int[] arr = {30, 12, 80, 7, 15};

        int minPosition = 0;
        int minValue = arr[minPosition];

        int maxPosition = 0;
        int maxValue = arr[maxPosition];

        //min-max
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minPosition = i;
                minValue = arr[i];
            }
            if (arr[i] > maxValue) {
                maxPosition = i;
                maxValue = arr[i];
            }
        }

        System.out.printf("Min value: %d, Min Position: %d\n", minValue, minPosition + 1);
        System.out.printf("Max value: %d, Max Position: %d", maxValue, maxPosition + 1);
    }
}
