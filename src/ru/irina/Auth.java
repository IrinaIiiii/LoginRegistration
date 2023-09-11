package ru.irina;

public class Auth {
    private User[] users = new User[100];
    private int id;

    public boolean login(String login, String password) {
        User user = findByLogin(login);
        if (user != null) {
            if (user.getPassword().equals(password)) {
                System.out.println("Ваше имя: " + user.getFullName());
                System.out.println("Ваш номер телефона: " + user.getNumberTel());
               return true;
            } else return false;
        } else return false;
    }

    public boolean registration(String login, String password, String fullName, String numberTel) {
        if (findByLogin(login) != null) return false;
        User user = new User();
        user.setLogin(login);
        user.setPassword(password);
        user.setId(id);
        user.setFullName(fullName);
        user.setNumberTel(numberTel);
        users[id] = user;
        id++;
        return true;
    }

    public User findByLogin(String login) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) return null;
            if (users[i].getLogin().equals(login)) return users[i];
        }
        return null;
    }
}
