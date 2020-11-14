package entities;

public class UserView {
    private String id;
    private String username;
    private String userProfileImage;

    public UserView(String id, String username, String userProfileImage) {
        this.id = id;
        this.username = username;
        this.userProfileImage = userProfileImage;
    }
}
