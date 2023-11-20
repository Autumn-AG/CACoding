package data_access;

import entity.User;
import use_case.clear_users.ClearUserDataAccessInterface;

import java.io.*;
import java.util.ArrayList;

public class ClearDataAccessObject implements ClearUserDataAccessInterface {
    private final File csvFile;
    private final ArrayList<String> clearedUsers;

    public ClearDataAccessObject(String csvPath){
        csvFile = new File(csvPath);
        clearedUsers = new ArrayList<>();
    }

    @Override
    public void clearAllData() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(csvFile));
            String line = reader.readLine();

            while ((line = reader.readLine()) != null) {
                String[] deletedUserdata = line.split(",");
                this.clearedUsers.add(deletedUserdata[0]);
            }
            // Clear all data from the file
            FileWriter writer = new FileWriter(csvFile);
            writer.close();

        } catch (IOException e) { throw new RuntimeException(e); }
    }

    @Override
    public ArrayList<String> getClearedUsers() {
        return this.clearedUsers;
    }
}