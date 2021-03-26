package eci.ieti.data;

import eci.ieti.data.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, String> {

    User findByName(String name);

    List<User> findByEmail(String email);

}
