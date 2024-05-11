package com.example.mbs.models.screen.specialscreen;

import com.example.mbs.models.screen.Screen;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Table(name = "special_screens")
@NoArgsConstructor
@Data
public class SpecialScreen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sscreen_id")
    private Integer sscreenId;

    @Column(name = "sscreen_name", length = 50)
    private String sscreenName;

    @OneToMany(mappedBy = "specialScreen")
    @JsonBackReference
    private Set<Screen> screens;
}