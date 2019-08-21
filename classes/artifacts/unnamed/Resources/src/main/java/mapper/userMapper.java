package mapper;
import model.user;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;


public class userMapper implements RowMapper {
    @Override

    public user mapRow(ResultSet resultSet, int i )throws SQLException{
        user newUser = new user();
        newUser.setUsername(resultSet.getString("username"));
        newUser.setNumber(resultSet.getInt("number"));
        return newUser;
    }

}
