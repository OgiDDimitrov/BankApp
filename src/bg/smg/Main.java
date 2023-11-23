package bg.smg;

import bg.smg.frame.LoginFrame;
import bg.smg.frame.MainFrame;
import bg.smg.model.Account;
import bg.smg.model.Currency;
import bg.smg.model.User;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {



        List<Account> bankAccountsList = new ArrayList<>();
        Account bankAccount1 = new Account("BG23BG2342342348", 5000.50, Currency.BGN);
        bankAccountsList.add(bankAccount1);

        Account bankAccount2 = new Account("BG23BG2348797906", 3000.33, Currency.EUR);
        bankAccountsList.add(bankAccount2);

        User user = new User("u1", "p1", bankAccountsList);

        List<User> availableUsers = new ArrayList<>();
        availableUsers.add(user);
        new MainFrame(user);

    }
}
