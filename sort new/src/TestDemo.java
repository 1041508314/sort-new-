/**
 * @Version 1.0
 * @Author:LiuXinYu
 * @Date:2020/5/28
 * @Content:
 */
class Card{
    public int rank;
    public String suit;
    public Card(int rank,String suit){
        this.rank = rank;
        this.suit = suit;
    }

    @Override//equals比较两个是否是相同的对象 有时候需要重写equals
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }

        if(obj == null || !(obj instanceof Card)){
            return false;
        }

        Card tmp = (Card)obj;
        if(this.rank == tmp.rank && this.suit.equals(tmp.suit)){
            return true;
        }
        return false;
    }
}
public class TestDemo {
    public static void main(String[] args) {
        Card card1 = new Card(5,"♥");
        Card card2 = new Card(5,"♥");
        System.out.println(card1 == card2);
        System.out.println(card1.equals(card2));
    }
}
