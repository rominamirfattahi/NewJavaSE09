package com.mftplus;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;

@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
@ToString

public class Customer {
    private int id;
    private String name;
    private ArrayList<Account> accountList;

    public void addAccount(Account ... accounts){
        if(accountList == null){
            accountList = new ArrayList<>();
        }else if (accounts.length <3){
            for(Account account:accountList){
                accountList.add(account);
            }
        }
    }
}
