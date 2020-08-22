public class MyTest {
    public static void main(String[] args) {
        Aggregate aggregate = new ConcreteAggregate();
        aggregate.add("a");
        aggregate.add("b");
        aggregate.add("c");
        Iterator iterator = aggregate.getIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
