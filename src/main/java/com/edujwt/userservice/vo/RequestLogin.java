package com.edujwt.userservice.vo;

import lombok.Data;

@Data
public class RequestLogin {

    private String email;
    private String password;
}
