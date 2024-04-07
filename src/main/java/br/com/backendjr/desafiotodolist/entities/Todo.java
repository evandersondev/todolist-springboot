package br.com.backendjr.desafiotodolist.entities;


import jakarta.persistence.*;
import lombok.*;

@Entity(name = "todos")
@Table(name = "todos")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private boolean done;
    private int priority;
}
