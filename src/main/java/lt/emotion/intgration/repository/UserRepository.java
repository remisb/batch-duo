package lt.emotion.intgration.repository;

import lt.emotion.intgration.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
