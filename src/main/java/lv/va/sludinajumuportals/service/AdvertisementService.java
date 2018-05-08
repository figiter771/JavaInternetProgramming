package lv.va.sludinajumuportals.service;

import java.util.ArrayList;
import lv.va.sludinajumuportals.domain.Advertisement;
import org.springframework.stereotype.Service;

@Service // Dependency injection japalasa ....

public class AdvertisementService {

    public Advertisement getAdvertismnet() {
        Advertisement advertisement = new Advertisement(1, "MyTitle", "My Message", "MyAuthor"); //ieliec ieksa velak
        return advertisement;
    }

    public ArrayList<Advertisement> getAdvertismentList() {
        ArrayList<Advertisement> advertisements = new ArrayList<>();
        Advertisement advertisement = new Advertisement(1, "MyTitle", "My Message", "MyAuthor");
        advertisements.add(advertisement);
        return advertisements;

    }

    public ArrayList<Advertisement> getFullAdvertismentList(boolean flip) {
        ArrayList<Advertisement> advertisements = new ArrayList<>();
        if (flip == true) {
            advertisements.add(new Advertisement(7, "Nokia", "Ko saka anglis kad vinam nav kias?", "Jokotajs"));
            advertisements.add(new Advertisement(6, "Palidzi", "Es nezinu ka atvert internetu, man vajag palidzibu", "Tavs vectevs"));
            advertisements.add(new Advertisement(5, "Seksy", "Uzpied uz si linka ja gribi labu laiku http://lolz.com", "Jana"));
            advertisements.add(new Advertisement(4, "Picas", "Es edu tikai picas ar ananasiem", "Hipsters"));
            advertisements.add(new Advertisement(3, "Normals", "Es esmu normals un gribu normalas lietas", "Normijs"));
            advertisements.add(new Advertisement(2, "Ediens", "Man loti gribas est!", "Bomzis"));
            advertisements.add(new Advertisement(1, "Zekes", "Pardodu zekes", "Zeku Puika"));
        } else {
            advertisements.add(new Advertisement(1, "Zekes", "Pardodu zekes", "Zeku Puika"));
            advertisements.add(new Advertisement(2, "Ediens", "Man loti gribas est!", "Bomzis"));
            advertisements.add(new Advertisement(3, "Normals", "Es esmu normals un gribu normalas lietas", "Normijs"));
            advertisements.add(new Advertisement(4, "Picas", "Es edu tikai picas ar ananasiem", "Hipsters"));
            advertisements.add(new Advertisement(5, "Seksy", "Uzpied uz si linka ja gribi labu laiku http://lolz.com", "Jana"));
            advertisements.add(new Advertisement(6, "Palidzi", "Es nezinu ka atvert internetu, man vajag palidzibu", "Tavs vectevs"));
            advertisements.add(new Advertisement(7, "Nokia", "Ko saka anglis kad vinam nav kias?", "Jokotajs"));
        }
        return advertisements;

    }
}
