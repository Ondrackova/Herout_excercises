import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UniqueNumber {

    public static int[]  findUniqueNumbers(int[] numbers) {

        int uniqueCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (i == numbers.length - 1 || numbers[i] != numbers[i + 1]) {
                uniqueCount++;
            }
        }

        int j = 0;
        int[] output = new int[uniqueCount];
        for (int i = 0; i< numbers.length;i++) {
            if ( (i == numbers.length-1) || (numbers[i] != numbers[i+1])){
                output[j] = numbers[i];
                j++;
            }
        }
        return output;
    }

    public static Object[] findUniqueThroughHashSet(int[] numbers) {
        Set<Integer> set = new HashSet<>();

         for (int number : numbers) {
            set.add(number);
        }
        return set.toArray();
    }

    public static void main (String[] args){
        int[] array = {1,2,2,2,4,4,4,5,5,6,7,8,8,9};
        //int[] unique = findUniqueNumbers(array);
        Object[] unique = findUniqueThroughHashSet(array);
        System.out.println(Arrays.toString(unique));

    }
}
