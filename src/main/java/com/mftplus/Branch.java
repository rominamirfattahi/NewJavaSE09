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

public class Branch {
   private String address;
   private Bank bank;
   private ArrayList<Account> accountList;

}
