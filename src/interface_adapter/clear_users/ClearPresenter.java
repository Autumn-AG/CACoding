package interface_adapter.clear_users;

import use_case.clear_users.ClearOutputBoundary;

import javax.swing.*;

public class ClearPresenter implements ClearOutputBoundary {

    @Override
    public void prepareView(String Output) {
        JFrame frame = new JFrame("Clear All User Data");
        JOptionPane.showMessageDialog(frame, String.format("The following users were removed:\n%s", Output));
    }
    /* @Override
    public void prepareErrorView(String Output) {
        JFrame frame = new JFrame("Cookbook Already Exists!");
        JOptionPane.showMessageDialog(frame, ("Please use a different name for the new cookbook.")));
    } */
}