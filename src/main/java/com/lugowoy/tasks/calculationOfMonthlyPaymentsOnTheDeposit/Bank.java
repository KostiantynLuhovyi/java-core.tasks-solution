package com.lugowoy.tasks.calculationOfMonthlyPaymentsOnTheDeposit;

import java.util.List;
import java.util.Set;

/** Created by Konstantin Lugowoy on 10-Feb-17. */

public class Bank {

    private List<BankingService> bankingServices;

    private Set<User> users;
    private Set<PersonalAccount> accounts;

    public Bank() {
    }

    public List<BankingService> getBankingServices() {
        return bankingServices;
    }

    public void setBankingServices(List<BankingService> bankingServices) {
        this.bankingServices = bankingServices;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public Set<PersonalAccount> getAccounts() {
        return accounts;
    }

    public void setAccounts(Set<PersonalAccount> accounts) {
        this.accounts = accounts;
    }

}
