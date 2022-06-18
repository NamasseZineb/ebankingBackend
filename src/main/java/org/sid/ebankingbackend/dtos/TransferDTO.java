package org.sid.ebankingbackend.dtos;

import lombok.Data;

@Data
public class TransferDTO {
    String accountIdSource;
    String accountIdDestination;
    double amount;
}
