import java.lang.reflect.Proxy;

public class MyTest {
    public static void main(String[] args) {
        Rent host = new Host();
        RentInvocationHandler rentInvocationHandler = new RentInvocationHandler(host);
        Rent hostProxy = (Rent) Proxy.newProxyInstance(host.getClass().getClassLoader(), host.getClass().getInterfaces(), rentInvocationHandler);
        hostProxy.rent();
        hostProxy.show();
    }
}
