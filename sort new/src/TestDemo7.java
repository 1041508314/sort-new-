/**
 * @Version 1.0
 * @Author:LiuXinYu
 * 泛型的边界
 * @Date:2020/5/29
 * @Content:
 */

import java.util.Comparator;

/**
 * 写一个泛型类  包含一个方法  该方法是找到数组中的最大值
 *
 * T extends Comparable<T> 上界
 * T一定是实现了Comparable接口的
 * 泛型没有下界
 */


/**
 *
 * 类型推导 -》 根据实参的类型推导出形参的类型
 */
class Generic2{
    public static <T extends Comparable<T>>  T maxNum(T[] array){
        T max = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i].compareTo(max) > 0){
                max = array[i];
            }
        }
        return max;
    }
}

class Generic<T extends Comparable<T>>{
    public T maxNum(T[] array){
        T max = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i].compareTo(max) > 0){
                max = array[i];
            }
        }
        return max;
    }
}

public class TestDemo7 {
    public static void main(String[] args) {
        Integer[] array = {12,4,2,87,5,19};
        System.out.println(Generic2.maxNum(array));
        String[] strings = {"hello","bit","abc"};
        System.out.println(Generic2.maxNum(strings));
    }


    public static void main1(String[] args) {
        Generic<Integer> generic = new Generic<>();
        Integer[] array = {12,4,2,87,5,19};
        System.out.println(generic.maxNum(array));

        Generic<String> generic2 = new Generic<>();
        String[] strings = {"hello","bit","abc"};
        System.out.println(generic2.maxNum(strings));
    }
}
