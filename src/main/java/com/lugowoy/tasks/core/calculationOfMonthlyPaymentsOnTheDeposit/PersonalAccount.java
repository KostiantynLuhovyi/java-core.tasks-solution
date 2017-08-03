package com.lugowoy.tasks.core.calculationOfMonthlyPaymentsOnTheDeposit;

import java.io.Serializable;
import java.util.List;

/** Created by Konstantin Lugowoy on 11-Feb-17. */

public class PersonalAccount implements Serializable {

    private int id;

    private User user;
    private Bank bank;

    private List<BankingService> bankingServices;

    public PersonalAccount() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PersonalAccount that = (PersonalAccount) o;

        if (id != that.id) return false;
        if (user != null ? !user.equals(that.user) : that.user != null) return false;
        if (bank != null ? !bank.equals(that.bank) : that.bank != null) return false;
        return bankingServices != null ? bankingServices.equals(that.bankingServices) : that.bankingServices == null;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (user != null ? user.hashCode() : 0);
        result = 31 * result + (bank != null ? bank.hashCode() : 0);
        result = 31 * result + (bankingServices != null ? bankingServices.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PersonalAccount{" +
                "id=" + id +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public List<BankingService> getBankingServices() {
        return bankingServices;
    }

    public void setBankingServices(List<BankingService> bankingServices) {
        this.bankingServices = bankingServices;
    }

}
