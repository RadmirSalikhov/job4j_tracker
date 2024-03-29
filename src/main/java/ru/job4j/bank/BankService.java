package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * главный сервис
 */
public class BankService {
    /**
     * Это поле содержит всех пользователей системы с привязанными к ним счетами, в коллекции типа Map
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод должен добавить пользователя в систему
     *
     * @param user который будет создан, при условии отсутсвия такого клиента
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Метод, который позволит удалить пользователя из системы
     *
     * @param passport паспорт клиента
     * @return возвращает true если клиент был удален и false если нет
     */
    public boolean deleteUser(String passport) {
        return users.remove(new User(passport, "")) != null;
    }

    /**
     * Метод должен добавить новый счет к пользователю
     *
     * @param passport паспорт клиента
     * @param account  счет, который будет добавлен пользователю
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }
    }

    /**
     * Метот ищет пользователя по номеру паспорта
     *
     * @param passport паспорт клиента
     * @return возвращает найденного пользователя или null если пользователь не был найден
     */
    public User findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(user -> user.getPassport().equals(passport))
                .findFirst()
                .orElse(null);
    }

    /**
     * Метод ищет счет пользователя по реквизитам
     *
     * @param passport  паспорт клиента
     * @param requisite реквизиты счета
     * @return возвращает найденного пользователя или null если пользователь не был найден
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            return users.get(user)
                    .stream()
                    .filter(u -> u.getRequisite().equals(requisite))
                    .findFirst()
                    .orElse(null);
        }
        return null;
    }

    /**
     * Метод предназначен для перечисления денег с одного счёта на другой счёт
     *
     * @param srcPassport   паспорт клиента
     * @param srcRequisite  реквизиты счёта пользователя с которого осуществляется перевод
     * @param destPassport  паспорт клиента которому осуществляется перевод
     * @param destRequisite реквизиты счёта пользователя на который осуществляется перевод
     * @param amount        сумма перевода
     * @return в случае успешного перевода возвращает true, в противном случае false
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount != null && destAccount != null && srcAccount.getBalance() >= amount) {
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            destAccount.setBalance(destAccount.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }

    /**
     * Метод возвращает список аккаунтов пользователя
     *
     * @param user пользователь для которого осуществляется возврат списка имеющихся аккаунтов
     * @return возвращает список аккаунтов пользователя
     */
    public List<Account> getAccounts(User user) {
        return users.get(user);
    }
}