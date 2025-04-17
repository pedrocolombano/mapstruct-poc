package br.com.colombano.mapstructpoc.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddressDto implements Serializable {

    @Serial
    private static final long serialVersionUID = 4626447090714880229L;

    private Long id;
    private String street;
    private String city;
    private String state;
    private String zip;
    private String country;

}