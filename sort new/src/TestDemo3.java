import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @Version 1.0
 * @Author:LiuXinYu
 *
 * 比较器
 * @Date:2020/5/28
 * @Content:
 */

class Person{
    public int age;
    public int score;
    public String name;
    public Person(String name,int age,int score){
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", score=" + score +
                ", name='" + name + '\'' +
                '}';
    }
}
public class TestDemo3 {
    public static void main(String[] args) {
        AgeComparator ageComparator = new AgeComparator();
        PriorityQueue<Person> priorityQueue = new PriorityQueue<>(ageComparator);
        priorityQueue.offer(new Person("bit",16,89));
        priorityQueue.offer(new Person("lxy",22,100));
        System.out.println(priorityQueue);

    }




    public static void main2(String[] args) {
        Person person1 = new Person("bit",16,89);
        Person person2 = new Person("lxy",22,100);
        Person person3 = new Person("ghb",20,520);
        Person[] people = new Person[3];
        people[0] = person1;
        people[1] = person2;
        people[2] = person3;
        AgeComparator ageComparator = new AgeComparator();
        Arrays.sort(people,ageComparator);
        System.out.println(Arrays.toString(people));
    }





    public static void main1(String[] args) {
        Person person1 = new Person("bit",16,89);
        Person person2 = new Person("lxy",22,66);
        AgeComparator ageComparator = new AgeComparator();
        System.out.println(ageComparator.compare(person1,person2));
        ScoreComparator scoreComparator = new ScoreComparator();
        System.out.println(scoreComparator.compare(person1,person2));
    }
}
