package Java.dsaQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*167. Two Sum II - Input Array Is Sorted

Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order,
find two numbers such that they add up to a specific target number. Let these two numbers
be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.

Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.

The tests are generated such that there is exactly one solution. You may not use the same element twice.

Your solution must use only constant extra space.
Example 1:
Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
Example 2:
Input: numbers = [2,3,4], target = 6
Output: [1,3]
Explanation: The sum of 2 and 4 is 6. Therefore index1 = 1, index2 = 3. We return [1, 3].
Example 3:
Input: numbers = [-1,0], target = -1
Output: [1,2]
Explanation: The sum of -1 and 0 is -1. Therefore index1 = 1, index2 = 2. We return [1, 2].*/
public class TwoSUm {
    public static List<int[]> twoSum(int[] arr, int target) {
        List<int[]> result = new ArrayList<>();
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int currentSum = arr[left] + arr[right];
            if (currentSum == target) {
                //return new int[]{left+1,right+1}; //for returning only one set of possible pair
                result.add(new int[]{left + 1, right + 1});
                left++;
                right--;
                //while (left < right && arr[left] == arr[left - 1]) left++;
                //while (left < right && arr[right] == arr[right + 1]) right--;

            } else if (currentSum < target) {
                left++;
            } else {
                right--;
            }
        }
        //return new int[]{-1,-1};
        return result;
    }

    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 3, 2, 4, 2, 8};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        List<int[]> pairs = twoSum(array, 5);
        for (int[] pair : pairs) {
            System.out.println(Arrays.toString(pair));
        }
    }

}
