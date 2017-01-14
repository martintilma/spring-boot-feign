package nl.trifork.github;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


/**
 *
 */
@FeignClient(name="github", url = "https://api.github.com")
public interface GitHub {

    @RequestMapping(method = RequestMethod.GET, value = "/repos/{owner}/{repo}/contributors")
    List<Contributor> contributors(@RequestParam("owner") String owner, @RequestParam("repo") String repo);
}
