import org.codehaus.stax2.ri.EmptyIterator;

import java.util.Iterator;

public class Cxf {
    public static void main(String[] args) {
        System.out.println("!");
        Iterator<Object> instance = EmptyIterator.getInstance();
        System.out.println(instance);
    }
}