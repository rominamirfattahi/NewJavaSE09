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

public class Check extends Account{
    private String checkNumber;

    public Check(String checkNumber) {
        this.checkNumber = checkNumber;
    }
}
