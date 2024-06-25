import java.util.Random;

public class insertionsort{
    public static void main(String[]args){
        Random rand = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = rand.nextInt(100);
        }
        System.out.println(numbers);
        insertionsort(numbers);
    }

    private static void insertionsort(int[] inputArray){
        for (int i = 1; i < inputArray.length; i++){
            int currentValue = inputArray[i];
            int j = i -1;
            while (j >= 0 && inputArray[j] > currentValue){
                inputArray[j + 1] = inputArray[j];
                j = j - 1;
            }
            inputArray[j + 1] = currentValue;
        }
    }
}