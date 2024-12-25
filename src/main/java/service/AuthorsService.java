package service;

import model.Authors;
import servlet.dto.AuthorsDto;

import java.util.List;
/**
 * Пока здесь один метод, чтобы с ним разобраться
 * */
public interface AuthorsService {

    public List<AuthorsDto> findAll();

}
