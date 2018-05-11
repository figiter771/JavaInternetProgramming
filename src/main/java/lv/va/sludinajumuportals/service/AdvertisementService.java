package lv.va.sludinajumuportals.service;

import lv.va.sludinajumuportals.domain.Advertisement;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class AdvertisementService {
//tika mainits
    String name = "Olgerts";
    public List<Advertisement> hardcodedAdvertisementList;
    public List<Advertisement> reverseAdvertisementList;
    
    public AdvertisementService () {
        hardcodedAdvertisementList = hardcodedAdvertisementInitialization();
        reverseAdvertisementList = hardcodedAdvertisementList;
        Collections.reverse(reverseAdvertisementList);
    }
    public Advertisement getAdvertisement() {
        Advertisement advertisement = new Advertisement(1L, "Pardod māju", "Pārdod lielu māju", "Jānis");
        return advertisement;
    }
    public List<Advertisement> getAdvertisementListByAuthor(String author){
        List<Advertisement>filteredByName = new ArrayList<>();
        for (Advertisement advertisement:hardcodedAdvertisementList){
            if (advertisement.getAuthor().equals(author)) {
                filteredByName.add(advertisement);
        }
    }
        return filteredByName;
    }
    public List<Advertisement> getAdvertisementListReverse() {
        return reverseAdvertisementList;
    }

    public ArrayList<Advertisement> getAdvertisementList() {
        ArrayList<Advertisement> advertisements = new ArrayList<>();
        Advertisement advertisement = new Advertisement(1L, "Pardod māju", "Pārdod lielu māju", "Jānis");

        advertisements.add(advertisement);

        return advertisements;
    }

    private List<Advertisement> hardcodedAdvertisementInitialization() {
        List<Advertisement> advertisements = new ArrayList<>();
        for (int i = 1; i < name.length(); i++) {
            advertisements.add(new Advertisement(Long.valueOf(i), "Pardodu Lietu", "Selling my thing online nr " + i, getAuthorName(i)));
        }
        return advertisements;
    }

    private String getAuthorName(int i) {
        if (i % 2 == 0) {
            return "Janis";
        }
        return "Peteris";
    }
    
}
