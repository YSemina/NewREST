package repository;

import db.ConnectionManagerDB;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public abstract class AbstractRepository {
    protected final DataSource dataSource;
    protected AbstractRepository() {
        this.dataSource = ConnectionManagerDB.getDataSource();
    }
}
