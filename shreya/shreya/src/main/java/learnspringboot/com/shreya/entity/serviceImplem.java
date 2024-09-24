package learnspringboot.com.shreya.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class serviceImplem extends serviceInterview {
    @Autowired
    userRepository repo;
    @Override
    public user create (user User)
    {
        return repo.save(User);
    }
}
