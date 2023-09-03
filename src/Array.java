public class Array {

    public static void main(String[] args) {
        double[] exampleArray = {1,5,6,5,4,1};
        double sum = 0;
        for (double value : exampleArray) {
            sum += value;
        }
        System.out.println(sum);


        double maximum = exampleArray[0];
        int index = 0;
        for (int i = 1; i < exampleArray.length; i++) {
            if (exampleArray[i] > maximum) {
                maximum = exampleArray[i];
                index = i;
            }
        }
        System.out.println(index);


        int[] result = toPower(4, 2);
        for (int value : result) {
            System.out.print(value + " ");
        }
    }

    public static int[] toPower(int size, int power) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) Math.pow(i, power);
        }
        return array;
    }
}

