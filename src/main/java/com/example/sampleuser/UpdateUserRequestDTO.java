package com.example.sampleuser;

import lombok.Data;

@Data
public class UpdateUserRequestDTO {
    private int id;
    private String email;

    public UpdateUserRequestDTO(int id, String email) {
        this.id = id;
        this.email = email;
    }
}
