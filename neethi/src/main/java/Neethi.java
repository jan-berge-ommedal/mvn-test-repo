import org.codehaus.stax2.ri.EmptyIterator;

public class Neethi {
    public static void main(String[] args) {
        System.out.println("!");
        EmptyIterator instance = EmptyIterator.getInstance();
        System.out.println(instance);
    }
}