package dao;
import org.springframework.data.repository.CrudRepository;
import model.user;
import java.util.List;
public interface userDao extends CrudRepository<user,Integer> {
    List<user> findAll();
}


