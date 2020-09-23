package technicalblog.service;

import org.springframework.stereotype.Service;
import technicalblog.model.User;

@Service
public class UserService {

    public boolean isValidUser(User user){
        if(user.getUserName().compareTo("validUser")==0){
            if(user.getPassword().length()>4){
                return true;
            }
        }
        return false;
    }


}
