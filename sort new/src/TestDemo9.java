import com.sun.org.apache.xml.internal.utils.Hashtree2Node;

import java.util.*;

/**
 * @Version 1.0
 * @Author:LiuXinYu
 * @Date:2020/5/29
 * @Content:
 */
public class TestDemo9 {
    //十万个数据 统计重复的数字出现的次数
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10_0000; i++) {
            list.add(random.nextInt(6000));
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        //key --> 关键字 重复的数字
        //value --> 重复的数字出现的次数
        for (Integer key: list) {
            if(map.get(key) == null){
                map.put(key,1);
            }else {
                Integer val = map.get(key);
                map.put(key,val+1);
            }
        }
        for (Map.Entry<Integer ,Integer> entry:map.entrySet()) {
            System.out.println(entry.getKey()+ "这个数字出现了"+entry.getValue()+"次");
        }
    }


    //十万个数据有重复的元素 去掉重复的元素
    // 大数据去重问题
    public static void main4(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10_0000; i++) {
            list.add(random.nextInt(6000));
        }
        HashSet<Integer> set = new HashSet<>();
        for (Integer val:list) {
            set.add(val);
        }
        System.out.println(set);
    }




    //十万个数据中第一个重复的元素

    public static void main3(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(6));
        }
        System.out.println(list);
        HashSet<Integer> set = new HashSet<>();
        for (Integer val:list) {
            if(set.contains(val)){
                System.out.println("找到了第一个重复的元素" + val);
                return;
            }else{
                set.add(val);
            }
        }
    }



    //set中存放的元素是不重复的
    public static void main2(String[] args) {
        Set<Integer> set =  new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        System.out.println(set);

        Iterator<Integer> it = set.iterator();//迭代器
        while(it.hasNext()){
        System.out.print(it.next());
        //打印it的下一个 并且it向后走一步
            // List  Queue Set 都可以使用迭代器进行打印
            //map使用迭代器打印的时候需要进行转换
            //1.将map当中的数据转化为set
        }
    }


    public static void main1(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"caocao");
        map.put(2,"zhangfei");
        map.put(3,"guanyu");
        for (Map.Entry<Integer,String> entry : map.entrySet()) {
            System.out.println(entry.getKey()+ " " + entry.getValue());
        }
    }
}
