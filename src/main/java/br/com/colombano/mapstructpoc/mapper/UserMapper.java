package br.com.colombano.mapstructpoc.mapper;

import br.com.colombano.mapstructpoc.model.dto.UserDto;
import br.com.colombano.mapstructpoc.model.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public UserDto fromEntity(User entity) {
        UserDto userDto = new UserDto();

        userDto.setId(entity.getId());
        userDto.setFirstName(entity.getFirstName());
        userDto.setLastName(entity.getLastName());
        userDto.setEmail(entity.getEmail());
        userDto.setPassword(entity.getPassword());
        userDto.setBirthDate(entity.getBirthDate());

        return userDto;
    }

}
