package repository.impl;

import model.Authors;
import repository.mapper.AuthorsSetMapper;
import servlet.dto.AuthorsDto;

public class AuthorsSetMapperImpl implements AuthorsSetMapper {

    @Override
    public AuthorsDto toDto(Authors author) {
        if ( author == null ) {
            return null;
        }

        AuthorsDto authorsDto = new AuthorsDto();

        authorsDto.setId( author.getId() );
        authorsDto.setName( author.getName() );

        return authorsDto;
    }

    @Override
    public Authors toEntity(AuthorsDto authorDto) {
        if ( authorDto == null ) {
            return null;
        }

        Authors authors = new Authors();

        authors.setId( authorDto.getId() );
        authors.setName( authorDto.getName() );

        return authors;
    }
}