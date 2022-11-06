package com.vacuum.backend.structure;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateUser {
    
    private int uid;
    private String email;
    private String name;
    private String oldpass;
    private String newpass;

    
}
