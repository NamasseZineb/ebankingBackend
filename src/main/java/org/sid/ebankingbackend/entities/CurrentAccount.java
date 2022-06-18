package org.sid.ebankingbackend.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@DiscriminatorValue("CA")//Dans la colonne type, la valeur sera CA pour dire current
public class CurrentAccount extends BankAccount{
    private double overDraft;
}
