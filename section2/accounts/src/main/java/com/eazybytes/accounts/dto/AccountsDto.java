package com.eazybytes.accounts.dto;
import lombok.Data;

@Data //@Getter @Setter @ToString hashCode equals
public class AccountsDto {
    private Long accountNumber;

    private String accountType;

    private String branchAddress;
}
