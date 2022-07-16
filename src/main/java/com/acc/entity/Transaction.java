package com.acc.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "trans")
@Getter
@Setter
@NoArgsConstructor
public class Transaction {
    @Id
    private int id;
    private int from_Account;
    private int to_Account;
    private String description;
    private  String trans_date;
    private int amount;




}
