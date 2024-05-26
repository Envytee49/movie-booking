package com.example.mbs.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "formats")
@NoArgsConstructor
@Getter
@Setter
public class Format {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "format_id")
    private Integer formatId;

    @Column(name = "format_type", length = 20)
    private String formatType;

    @OneToMany(
            mappedBy = "format",
            cascade =  CascadeType.ALL,
            orphanRemoval = true
    )
    private List<MovieFormat> movieFormats;

    @OneToMany(mappedBy = "format")
    private List<Screen> screens;
}