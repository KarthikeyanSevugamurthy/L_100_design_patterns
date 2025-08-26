import java.util.Arrays;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 3};

        SortContext context = new SortContext();

        // Using Bubble Sort
        context.setStrategy(new BubbleSort());
        context.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        // Using Quick Sort
        numbers = new int[]{5, 2, 8, 1, 3}; // reset
        context.setStrategy(new QuickSort());
        context.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}