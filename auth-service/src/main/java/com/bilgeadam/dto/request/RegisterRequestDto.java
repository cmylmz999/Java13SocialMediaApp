package com.bilgeadam.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RegisterRequestDto {

    @Size(min = 3, max =20, message = "Kullanici adi en az 3, en fazla 20 karakter olabilir.")
    private String username;
    @Email
    private String email;
    @Size(min = 8, max = 32, message ="Kullanici sifresi en az 8, en fazla 32 karakterden olusabilir." )
    private String password;
}
