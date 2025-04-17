package br.com.colombano.mapstructpoc.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto implements Serializable {

    @Serial
    private static final long serialVersionUID = 5531894821491979182L;

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private LocalDate birthDate;
    private Set<AddressDto> addresses = new HashSet<>();

}