package br.com.colombano.mapstructpoc.config;

import br.com.colombano.mapstructpoc.model.entity.Address;
import br.com.colombano.mapstructpoc.model.entity.User;
import br.com.colombano.mapstructpoc.repository.AddressRepository;
import br.com.colombano.mapstructpoc.repository.UserRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.datafaker.Faker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Slf4j
@Configuration
@RequiredArgsConstructor
public class Mock {

    @Value("${faker.users-to-save}")
    private int amountOfUsersToSave;

    private final UserRepository userRepository;
    private final AddressRepository addressRepository;

    @PostConstruct
    public void init() {
        Faker faker = new Faker();
        List<User> users = getUsers(faker);

        userRepository.saveAll(users);

        users.forEach(user -> {
            Set<Address> addresses = getAddresses(faker, user);
            addressRepository.saveAll(addresses);
        });

        log.info("Total users saved: {}", users.size());
    }

    private List<User> getUsers(Faker faker) {
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

        return users;
    }

    private Set<Address> getAddresses(Faker faker, User user) {
        Set<Address> addresses = new HashSet<>();
        for (int i = 0; i < 2; i++) {
            Address address = new Address();

            address.setCity(faker.address().city());
            address.setCountry(faker.address().country());
            address.setState(faker.address().state());
            address.setZip(faker.address().zipCode());
            address.setStreet(faker.address().streetAddress());
            address.setUser(user);

            addresses.add(address);
        }
        return addresses;
    }

}
