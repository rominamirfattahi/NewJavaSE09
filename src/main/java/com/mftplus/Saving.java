package com.mftplus;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
@ToString


public class Saving extends Account{
    private int profit;

    @Override
    public void pay() {

    }

    @Override
    public void recipt() {

    }
}
