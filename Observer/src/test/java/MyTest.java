import observer.Observer;
import observer.Player;
import subject.AllyControlCenter;
import subject.ConcreteAllyControlCenter;

public class MyTest {
    public static void main(String[] args) {
        AllyControlCenter acc = new ConcreteAllyControlCenter("金庸群侠");

        Observer player1 = new Player("杨过");
        acc.join(player1);

        Observer player2 = new Player("小龙女");
        acc.join(player2);

        Observer player3 = new Player("郭靖");
        acc.join(player3);

        Observer player4 = new Player("黄蓉");
        acc.join(player4);

        player4.beAttacked(acc);
    }
}