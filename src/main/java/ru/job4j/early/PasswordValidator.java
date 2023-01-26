package ru.job4j.early;

public class PasswordValidator {

    public static boolean upperCase(String word) {
        boolean rsl = false;
        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                rsl = true;
                break;
            }
        }
        return rsl;
    }

    public static boolean lowerCase(String word) {
        boolean rsl = false;
        for (int i = 0; i < word.length(); i++) {
            if (Character.isLowerCase(word.charAt(i))) {
                rsl = true;
                break;
            }
        }
        return rsl;
    }

    public static boolean digit(String word) {
        boolean rsl = false;
        for (int i = 0; i < word.length(); i++) {
            if (Character.isDigit(word.charAt(i))) {
                rsl = true;
                break;
            }
        }
        return rsl;
    }

    public static boolean symbols(String word) {
        boolean rsl = false;
        for (int i = 0; i < word.length(); i++) {
            int symbols = word.charAt(i);
            if ((symbols >= 32 && symbols <= 47) || (symbols >= 58 && symbols <= 64)
                    || (symbols >= 91 && symbols <= 96) || (symbols >= 123 && symbols <= 126)) {
                rsl = true;
                break;
            }
        }
        return rsl;
    }

    public static boolean isSubstring(String word) {
        String[] substrings = {"qwerty", "12345", "password", "admin", "user" };
        String lower = word.toLowerCase();
        boolean rsl = false;
        for (String substring : substrings) {
            if (lower.contains(substring)) {
                rsl = true;
                break;
            }
        }
        return rsl;
    }

    public static String validate(String password) {
        if (password == null) {
            throw new IllegalArgumentException("Password can't be null");
        }
        if (password.length() <= 8 || password.length() >= 32) {
            throw new IllegalArgumentException("Password should be length [8, 32]");
        }
        for (int i = 0; i < password.length(); i++) {
            if (!upperCase(password)) {
                throw new IllegalArgumentException("Password should contain at least one uppercase letter");
            }
            if (!lowerCase(password)) {
                throw new IllegalArgumentException("Password should contain at least one lowercase letter");
            }
            if (!digit(password)) {
                throw new IllegalArgumentException("Password should contain at least one figure");
            }
            if (!symbols(password)) {
                throw new IllegalArgumentException("Password should contain at least one special symbol");
            }
        }
        if (isSubstring(password)) {
            throw new IllegalArgumentException("Password shouldn't contain substrings: qwerty, 12345, password, admin, user");
        }
        return password;
    }
}
