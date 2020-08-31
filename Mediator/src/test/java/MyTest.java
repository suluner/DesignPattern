import colleague.Colleague;
import colleague.ConcreteColleague1;
import colleague.ConcreteColleague2;
import mediator.ConcreteMediator;
import mediator.Mediator;

public class MyTest {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();

        //构建具体的同事类
        Colleague colleague1 = new ConcreteColleague1();
        Colleague colleague2 = new ConcreteColleague2();

        //注册同事
        mediator.register(colleague1);
        mediator.register(colleague2);

        //发送消息
        colleague1.send();
        colleague2.send();
    }
}
