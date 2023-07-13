package com.sudip.admindata.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class AdminDto {
private int id;
private String userName;
private String password;
private String dept;
}
