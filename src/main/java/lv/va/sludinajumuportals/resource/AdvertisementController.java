package lv.va.sludinajumuportals.resource;

import java.util.Map;
import lv.va.sludinajumuportals.domain.Response;
import lv.va.sludinajumuportals.service.AdvertisementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class AdvertisementController {

    @Autowired
    private AdvertisementService advertisementService;

    @GetMapping(value = "/") // The address /
    @ResponseBody
    public String testEndpoint() {
        return ("<h1>Hello darkness my old friend!<h1> <br>");
    }

    @GetMapping(value = "/hey") // The address /hey
    @ResponseBody
    public Response nextTestEndpoint() {
        return new Response("Helo dankness my oll fren!");
    }

    @RequestMapping("/main")
    public String getUI(Map<String, Object> model) {
        model.put("message", "Hi");
        model.put("advertisement", advertisementService.getFullAdvertismentList(false));
        return "main";
    }

    @RequestMapping("/maid")
    public String getUI2(Map<String, Object> model) {
        model.put("message", "Hi");
        model.put("advertisement", advertisementService.getFullAdvertismentList(true));
        return "main";
    }

}
