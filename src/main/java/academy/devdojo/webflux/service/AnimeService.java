package academy.devdojo.webflux.service;

import academy.devdojo.webflux.domain.Anime;
import academy.devdojo.webflux.repository.AnimeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import reactor.core.publisher.Flux;

@Slf4j
@RequiredArgsConstructor
@Service
public class AnimeService {

    private final AnimeRepository animeRepository;

    @Transactional(readOnly = true)
    public Flux<Anime> listAll() {
        return animeRepository.findAll();
    }
}
