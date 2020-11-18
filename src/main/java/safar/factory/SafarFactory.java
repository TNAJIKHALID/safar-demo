package safar.factory;

import safar.impl.SafarImpl1;
import safar.impl.SafarImpl2;
import safar.impl.SafarImpl3;
import safar.interfaces.SafarInterface;

public class SafarFactory {
    private SafarInterface safarImpl2;
    private SafarInterface safarImpl1;
    private SafarInterface safarImpl3;

    public SafarInterface getSafarImpl1() {
        return new SafarImpl1();
    }

    public SafarInterface getSafarImpl2() {
        return new SafarImpl2();
    }

    public SafarInterface getSafarImpl3() {
        return new SafarImpl3();
    }
}
