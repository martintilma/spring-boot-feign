package nl.trifork.web;

import nl.trifork.github.Contributor;
import nl.trifork.github.GitHub;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collections;
import java.util.List;

@Controller
public class IndexController {


    private final GitHub gitHub;

    @Autowired
    public IndexController(GitHub gitHub) {
        this.gitHub = gitHub;
    }

    @RequestMapping(value = "/")
    public String index(Model model) {

        model.addAttribute("contributors", gitHub.contributors("AxonFramework", "AxonFramework"));

        return "index";
    }

    @RequestMapping("contributors")
    @ResponseBody
    public List<Contributor> contributors() {
        return gitHub.contributors("AxonFramework", "AxonFramework");
    }

}
