package lt.emotion.intgration.batch;

import lt.emotion.intgration.model.User;
import lt.emotion.intgration.repository.UserRepository;
import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DBWriter implements ItemWriter<User> {

    private final UserRepository userRepository;

    public DBWriter(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void write(List<? extends User> users) throws Exception {
        System.out.println("Data Saved for Users: " + users);
        userRepository.save(users);
    }
}
