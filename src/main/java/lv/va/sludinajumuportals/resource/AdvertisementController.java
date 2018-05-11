package lv.va.sludinajumuportals.resource;

import lv.va.sludinajumuportals.domain.Response;
import lv.va.sludinajumuportals.service.AdvertisementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;
import lv.va.sludinajumuportals.dao.AdvertisementRepository;
import lv.va.sludinajumuportals.dao.UserRepository;
import lv.va.sludinajumuportals.domain.Advertisement;
import lv.va.sludinajumuportals.service.UserService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
//tika mainits

@Controller
public class AdvertisementController {

    @Autowired
    private AdvertisementService advertisementService;
    @Autowired
    private AdvertisementRepository advertisementRepository;

    @GetMapping(value = "/")
    @ResponseBody
    public String testEndpoint() {
        return "Hello!";
    }

    @GetMapping(value = "/hey")
    @ResponseBody
    public Response nextTestEndpoint() {
        return new Response("Hey Ya");
    }

    @RequestMapping("/main")
    public String getUI(Map<String, Object> model) {
        model.put("message", "Hello User!");
        model.put("advertisement", advertisementService.getAdvertisement());
        return "main";
    }

    @GetMapping("/advertisements")
    public String getAdvertisements(Map<String, Object> model) {
        model.put("advertisementList", advertisementService.getAdvertisementListReverse());
        return "advertisementui";
    }

    @GetMapping("/author")
    public String getAdvertisementsAuthors(Map<String, Object> model) {
        model.put("advertisementList", advertisementService.getAdvertisementListByAuthor("Peteris"));
        return "advertisementui";
    }

    @GetMapping("/createadvertisementform")
    public String advertisementCreationForm(Model model) {
        model.addAttribute("advertisement", new Advertisement());
        return "createform";
    }

    @GetMapping("/createadvertisementformdb")
    public String advertisementCreationFormdb(Model model) {
        model.addAttribute("advertisement", new Advertisement());
        return "createformdb";
    }
     @PostMapping("/advertisementdb")
    public String advertisementSubmitdb(Map<String, Object> model, @ModelAttribute Advertisement advertisement) {
        advertisementRepository.save(advertisement);
        
        model.put("advertisement", advertisement);
        return "result";
    }

    @PostMapping("/advertisement")
    public String advertisementSubmit(Map<String, Object> model, @ModelAttribute Advertisement advertisement) {
        int nextAdvertisementId = advertisementService.hardcodedAdvertisementList.size();
        advertisement.setId(Long.valueOf(nextAdvertisementId + 1));
        advertisementService.hardcodedAdvertisementList.add(0, advertisement);
        model.put("advertisement", advertisement);
        return "result";
    }

}
