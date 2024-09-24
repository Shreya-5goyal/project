package learnspringboot.com.shreya.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class user2impl extends  userSer{
    @Autowired
    user2repo repo;
    @Override
    public user2 create(user2 user1)
    {
        return repo.save(user1);
    }
}
