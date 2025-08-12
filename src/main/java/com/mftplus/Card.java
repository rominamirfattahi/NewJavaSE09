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


public class Card extends Account{
    private String cardNumber;

    @Override
    public void recipt() {
        System.out.println(this.getCustomer().getName()+" "+"recipted");
    }

    @Override
    public void pay() {
        System.out.println(this.getCustomer().getName()+" "+"paid");
    }
}
