package casino.api.v1;

public enum UserRole {
    PLAYER("Player"), ADMIN("Admin"), GUEST("Guest");

    UserRole(String role) {
        this.role = role;
    }
    private String role;

    public String getRole() {
        return role;
    }
}