package br.com.colombano.mapstructpoc.mapstruct;

import br.com.colombano.mapstructpoc.model.dto.UserDto;
import br.com.colombano.mapstructpoc.model.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = AddressMapstructMapper.class)
public interface UserMapstructMapper {

     UserDto fromEntity(User user);

}
