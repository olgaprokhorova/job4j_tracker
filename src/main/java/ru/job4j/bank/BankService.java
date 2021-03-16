package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс описывает модель работы банковской системы, которая позволяет
 * регистрировать пользователя, добавлять пользователю банковский счет,
 * переводить деньги с одного банковского счета на другой
 * @author Olga Prokhorova
 * @version 1.0
 */
public class BankService {
    /**
     * Хранение всех пользователей системы с привязанными к ним счетами
     * осуществляется в коллекции типа Map
     */
    private Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод принимает на вход пользователя и проверяет, есть ли такой
     * пользователь в системе. Если есть, то пользователь не добавляется.
     * Если такой пользователь отсутствует, то он добавляется в систему.
     * @param user пользователь, который добавляется в систему
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    /**
     * Метод добавляет новый счет к пользователю.
     * Сначала осуществляеся поиск пользователя по номеру паспорта.
     * Если пользователь найден, то получаем список всех его счетов.
     * Если счет, который нужно добавить, отсутствует у пользователя, добавляем его.
     * @param passport паспорт, по которому осуществляеся поиск пользователя
     * @param account счет, который нужно добавить пользователю
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> userAccount = users.get(user);
            if (!userAccount.contains(account)) {
                userAccount.add(account);
            }
        }
    }

    /**
     * Метод ищет пользователя по номеру паспорта
     * @param passport паспорт, по которому осуществляеся поиск пользователя
     * @return возвращает пользователя, если он найден, и null если пользователь не найден
     */
    public User findByPassport(String passport) {
        User user = null;
        for (User key : users.keySet()) {
            if (key.getPassport().equals(passport)) {
                user = key;
                break;
            }
        }
        return user;
    }

    /**
     * Метод ищет счет пользователя по реквизитам
     * Сначала осуществляеся поиск пользователя по номеру паспорта.
     * Если пользователь найден, то получаем список всех его счетов
     * и в этом списке ищем нужный счет.
     * @param passport паспорт, по которому осуществляеся поиск пользователя
     * @param requisite реквизиты, по которым осуществляется поиск счета
     * @return возвращает счет, если он найден, и null если счет не найден
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        Account account = null;
        if (user != null) {
            List<Account> userAccount = users.get(user);
            for (Account a : userAccount) {
                if (a.getRequisite().equals(requisite)) {
                    account = a;
                    break;
                }
            }
        }
        return account;
    }

    /**
     * Метод осуществляет перевод денег с одного счёта на другой счёт
     * @param srcPassport паспорт, по которому осуществляется поиск счета отправителя
     * @param srcRequisite реквизиты счета отправителя
     * @param destPassport паспорт, по которому осуществляется поиск счета получателя
     * @param destRequisite реквизиты счета получателя
     * @param amount сумма, которую нужно перевести со счета на счет
     * @return возвращает true - если деньги переведены, и false - если счёта отправителя
     * и получателя не найдены или на счете отправителя не хватает денег
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount != null && destAccount != null && srcAccount.getBalance() >= amount) {
            destAccount.setBalance(destAccount.getBalance() + amount);
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            rsl = true;
        }
        return rsl;
    }
}
