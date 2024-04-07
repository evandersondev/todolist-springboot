package br.com.backendjr.desafiotodolist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.backendjr.desafiotodolist.entities.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
