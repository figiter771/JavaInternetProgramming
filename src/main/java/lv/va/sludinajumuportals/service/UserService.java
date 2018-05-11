package lv.va.sludinajumuportals.service;

import java.util.ArrayList;
import java.util.List;
import lv.va.sludinajumuportals.domain.Advertisement;
import lv.va.sludinajumuportals.domain.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public List<User> hardcodedUserList;
    public UserService() {
        hardcodedUserList = hardcodedUserInitialization();
    }


     private List<User> hardcodedUserInitialization() {
        List<User> users = new ArrayList<>();
        
            users.add(new User (1, "Janis", "Ozolins" , "Normal"));
            users.add(new User (2, "Peteris", "Ozolins" , "Normal"));
            users.add(new User (3, "Jazeps", "Puka" , "Normal"));
            users.add(new User (4, "Peteris", "Bundza" , "Normal"));
            users.add(new User (5, "Martins", "Majkovskis" , "Privalaged"));
        
        return users;
    }
     public List<User> getUserListByNameOrSurname (String name, String surname) {
         List<User> filteredByNameOrSurname = new ArrayList<>();
         for(User user:hardcodedUserList) {
             if (user.getName().equals(name)) {
                 filteredByNameOrSurname.add(user);
             }
             if (user.getName().equals(surname)) {
                 filteredByNameOrSurname.add(user);
             }
         }
         
         
         return filteredByNameOrSurname;
     }
     public List<User> getUserListBySurname ( String surname) {
         List<User> filteredByNameOrSurname = new ArrayList<>();
         for(User user:hardcodedUserList) {
             if (user.getName().equals(surname)) {
                 filteredByNameOrSurname.add(user);
             }
         }
         
         
         return filteredByNameOrSurname;
     }
     public List<User> getUserListByName(String name) {
         List<User> filteredByNameOrSurname = new ArrayList<>();
         for(User user:hardcodedUserList) {
             if (user.getName().equals(name)) {
                 filteredByNameOrSurname.add(user);
             }
         }
         
         
         return filteredByNameOrSurname;
     }

    
}
