package net.honux.springbootdemo;

import org.graalvm.compiler.lir.LIRInstruction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.sql.*;

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

    public User findById(Long id) {
        Connection conn = getConnection();
        String sql = "SELECT id, email FROM user where id=?";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setLong(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            User user = new User();
            while (resultSet.next()) {
                user.setId(resultSet.getLong("id"));
                user.setEmail(resultSet.getString("email"));

            }
            return user;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }
}
