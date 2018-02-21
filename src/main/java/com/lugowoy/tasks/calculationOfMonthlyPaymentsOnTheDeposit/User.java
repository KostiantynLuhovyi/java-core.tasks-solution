package com.lugowoy.tasks.calculationOfMonthlyPaymentsOnTheDeposit;

import javax.jws.soap.SOAPBinding;
import java.io.Serializable;

/** Created by Konstantin Lugowoy on 10-Feb-17. */

public class User implements Serializable, Cloneable {

    private Bank bank;
    private PersonalAccount personalAccount;

    private int id;
    private String firstName;
    private String secondName;

    public User() {
    }

    public User(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        if (getId() != user.getId()) return false;
        if (getBank() != null ? !getBank().equals(user.getBank()) : user.getBank() != null) return false;
        if (getPersonalAccount() != null ? !getPersonalAccount().equals(user.getPersonalAccount()) : user.getPersonalAccount() != null)
            return false;
        if (getFirstName() != null ? !getFirstName().equals(user.getFirstName()) : user.getFirstName() != null)
            return false;
        return getSecondName() != null ? getSecondName().equals(user.getSecondName()) : user.getSecondName() == null;
    }

    @Override
    public int hashCode() {
        int result = getBank() != null ? getBank().hashCode() : 0;
        result = 31 * result + (getPersonalAccount() != null ? getPersonalAccount().hashCode() : 0);
        result = 31 * result + getId();
        result = 31 * result + (getFirstName() != null ? getFirstName().hashCode() : 0);
        result = 31 * result + (getSecondName() != null ? getSecondName().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "User[" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", personalAccount=" + personalAccount +
                ']';
    }

    @Override
    public User clone() throws CloneNotSupportedException {
        User user = (User) super.clone();
        user.setId(this.getId());
        user.setFirstName(this.getFirstName());
        user.setSecondName(this.getSecondName());
        user.setBank(this.getBank());
        user.setPersonalAccount(this.getPersonalAccount());
        return user;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public PersonalAccount getPersonalAccount() {
        return personalAccount;
    }

    public void setPersonalAccount(PersonalAccount personalAccount) {
        this.personalAccount = personalAccount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

}
