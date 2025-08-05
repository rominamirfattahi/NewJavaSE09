package com.mftplus;

public interface Transaction {
    default boolean pay() {
        return false;
    }

    default boolean recipt() {
        return false;
    }
}
