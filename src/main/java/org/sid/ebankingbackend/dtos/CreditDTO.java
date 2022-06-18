package org.sid.ebankingbackend.dtos;

import lombok.Data;

@Data
public class CreditDTO {
    String accountId;
    double amount;
    String description;
}
