package com.bookstore;

import com.bookstore.service.BookstoreService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MainApplication {

    private final BookstoreService bookstoreService;

    public MainApplication(BookstoreService bookstoreService) {
        this.bookstoreService = bookstoreService;
    }

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

    @Bean
    public ApplicationRunner init() {
        return args -> {
            bookstoreService.newBook();
            bookstoreService.displayBook();
        };
    }
}

/*
 * 
 * 
 * How To Store java.time.YearMonth As Integer Or Date Via Hibernate Types Library

Description: Hibernate Types is a set of extra types not supported by default in Hibernate Core. One of these types is java.time.YearMonth. This is a Spring Boot application that uses Hibernate Type to store this YearMonth in a MySQL database as integer or date.

Key points:

for Maven, add Hibernate Types as a dependency in pom.xml
in entity use @TypeDef to map typeClass to defaultForType
Output example:
 * 
 * 
 * 
 */
