import java.util.Comparator;

/**
 * @Version 1.0
 * @Author:LiuXinYu
 * @Date:2020/5/28
 * @Content:
 */
public class ScoreComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.score - o2.score;
    }
}
