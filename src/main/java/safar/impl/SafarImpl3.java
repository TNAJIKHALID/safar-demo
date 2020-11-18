package safar.impl;

import safar.interfaces.SafarInterface;
import safar.model.SafarModel;

public class SafarImpl3 implements SafarInterface {

    @Override
    public void safarMethod(String input) {

    }

    @Override
    public SafarModel getSafaModel(String text) {
        return new SafarModel("input text", "result impl 3");
    }
}
