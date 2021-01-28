package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.xpdojo.bank.Account;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
    public void depositAmount() {
        Account account = new Account();
        account.deposit(10);
    }

    @Test
    public void withdrawAmount() {
        Account account = new Account();
        account.withdraw(10);
    }
}
