package service.impl;

import repository.impl.AuthorsRepositoryImpl;
import repository.impl.AuthorsSetMapperImpl;
import repository.mapper.AuthorsSetMapper;
import service.AuthorsService;
import servlet.dto.AuthorsDto;
import java.util.List;
import java.util.stream.Collectors;

public class AuthorsServiceImpl implements AuthorsService {
    private final AuthorsRepositoryImpl authorRepository;
    private final AuthorsSetMapper authorMapper;

    public AuthorsServiceImpl(){
        this.authorRepository = new AuthorsRepositoryImpl();
        this.authorMapper = new AuthorsSetMapperImpl() {
        };
    }

    public List<AuthorsDto> findAll() {
        return authorRepository.findAll()
                .stream().map(authorMapper::toDto)
                .collect(Collectors.toList());
    }
}
