package interface_adapter.clear_users;

import use_case.clear_users.ClearInputBoundary;

public class ClearController {
    final ClearInputBoundary userClearInteractor;

    public ClearController(ClearInputBoundary userClearInteractor) {
        this.userClearInteractor = userClearInteractor;
    }
    public void clear() {
        userClearInteractor.execute();
    }
}
