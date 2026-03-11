public class UserValidator {

    public boolean isValid(User user) {
        return user != null
                && user.name() != null && !user.name().isBlank()
                && user.email() != null && user.email().contains("@")
                && user.role() != null;
    }
}
