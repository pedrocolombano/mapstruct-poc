package br.com.colombano.mapstructpoc.mapper;

import br.com.colombano.mapstructpoc.model.dto.AddressDto;
import br.com.colombano.mapstructpoc.model.entity.Address;
import org.springframework.stereotype.Component;

@Component
public class AddressMapper {

    public AddressDto fromEntity(Address entity) {
        AddressDto addressDto = new AddressDto();

        addressDto.setId(entity.getId());
        addressDto.setStreet(entity.getStreet());
        addressDto.setCity(entity.getCity());
        addressDto.setState(entity.getState());
        addressDto.setZip(entity.getZip());
        addressDto.setCountry(entity.getCountry());

        return addressDto;
    }

}
