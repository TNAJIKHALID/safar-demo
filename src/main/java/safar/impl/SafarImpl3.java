package safar.impl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import safar.interfaces.SafarInterface;
import safar.model.SafarModel;

@RestController
@RequestMapping(value = "/SafarImpl3")
public class SafarImpl3 implements SafarInterface {

    @Override
    public void safarMethod(String input) {

    }

    @Override
    @GetMapping("getSafarModel")
    public SafarModel getSafarModel(String text) {
        return new SafarModel("input text", "result impl 3");
    }
}
