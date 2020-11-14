package entities;

public class UserView {
    private Long id;
    private String username;
    private String userProfileImage;

    public UserView(Long id, String username, String userProfileImage) {
        this.id = id;
        this.username = username;
        this.userProfileImage = userProfileImage;
    }

    public String getUsername() {
        return username;
    }

    public String getUserProfileImage() {
        return userProfileImage;
    }
}
