package org.sid.ebankingbackend.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Data
@NoArgsConstructor @AllArgsConstructor
@Entity
@DiscriminatorValue("SA")
public class SaveAccount extends BankAccount{
    private double interestRate;
}
