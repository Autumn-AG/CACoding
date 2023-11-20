package use_case.clear_users;

import java.util.ArrayList;

public interface ClearUserDataAccessInterface {

    void clearAllData();

    ArrayList<String> getClearedUsers();
}
