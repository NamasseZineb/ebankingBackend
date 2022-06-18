package org.sid.ebankingbackend.dtos;

import lombok.Data;

@Data
public class DebitDTORequest {
    String accountId;
    double ammont;
    String descri;
}
