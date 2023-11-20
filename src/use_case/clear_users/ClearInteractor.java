package use_case.clear_users;

import data_access.ClearDataAccessObject;
import interface_adapter.clear_users.ClearController;
import interface_adapter.clear_users.ClearPresenter;
import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearUserDataAccessInterface;
import use_case.signup.SignupOutputBoundary;
import use_case.signup.SignupOutputData;
import use_case.signup.SignupUserDataAccessInterface;

import java.io.IOException;
import java.util.ArrayList;

public class ClearInteractor implements ClearInputBoundary{

    final ClearUserDataAccessInterface clearUserDataAccessObject;
    final ClearOutputBoundary clearPresenter;

    public ClearInteractor() {
        this.clearPresenter = new ClearPresenter();
        this.clearUserDataAccessObject = new ClearDataAccessObject("./users.csv");

    }
    @Override
    public void execute() {
        this.clearUserDataAccessObject.clearAllData();
        ClearOutputData clearOutputData = new ClearOutputData(this.clearUserDataAccessObject.getClearedUsers());
        StringBuilder outputString = new StringBuilder();
        for (String username : clearOutputData.get()) {
            outputString.append(username);
            outputString.append("\n");
        }
        clearPresenter.prepareView(outputString.toString());

    }
}
