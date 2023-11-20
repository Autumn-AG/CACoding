package use_case.clear_users;

import java.util.ArrayList;

public class ClearOutputData {
    private final ArrayList<String> deletedUsers;

    public ClearOutputData (ArrayList<String> deletedUsers) {
        this.deletedUsers = deletedUsers;
    }

    public ArrayList<String> get() {
        return this.deletedUsers;
    }
}
