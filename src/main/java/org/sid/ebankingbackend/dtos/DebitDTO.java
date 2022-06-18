package org.sid.ebankingbackend.dtos;

import lombok.Data;

@Data
public class DebitDTO {
    String accountId;
    double amount;
    String description;
}
