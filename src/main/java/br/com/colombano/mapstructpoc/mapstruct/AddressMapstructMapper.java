package br.com.colombano.mapstructpoc.mapstruct;

import br.com.colombano.mapstructpoc.model.dto.AddressDto;
import br.com.colombano.mapstructpoc.model.entity.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressMapstructMapper {

    AddressDto fromEntity(Address address);

}
