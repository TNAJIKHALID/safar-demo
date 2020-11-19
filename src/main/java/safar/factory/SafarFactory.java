package safar.factory;
import safar.impl.SafarImpl1;
import safar.impl.SafarImpl2;
import safar.impl.SafarImpl3;
import safar.interfaces.SafarInterface;

public class SafarFactory {
    private static SafarInterface safarImpl2;
    private static SafarInterface safarImpl1;
    private static SafarInterface safarImpl3;

    public static SafarInterface getSafarImpl1() {
        return new SafarImpl1();
    }

    public static SafarInterface getSafarImpl2() {
        return new SafarImpl2();
    }

    public static SafarInterface getSafarImpl3() {
        return new SafarImpl3();
    }
}
