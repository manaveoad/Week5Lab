package Models;

/**
 *
 * @author manav
 */
public class AccountService {
    
    public User login(String username, String password){
        if((username.equals("abe") || username.equals("barb"))&& password.equals("password")){
            User user = new User(username, password);
            return user;
            
        } else{
            return null;
        }
    }
    
}
