package com.skills_swapper.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
//    private String firstName;
//    private String lastName;
    private Integer age;
    private String userName;
    private String email;
    private String password;
    private String description;
    private String country;


    private List<Skill> skills ;
    private List<Need> needs;


}
