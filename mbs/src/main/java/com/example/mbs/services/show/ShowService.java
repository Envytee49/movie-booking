package com.example.mbs.services.show;

import com.example.mbs.dto.show.ShowDetailDTO;
import com.example.mbs.exceptions.ShowNotFoundException;
import com.example.mbs.models.show.Show;
import com.example.mbs.repositories.show.ShowRepository;
import org.springframework.stereotype.Service;

@Service
public class ShowService {
    private final ShowRepository showRepository;

    public ShowService(ShowRepository showRepository) {
        this.showRepository = showRepository;
    }

    public Show getShowDetail(int id) {
        return showRepository.findById(id).orElseThrow(ShowNotFoundException::new);
    }
}
