package com.example.mbs.dto.screen;

import com.example.mbs.dto.seat.SeatDTO;
import com.example.mbs.models.screen.Screen;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;
import java.util.stream.Collectors;
@Data
@NoArgsConstructor
public class ScreenDetailDTO {
    private String screenName;
    private Set<SeatDTO> seats;
    public ScreenDetailDTO(Screen screen) {
        this.screenName = screen.getScreenName();
        System.out.println(screen.getSeats());
        this.seats = screen.getSeats().stream().map(SeatDTO::new).collect(Collectors.toSet());
    }
}
