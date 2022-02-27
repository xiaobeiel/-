/*
2022年2月27日12点01分
数组元素排序改变的是位置
冒泡排序、每轮循环沉底一个元素（13）
* */

package Test;

public class Array {
    public static void main(String[] args) {
        int[] array = new int[]{78,24,14,25,157};
        for(int i = 0;i < array.length-1;i++){ //外层循环控制两两比较的次数
            for(int j = 0;j < array.length-1-i;j++){//内层循环每轮循环沉底一个元素，即-i实现
                if(array[j] > array[j+1]){//符合条件的元素进行交换
                    int m = array[j];
                    array[j] = array[j+1];
                    array[j+1] = m;
                }
            }
            System.out.print("第"+(i+1)+"轮排序:");//i+1表示第几轮的次数
            for(int j = 0;j< array.length;j++){//此处没有-1，因为是要输出5个元素，根据情况而定
                System.out.print(array[j]+"\t");// \t将元素按制位表对齐
            }
            System.out.println();//println将光标换到下一行开头
        }
        System.out.print("最 终排序:");//汇总结果
        for(int i = 0;i < array.length;i++)//此时已经将元素的按从小到大排好了
            System.out.print(array[i]+"\t");
    }
}
