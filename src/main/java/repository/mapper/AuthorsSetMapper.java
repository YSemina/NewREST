package repository.mapper;

import model.Authors;
import servlet.dto.AuthorsDto;


public interface AuthorsSetMapper {
    AuthorsDto toDto(Authors author);
    Authors toEntity(AuthorsDto authorDto);
}
