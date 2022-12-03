package ExerciciosBootcamp;

import java.util.Scanner;

public class MatrizesTeste {

    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] nums = new int[N];
        for (int j = 0; j < nums.length; j++) {
            nums[j] = input.nextInt();
        }

        for (int j = 0, p = 0; j < nums.length; j++) {

            if (nums[j] % 2 == 0) {
                int temp = nums[j];
                nums[j] = nums[p];
                nums[p++] = temp;
            }
        }
        for (int j = 0; j < nums.length; System.out.println(nums[j++]))
            ;
    }
}
