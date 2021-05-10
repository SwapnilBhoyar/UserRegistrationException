@FunctionalInterface
interface Check {
    boolean check(String value) throws ValidateUserException;
}
