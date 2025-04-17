package br.com.colombano.mapstructpoc.config;

import br.com.colombano.mapstructpoc.model.entity.User;
import br.com.colombano.mapstructpoc.repository.UserRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;

@Configuration
@RequiredArgsConstructor
public class Mock {

    private final UserRepository userRepository;

    @PostConstruct
    public void init() {
        userRepository.saveAll(
                List.of(
                    new User(null, "Pedro", "Colombano", "pedro@email.com", "1234", ZonedDateTime.of(2002, 5, 8, 0, 0,0, 0, ZoneId.systemDefault())),
                    new User(null, "Ana", "Silva", "ana.silva@email.com", "senha123", ZonedDateTime.of(1995, 1, 15, 0, 0, 0, 0, ZoneId.systemDefault())),
                    new User(null, "Carlos", "Oliveira", "carlos.oliveira@email.com", "pass456", ZonedDateTime.of(1988, 6, 22, 0, 0, 0, 0, ZoneId.systemDefault())),
                    new User(null, "Julia", "Martins", "julia.martins@email.com", "julia321", ZonedDateTime.of(1999, 3, 30, 0, 0, 0, 0, ZoneId.systemDefault())),
                    new User(null, "Marcos", "Pereira", "marcos.pereira@email.com", "abc123", ZonedDateTime.of(1990, 11, 10, 0, 0, 0, 0, ZoneId.systemDefault())),
                    new User(null, "Fernanda", "Souza", "fernanda.souza@email.com", "pass789", ZonedDateTime.of(2001, 8, 18, 0, 0, 0, 0, ZoneId.systemDefault())),
                    new User(null, "João", "Almeida", "joao.almeida@email.com", "joao456", ZonedDateTime.of(1985, 7, 7, 0, 0, 0, 0, ZoneId.systemDefault())),
                    new User(null, "Larissa", "Moura", "larissa.moura@email.com", "senha789", ZonedDateTime.of(1997, 12, 25, 0, 0, 0, 0, ZoneId.systemDefault())),
                    new User(null, "Thiago", "Rodrigues", "thiago.rod@email.com", "123senha", ZonedDateTime.of(1993, 4, 5, 0, 0, 0, 0, ZoneId.systemDefault())),
                    new User(null, "Camila", "Lima", "camila.lima@email.com", "pass321", ZonedDateTime.of(2000, 10, 9, 0, 0, 0, 0, ZoneId.systemDefault())),
                    new User(null, "Bruno", "Teixeira", "bruno.teixeira@email.com", "bruno123", ZonedDateTime.of(1994, 2, 17, 0, 0, 0, 0, ZoneId.systemDefault())),
                    new User(null, "Letícia", "Fernandes", "leticia.fernandes@email.com", "leticia456", ZonedDateTime.of(1998, 9, 3, 0, 0, 0, 0, ZoneId.systemDefault())),
                    new User(null, "Ricardo", "Vieira", "ricardo.vieira@email.com", "senhaVieira", ZonedDateTime.of(1987, 1, 1, 0, 0, 0, 0, ZoneId.systemDefault())),
                    new User(null, "Beatriz", "Costa", "beatriz.costa@email.com", "bea123", ZonedDateTime.of(2003, 6, 14, 0, 0, 0, 0, ZoneId.systemDefault())),
                    new User(null, "Felipe", "Dias", "felipe.dias@email.com", "passFelipe", ZonedDateTime.of(1996, 5, 19, 0, 0, 0, 0, ZoneId.systemDefault())),
                    new User(null, "Aline", "Gomes", "aline.gomes@email.com", "gomes456", ZonedDateTime.of(1992, 8, 21, 0, 0, 0, 0, ZoneId.systemDefault())),
                    new User(null, "Eduardo", "Barros", "edu.barros@email.com", "eduBarros", ZonedDateTime.of(1989, 3, 12, 0, 0, 0, 0, ZoneId.systemDefault())),
                    new User(null, "Natália", "Ribeiro", "natalia.ribeiro@email.com", "naty321", ZonedDateTime.of(2004, 11, 6, 0, 0, 0, 0, ZoneId.systemDefault())),
                    new User(null, "Renato", "Freitas", "renato.freitas@email.com", "renato123", ZonedDateTime.of(1991, 7, 23, 0, 0, 0, 0, ZoneId.systemDefault())),
                    new User(null, "Vanessa", "Carvalho", "vanessa.carvalho@email.com", "vcar123", ZonedDateTime.of(1990, 12, 1, 0, 0, 0, 0, ZoneId.systemDefault()))

        ));
    }

}
