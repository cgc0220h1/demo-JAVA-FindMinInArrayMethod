public class NumberArray {
    public static int[] findMinArray (int[] array) {
        int min = array[0];
        int position = 0;
        int[] resultArray = new int[2];
        for (int index = 1; index < array.length; index++) {
            if (array[index] < min) {
                min = array[index];
                position = index;
            }
        }
        resultArray[0] = min;
        resultArray[1] = position;
        return resultArray;
    }

    public static void main(String[] args) {
        int[] demoArray = {4, 12, 7, 8, 1, 6, 9};
        int[] resultArray = findMinArray(demoArray);

        System.out.println("We have a sample array: ");
        for (int index = 0; index < demoArray.length; index++) {
            System.out.print(demoArray[index] + " ");
        }

        System.out.println();
        System.out.printf("The smallest element in the array is: %d at position %d", resultArray[0], resultArray[1]);
    }
}
