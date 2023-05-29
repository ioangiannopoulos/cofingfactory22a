package gr.aueb.cf.ch6;

/**
 * Επιστρεφει τη θεση (index) του στοιχειου που αναζητα
 * ή αν δεν το βρει επιστρεφει -1.
 */
public class SecretArrayWithMethod {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6 };
        int value = 6;
        int position = 0;
        position = getElementPosition(arr, value);
        System.out.println(position);  // 5

    }

    public static int getElementPosition(int[] arr, int value) {
        if (arr == null) return -1;

        int position = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                position = i;
                break;
            }
        }
        return position;
    }
}
