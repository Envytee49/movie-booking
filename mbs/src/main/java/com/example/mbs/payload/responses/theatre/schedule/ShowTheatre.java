package com.example.mbs.payload.responses.theatre.schedule;

import com.example.mbs.payload.dto.FormatDTO;
import com.example.mbs.payload.dto.MovieDTO;
import com.example.mbs.payload.dto.ShowDTO;
import com.example.mbs.payload.dto.SpecialScreenDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ShowTheatre extends ShowDTO {
    MovieDTO movie;

}
