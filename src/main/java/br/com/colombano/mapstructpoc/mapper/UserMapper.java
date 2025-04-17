package br.com.colombano.mapstructpoc.mapper;

import br.com.colombano.mapstructpoc.model.dto.UserDto;
import br.com.colombano.mapstructpoc.model.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = AddressMapper.class)
public interface UserMapper {

     UserDto fromEntity(User user);

}
