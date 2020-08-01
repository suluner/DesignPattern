public class HouseProxy implements Rent{
    private Host host = new Host();
    public void rent() {
        beforeRent();
        host.rent();
        afterRent();
    }

    public void beforeRent() {
        System.out.println("Find a house.");
    }

    public void afterRent() {
        System.out.println("Sign a contract.");
    }
}
