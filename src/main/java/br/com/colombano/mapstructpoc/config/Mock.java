package br.com.colombano.mapstructpoc.config;

import br.com.colombano.mapstructpoc.model.entity.User;
import br.com.colombano.mapstructpoc.repository.UserRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.datafaker.Faker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Configuration
@RequiredArgsConstructor
public class Mock {

    @Value("${faker.users-to-save}")
    private int amountOfUsersToSave;

    private final UserRepository userRepository;

    @PostConstruct
    public void init() {
        Faker faker = new Faker();
        List<User> users = new ArrayList<>();

        for (int i = 0; i < amountOfUsersToSave; i++) {
            User user = new User();

            user.setFirstName(faker.name().firstName());
            user.setLastName(faker.name().lastName());
            user.setEmail(faker.internet().emailAddress());
            user.setPassword(faker.internet().password());
            user.setBirthDate(faker.timeAndDate().birthday());

            users.add(user);
        }

        userRepository.saveAll(users);
        log.info("Total users saved: {}", users.size());
    }

}
