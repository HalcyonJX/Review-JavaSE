package com.fangyuan.object.demo9;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,534,323,45,23,452};
        //打印数组
        System.out.println(Arrays.toString(arr));
        //数组排序
        Arrays.sort(arr);
        //快速填充
        int[] arr1 = new int[10];
        Arrays.fill(arr1,55);
        //快速对数组进行拷贝
        int[] target = Arrays.copyOf(arr,6);
        target = Arrays.copyOfRange(arr,3,5);
        //将一个数组中的内容拷贝到其他数组
        System.arraycopy(arr,0,target,0,6);
        //二分查找
        Arrays.binarySearch(arr,6);
        //多维数组打印
        int[][] array = {{2,5,6},{23,45,32}};
        Arrays.deepToString(array);
        //判断数组内元素是否相等
        Arrays.equals(arr,target);
        Arrays.deepEquals(array,new int[][]{{2,5,6},{23,45,32}});
    }
}
