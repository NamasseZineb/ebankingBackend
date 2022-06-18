package org.sid.ebankingbackend.dtos;
import lombok.Data;
import org.sid.ebankingbackend.enums.AccountStatus;
import java.util.Date;


@Data
public class SaveBankAccountDTO extends BankAccountDTO {
    private String id;
    private double balance;
    private Date createdAt;
    private AccountStatus status;
    private CustomerDTO customerDTO;
    private double interestRate;
}
