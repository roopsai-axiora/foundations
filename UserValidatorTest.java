void main() {
    UserValidator validator = new UserValidator();

    User valid = new User("Roop", "roop@example.com", Role.DEVELOPER);
    User invalidEmail = new User("Roop", "roopexample.com", Role.DEVELOPER);
    User invalidName = new User(" ", "roop@example.com", Role.DEVELOPER);

    assert validator.isValid(valid);
    assert !validator.isValid(invalidEmail);
    assert !validator.isValid(invalidName);
    assert !validator.isValid(null);

    System.out.println("UserValidator tests passed");
}
