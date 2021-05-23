package net.honux.springbootdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Repository
public class MyUserRepository {
    private Logger logger = LoggerFactory.getLogger(MyUserRepository.class);

    @Value("${spring.datasource.url}")
    private String url;
    @Value("${spring.datasource.username}")
    private String username;
    @Value("${spring.datasource.password}")
    private String password;
    public Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            logger.error("MySQL Driver error: {}", e.getMessage());
            e.printStackTrace();
            return null;
        }
        logger.debug("create connection success");
        return conn;
    }
}
