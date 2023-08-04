package services;

import entities.Account;

import java.util.ArrayList;
import java.util.List;

public class AccountService {

    private static AccountService instance;
    private static List<Account> data = new ArrayList<>();

    static {
        data.add(new Account(1, "lquick", "password", "123 Main St", "8145551234"));
        data.add(new Account(2, "jraynor", "password", "456 Second St", "8145552345"));
        data.add(new Account(3, "krhinebolt", "password", "789 Third St", "8145553456"));
        data.add(new Account(4, "jswartz", "password", "1000 Fourth St", "8145554567"));
    }

    public static AccountService getInstance(){
        if (instance == null){
            instance = new AccountService();
        }
        return instance;
    }

    public Account getAccount(int id) { return data.get(id);}

    public List<Account> getAllAccounts() {return data;}
}
