package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User rsl = null;
        for (User user : users) {
            if (user.getUsername().equals(login)) {
                rsl = user;
                break;
            }
        }
        if (rsl == null) {
            throw new UserNotFoundException("Пользователь не найден");
        }
        return rsl;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (user.isValid() || user.getUsername().length() >= 3) {
            return true;
        }
        throw new UserInvalidException("Пользователь не валидный");
    }

    public static void main(String[] args) {
        try {
            User[] users = {
                    new User("Petr Arsentev", true)
            };
            User user = findUser(users, "Petr Arsentev");
            validate(user);
        } catch (UserInvalidException en) {
            en.printStackTrace();
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }
    }
}