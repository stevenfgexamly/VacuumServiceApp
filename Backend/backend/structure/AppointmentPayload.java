package com.vacuum.backend.structure;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AppointmentPayload {

    private int uid;
    private int sid;
    private String date;
    private String model;
    private String details;
    private String tier;
    
}
