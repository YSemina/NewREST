package servlet.mapper;

import model.Authors;
import servlet.dto.AuthorsDto;

public class AuthorsDtomapperImpl implements AuthorsDtomapper  {
    @Override
    public Authors map(AuthorsDto incomingDto) {
        if (incomingDto == null) {
            return null;
        }
        Authors authors = new Authors();
        authors.setName(incomingDto.getName());
        return authors;
    }

    @Override
    public AuthorsDto map(Authors authors) {
        if (authors == null) {
            return null;
        }
        AuthorsDto authorsDto = new AuthorsDto();
        authorsDto.setName(authors.getName());
        return authorsDto;
    }
}
