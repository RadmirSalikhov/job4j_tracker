package ru.job4j.early;

import static java.lang.Character.isLetter;

public class PasswordValidator {

    public static boolean isSubstring(String word) {
        String[] substrings = {"qwerty", "12345", "password", "admin", "user"};
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
        boolean digit = false;
        boolean upperCase = false;
        boolean lowerCase = false;
        boolean figure = false;
        if (password == null) {
            throw new IllegalArgumentException("Password can't be null");
        }
        if (password.length() <= 8 || password.length() >= 32) {
            throw new IllegalArgumentException("Password should be length [8, 32]");
        }
        for (char symbols : password.toCharArray()) {
            if (Character.isDigit(symbols)) {
                digit = true;
            }
            if (Character.isUpperCase(symbols)) {
                upperCase = true;
            }
            if (Character.isLowerCase(symbols)) {
                lowerCase = true;
            }
            if (!Character.isDigit(symbols) && !isLetter(symbols)) {
                figure = true;
            }
            if (digit && upperCase && lowerCase && figure) {
                break;
            }
        }
        if (!upperCase) {
            throw new IllegalArgumentException("Password should contain at least one uppercase letter");
        }
        if (!lowerCase) {
            throw new IllegalArgumentException("Password should contain at least one lowercase letter");
        }
        if (!digit) {
            throw new IllegalArgumentException("Password should contain at least one figure");
        }
        if (!figure) {
            throw new IllegalArgumentException("Password should contain at least one special symbol");
        }
        if (isSubstring(password)) {
            throw new IllegalArgumentException("Password shouldn't contain substrings: qwerty, 12345, password, admin, user");
        }
        return password;
    }
}
