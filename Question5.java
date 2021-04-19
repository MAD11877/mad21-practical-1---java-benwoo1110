import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */

    Map<Integer, Integer> numberMap = new HashMap<>();
    int currentMaxInt = Integer.MIN_VALUE;
    int currentMaxCount = Integer.MIN_VALUE;
    Scanner in = new Scanner(System.in);
    int numberOfInputs = in.nextInt();
    for (int i = 0; i < numberOfInputs; i++) {
      int input = in.nextInt();
      int maxCountForInput = numberMap.compute(input, (k, v) -> (v == null) ? 1 : ++v);
      if (maxCountForInput > currentMaxCount) {
        currentMaxInt = input;
        currentMaxCount = maxCountForInput;
      }
    }
    // System.out.println(numberMap);
    System.out.println(currentMaxInt);
  }
}
