package org.springframework.PetClinic.model;

import java.time.LocalDate;
import lombok.Data;

@Data
public class Pet
{
    private PetType petType;
    private Owner owner;
    private LocalDate birthDay;
}
