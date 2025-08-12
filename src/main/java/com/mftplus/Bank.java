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


public class Bank {
    private String bankName;
    private ArrayList<Branch> brancheList;

    public void addBranch(Branch branch){
        if (brancheList == null){
            brancheList = new ArrayList<>();
        }
        this.brancheList.add(branch);
        branch.setBank(this);
    }
}
