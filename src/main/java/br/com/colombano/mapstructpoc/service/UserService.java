package br.com.colombano.mapstructpoc.service;

import br.com.colombano.mapstructpoc.mapper.UserMapper;
import br.com.colombano.mapstructpoc.model.dto.UserDto;
import br.com.colombano.mapstructpoc.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserMapper userMapper;
    private final UserRepository userRepository;

    @Transactional(readOnly = true)
    public List<UserDto> findAll() {
        return userRepository.findAll()
                             .stream()
                             .map(userMapper::fromEntity)
                             .toList();
    }

}
