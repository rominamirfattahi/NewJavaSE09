package com.mftplus;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.setBankName("melli");

        Branch branch1 = new Branch();
        branch1.setAddress("tehranpars");

        Branch branch2 = new Branch();
        branch1.setAddress("velenjak");


        bank.addBranch(branch1);
        bank.addBranch(branch2);



        Customer customer1 = new Customer();
        customer1.setName("romina");
        Card card1 = new Card();
        card1.setCardNumber("12345");
        card1.setCustomer(customer1);
        card1.setBranch(branch1);
        card1.setCardNumber("12");


        Customer customer2 = new Customer();
        customer2.setName("sara");
        Check check1 = new Check();
        check1.setCheckNumber("12345");
        check1.setCustomer(customer2);
        check1.setBranch(branch1);
        check1.setCheckNumber("23");


        Customer customer3 = new Customer();
        customer3.setName("helia");
        Saving saving1 = new Saving();
        saving1.setProfit(10);
        saving1.setCustomer(customer3);
        saving1.setBranch(branch2);
        saving1.setAccountNumber("66");


        Customer customer4 = new Customer();
        customer4.setName("raha");
        Saving saving2 = new Saving();
        saving2.setProfit(20);
        saving2.setCustomer(customer4);
        saving2.setBranch(branch2);
        saving2.setAccountNumber("55");



        for (Branch branch:bank.getBrancheList()){
            System.out.println("branch"+branch.getAddress());
            for (Account account:branch.getAccountList()){
                System.out.println(account.getAccountNumber()+":"+account.getCustomer().getName());
            }
        }
    }
}
