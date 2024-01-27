package com.wecp.progressive.service;


import com.wecp.progressive.dao.AccountDAO;
import com.wecp.progressive.entity.Accounts;

import net.bytebuddy.build.HashCodeAndEqualsPlugin.Sorted;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AccountServiceImpl implements AccountService {

    private static List<Accounts> accList = new ArrayList<>();
    private AccountDAO accDAO;

    public AccountServiceImpl(AccountDAO accDAO) {
        this.accDAO = accDAO;
    }
    @Override
    public List<Accounts> getAllAccounts() throws SQLException {
        return null;
    }

    @Override
    public Accounts getAccountById(int accountId) throws SQLException {
        return null;
    }

    @Override
    public int addAccount(Accounts accounts) throws SQLException {
        return -1;
    }

    @Override
    public void updateAccount(Accounts accounts) throws SQLException {

    }

    @Override
    public void deleteAccount(int accountId) throws SQLException {

    }

    @Override
    public List<Accounts> getAllAccountsSortedByBalance() throws SQLException {
        return null;
    }


    @Override
    public List<Accounts> getAccountsByUser(int userId) throws SQLException{
        return null;
    }
    @Override
    public List<Accounts> getAllAccountsSortedByBalanceFromArrayList() {
        List<Accounts> account2=accList;
       // Collections.sort(account2);
       account2.sort(Comparator.comparingDouble(Accounts::getBalance));
        return account2;
    }

    @Override
    public void emptyArrayList() {
        accList=new ArrayList<>();
    }

    @Override
    public List<Accounts> getAllAccountsFromArrayList() {
        return accList;
    }
    
    @Override
    public List<Accounts> addAccountToArrayList(Accounts accounts) {
        accList.add(accounts);
        return  accList;
    }
}