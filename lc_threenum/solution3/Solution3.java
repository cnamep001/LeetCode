package com.m.lc_threenum.solution3;


import java.util.*;

public class Solution3 {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> listList = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] > 0) {
                break;
            }
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                if (nums[i] + nums[left] + nums[right] == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    listList.add(list);
                    left++;
                    right--;
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                } else if (nums[i] + nums[left] + nums[right] < 0) {
                    left++;
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                } else {
                    right--;
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                }
            }
        }
        return listList;
    }

}

/**

 思路三：第一个指针从前往后遍历，另外两个指针在第一个指针设定的范围内对撞查找
 （1）首先对数组nums进行从小到大排序，此步骤可以调用Java中的库函数Arrays.sort()。

 （2）设置一个索引指针i依次从左到右遍历排序之后的nums数组。

 （3）对于每一个nums[i]，我们假设nums[i]是所要寻找的三个数中的最小数。
 那么如果nums[i] > 0，显然在本次循环中不可能找到另外两个数num[left]和nums[right]，
 使得满足条件nums[left] + nums[right] == 0 - nums[i]，我们直接break结束整个循环。

 （4）如果i > 1且nums[i] == nums[i - 1]，那么所找到的三个数的组合一定是一样的，
 我们直接continue跳过本轮i循环的后面的所有语句，直接i++进入下一轮循环。

 （5）设置left的初值为i + 1，right的初值为nums.length() - 1。当left < right时，
 我们可以一直寻找nums[left]和nums[right]这两个值。因此我们可以再在for循环内部设置一个while循环，
 条件是while(left < right)。

 （6）如果nums[left] + nums[right] == 0 - nums[i]，那么我们找到了一组三个数，
 我们将这三个数保存起来，并且令left++，right--。此时我们需要注意题目的要求：
 答案中不可以包含重复的三元组，因此如果left++以后的nums[left]和之前的nums[left]相等且满足条件left < right的话，
 我们依旧需要设置一个循环另left++，直到找到一个不同的元素为止。同理对right--进行同样的操作，
 如果right--以后的nums[right]和之前的nums[right]相等且满足条件left < right的话，我们依旧需要right--。

 （7）如果nums[left] + nums[right] > 0 - nums[i]，那么说明所寻找的两数太大了，
 我们需要进行right--的操作。同理为了避免重复三元组的出现，我们需要进行（6）中对right指针的操作。

 （8）如果nums[left] + nums[right] < 0 - nums[i]，那么说明所寻找的两数太小了，
 我们需要进行left++的操作。同理为了避免重复三元组的出现，我们需要进行（6）中对left指针的操作。

 首先，我们有一个排序过程，是O(nlog(n))级别的复杂度，其中n为nums数组的长度。
 而对于对撞双指针，我们的时间复杂度可以看成是O(n)级别的，而其外面还有一个指针在遍历整个数组，
 因此总的时间复杂度是O(n ^ 2)级别的。空间复杂度是O(1)级别的，整个过程中我们没有使用额外的空间。











 */