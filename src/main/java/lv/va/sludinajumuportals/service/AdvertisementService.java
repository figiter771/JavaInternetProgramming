
package lv.va.sludinajumuportals.service;

import java.util.ArrayList;
import lv.va.sludinajumuportals.domain.Advertisement;
import org.springframework.stereotype.Service;

@Service // Dependency injection japalasa ....

public class AdvertisementService {
public Advertisement getAdvertismnet() {
    Advertisement advertisement = new Advertisement (1,"MyTitle","My Message","MyAuthor"); //ieliec ieksa velak
 return advertisement;
}   
public ArrayList<Advertisement> getAdvertismentList() {
    ArrayList<Advertisement> advertisements = new ArrayList<>();
    Advertisement advertisement = new Advertisement (1,"MyTitle","My Message","MyAuthor");
    advertisements.add(advertisement);
    return advertisements;
}
}
