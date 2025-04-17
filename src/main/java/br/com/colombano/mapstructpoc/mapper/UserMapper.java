package br.com.colombano.mapstructpoc.mapper;

import br.com.colombano.mapstructpoc.model.dto.AddressDto;
import br.com.colombano.mapstructpoc.model.dto.UserDto;
import br.com.colombano.mapstructpoc.model.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserMapper {

    private final AddressMapper addressMapper;

    public UserDto fromEntity(User entity) {
        UserDto userDto = new UserDto();

        userDto.setId(entity.getId());
        userDto.setFirstName(entity.getFirstName());
        userDto.setLastName(entity.getLastName());
        userDto.setEmail(entity.getEmail());
        userDto.setPassword(entity.getPassword());
        userDto.setBirthDate(entity.getBirthDate());

        entity.getAddresses()
              .forEach(address -> {
                  AddressDto addressDto = addressMapper.fromEntity(address);
                  userDto.getAddresses().add(addressDto);
              });

        return userDto;
    }

}
