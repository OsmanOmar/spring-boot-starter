package com.osman.springbootstarter.dao;

import com.osman.springbootstarter.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PersonDao {

    int insertPeson(UUID id, Person person);
    default int insertPeson(Person person) {
        UUID id = UUID.randomUUID();
        return  insertPeson(id, person);
    }

    List<Person> selectAllPeople();

    Optional<Person> selectPersonById(UUID id);

    int deletePersonById(UUID id);

    int updatePersonById(UUID id, Person person);
}
