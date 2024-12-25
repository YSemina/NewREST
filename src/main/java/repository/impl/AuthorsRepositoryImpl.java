package repository.impl;

import db.ConnectionManagerDB;
import model.Authors;
import repository.AbstractRepository;
import repository.RequestAuthors;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 * Тут все в комментах, потому что не знаю пригодится код, который я писала или нет.
 * Для начала задача вывести все содержимое из таблицы авторов. Остальные функции потом "добъю"
 * */

public class AuthorsRepositoryImpl extends AbstractRepository {
    public AuthorsRepositoryImpl() {
        super();
    }

    public List<Authors> findAll() {
        String sql = RequestAuthors.FIND_ALL;

        try (Connection conn = ConnectionManagerDB.getDataSource().getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            List<Authors> authors = new ArrayList<>();
            while (rs.next()) {
                Authors author = new Authors();
                author.setId(rs.getInt("id"));
                author.setName(rs.getString("name"));
                authors.add(author);
            }
            return authors;
        } catch (SQLException e) {
            throw new RuntimeException("Error finding all authors", e);
        }
    }

//    public AuthorsEntity findById(Integer id) {
//        try (Connection connection = this.getConnection()) {
//            String SQL = RequestAuthors.FIND_BY_ID + id;
//            try (PreparedStatement preparedStatement = connection.prepareStatement(SQL)) {
//                ResultSet resultSet = preparedStatement.executeQuery();
//                return resultSetMapper.map(resultSet);
//            }
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//
//    public boolean deleteById(Integer id) {
//        try (Connection connection = this.getConnection()) {
//            String SQL = RequestAuthors.DELETE_BY_ID + id;
//            try (PreparedStatement preparedStatement = connection.prepareStatement(SQL)) {
//                int resultDelete = preparedStatement.executeUpdate();
//                System.out.println("Удалено " + resultDelete + " строк\n");
//                return true;
//            }
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//
//    public AuthorsEntity findAll() {
//        try (Connection connection = this.getConnection()) {
//            String SQL = RequestAuthors.FIND_ALL;
//            try (PreparedStatement preparedStatement = connection.prepareStatement(SQL)) {
//                ResultSet resultFind = preparedStatement.executeQuery();
//                return resultSetMapper.map(resultFind);
//            }
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//
//    public AuthorsEntity save(AuthorsEntity authorEntity) {
//        try (Connection connection = this.getConnection()) {
//            String SQL = RequestAuthors.AUTHOR_ADD + authorEntity.getName() + "')";
//            try (PreparedStatement preparedStatement = connection.prepareStatement(SQL)) {
//                int resultFind = preparedStatement.executeUpdate();
//                if (resultFind != 1) {
//                    return null;
//                }
//                return authorEntity;
//            }
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
}
