
package alige_quanlydiem;

import java.util.ArrayList;
import java.util.List;

public class UserDAO {

    List<User> ls = new ArrayList<>();

    public UserDAO() {
        ls.add(new User("Giangvien", "123", true));
        ls.add(new User("Sinhvien", "123", false));
    }

    public boolean checkLogin(String username, String password) {
        for (User u : ls) {
            if (u.getUsername().equals(username) && u.getPassword().equals(password)) {
                String usernamee = u.getUsername();
                String pass = u.getPassword();
                boolean role = u.isRole();
                User user = new User(usernamee, pass, role);
                Auth.U = user;
                return true;
            }
        }
        return false;
    }

}
