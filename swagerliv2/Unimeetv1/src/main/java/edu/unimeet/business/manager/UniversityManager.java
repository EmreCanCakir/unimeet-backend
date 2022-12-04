package edu.unimeet.business.manager;

import edu.unimeet.business.service.UniversityService;
import edu.unimeet.dto.PostViewDTO;
import edu.unimeet.dto.UniViewDto;
import edu.unimeet.entities.University;
import edu.unimeet.repository.UniversityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UniversityManager implements UniversityService {

    private final UniversityRepository universityRepository;

    @Override
    public List<UniViewDto> getAll() {
        return universityRepository.findAll().stream().map(UniViewDto::of).collect(Collectors.toList());
    }

}
