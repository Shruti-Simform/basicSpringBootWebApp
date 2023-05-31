package webapp;
public class UserValidationService {
    public boolean isUserValid(String user,String password){
        if(user.equals("shruti@123") && password.equals("1234"))
            return true;
        else {
            return false;
        }
    }
}
