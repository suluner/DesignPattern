public class Facade {
    private SystemA systemA = new SystemA();
    private SystemB systemB = new SystemB();

    public void wrapOperation (){
        systemA.operationA();
        systemB.operationB();
    }
}
