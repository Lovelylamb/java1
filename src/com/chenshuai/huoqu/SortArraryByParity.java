package com.chenshuai.huoqu;

/**
 * leetcode 905. 按奇偶排序数组
 *
 * 参考：https://blog.csdn.net/qq_45619426/article/details/104198339
 *
 * 给定一个非负整数数组 A，返回一个数组，在该数组中， A 的所有偶数元素之后跟着所有奇数元素。可以返回满足此条件的任何数组作为答案。
 * 该题目来自力扣题库
 * 示例
 * 输入：[3,1,2,4]
 * 输出：[2,4,3,1]
 * 输出 [4,2,3,1]，[2,4,1,3] 和 [4,2,1,3] 也会被接受。
 *
 * 思路
 * 使用双指针 i ，j 。i从0开始往后走，j从A.length-1往前走。设置一个循环让i要小于j。
 * 总体是想让偶数在前，奇数在后；那么如果 i 所指的数字是偶数的话，确保了偶数在前排，之后让 i++判断后面的内容。如果 j 所指的数字是奇数的话，同样也确保了奇数在后的条件，之后 j-- 判断前面的内容。如果不是前两者，那么就满足 i 所指的内容是奇数，j 所指的内容是偶数，要确保偶数在前.奇数在后，这样就交换 i 与 j 所指的内容。
 * 循环完成后，则返回数组。
 * */

public class SortArraryByParity {

    public static void main(String[] args) {
        SortArraryByParity sortArraryByParity=new SortArraryByParity();
        int[] a = {1,55,3,6,8,50,99,5,2,4};
        int[] b = sortArraryByParity.sortArrayByParity(a);
            for(int i=0;i<b.length;i++){
                System.out.print(b[i]+" ");
            }
        }


    public int[] sortArrayByParity(int[] array){
        int i=0;
        int j=array.length-1;
        while(i<j){
            if(array[i]%2==0){
                i++;
            }else if(array[j]%2==1){
                j--;
            }else{
                int temp = 0;
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        return array;
    }
}
