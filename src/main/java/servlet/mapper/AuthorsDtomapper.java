package servlet.mapper;

import model.Authors;
import servlet.dto.AuthorsDto;

public interface AuthorsDtomapper {
    Authors map(AuthorsDto incomingDto);

    AuthorsDto map(Authors authors);
}
