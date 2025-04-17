package br.com.colombano.mapstructpoc.mapper;

import br.com.colombano.mapstructpoc.model.dto.AddressDto;
import br.com.colombano.mapstructpoc.model.entity.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressMapper {

    AddressDto fromEntity(Address address);

}
