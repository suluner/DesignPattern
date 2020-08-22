import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class RentInvocationHandler implements InvocationHandler {
    private Rent rent;

    public RentInvocationHandler(Rent rent) {
        this.rent = rent;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        before();
        Object invoke = method.invoke(rent, args);
        after();
        return invoke;
    }

    private void before() {
        System.out.println("-------before--------");
    }

    private void after() {
        System.out.println("-------after--------");
    }
}
