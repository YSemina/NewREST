package db;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import javax.sql.DataSource;

public class ConnectionManagerDB {
    private static final HikariDataSource dataSource;

    static {
        ConfigLoader configLoader = new ConfigLoader();
        String URL = configLoader.getProperty("db.url");
        String USERNAME = configLoader.getProperty("db.username");
        String PASSWORD = configLoader.getProperty("db.password");
        String CLASSNAME = configLoader.getProperty("dataSourceClassName");


        HikariConfig config = new HikariConfig();

        config.setJdbcUrl(URL);
        config.setUsername(USERNAME);
        config.setPassword(PASSWORD);
        config.setDriverClassName(CLASSNAME);

        dataSource = new HikariDataSource(config);
    }

    public static DataSource getDataSource() {
        return dataSource;
    }

    public void close() {
        dataSource.close();
    }
}
