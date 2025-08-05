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
    public boolean recipt() {
        return super.recipt();
    }

    @Override
    public boolean pay() {
        return super.pay();
    }
}
