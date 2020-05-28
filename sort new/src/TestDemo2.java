import java.util.Arrays;

/**
 * @Version 1.0
 * @Author:LiuXinYu
 * @Date:2020/5/28
 * @Content:
 */

//如果实现了Comparable接口 每次业务不同 要去修改类本身
    //重点： 自定义类型为什么要实现比较
class Student implements Comparable<Student>{
    public int age;
    public int score;
    public String name;
    public Student(String name,int age,int score){
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public int compareTo(Student o) {
        //return this.age - o.age;
        return this.score - o.score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", score=" + score +
                ", name='" + name + '\'' +
                '}';
    }
}
public class TestDemo2 {
    public static void main(String[] args) {
        Student student1 = new Student("bit",16,89);
        Student student2 = new Student("lxy",22,100);
        Student student3 = new Student("ghb",20,520);
        Student[] students = new Student[3];
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
    }


    public static void main1(String[] args) {
        Student student1 = new Student("bit",16,89);
        Student student2 = new Student("lxy",22,100);
        if(student1.compareTo(student2) > 0){
            System.out.println("student1大于student2");
        }
    }
}
