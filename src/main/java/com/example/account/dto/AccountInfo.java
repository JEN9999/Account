package com.example.account.dto;


import lombok.*;

//client와 컨트롤러 사이의 응답
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AccountInfo {
    private String accountNumber;
    private Long balance;

}
