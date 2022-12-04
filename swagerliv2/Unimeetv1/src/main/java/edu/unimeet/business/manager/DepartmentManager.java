package edu.unimeet.business.manager;

import edu.unimeet.business.service.DepartmentService;
import edu.unimeet.dto.DepartmentViewDto;
import edu.unimeet.dto.PostViewDTO;
import edu.unimeet.entities.Department;
import edu.unimeet.repository.DepartmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class DepartmentManager implements DepartmentService {

    private final DepartmentRepository departmentRepository;

    @Override
    public List<DepartmentViewDto> getAll() {
        return departmentRepository.findAll().stream().map(DepartmentViewDto::of).collect(Collectors.toList());
    }

}
