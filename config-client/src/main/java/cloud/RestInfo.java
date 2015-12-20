package cloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class RestInfo {
    @Value("${config-server}")
    private String configServer = "disabled";
    @RequestMapping(path = "/test", method = RequestMethod.GET)
    public String getInfo(){
        return configServer;
    }
}
