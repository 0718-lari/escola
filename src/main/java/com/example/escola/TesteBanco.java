package com.example.escola;

import com.example.escola.model.Aluno;
import com.example.escola.repository.AlunoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TesteBanco {

    @Bean
    CommandLineRunner executar(AlunoRepository repository) {
        return args -> {

            Aluno aluno = new Aluno();

            aluno.setNome("Carlos");
            aluno.setIdade(17);

            repository.save(aluno);

            System.out.println("Aluno salvo!");
        };
    }
}