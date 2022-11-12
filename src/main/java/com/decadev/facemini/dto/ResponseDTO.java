package com.decadev.facemini.dto;

import com.decadev.facemini.entity.User;
import lombok.Data;

@Data
public class ResponseDTO {
    private String message;
    private User data;
    private boolean status;


}
