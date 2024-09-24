package learnspringboot.com.shreya.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public abstract class userSer {
    @Autowired
    user2repo userrepo;
    public user2 saveUser(user2 User)
    {
        return userrepo.save(User);
    }
    public List<user2> getAllUser()
    {
        return (List<user2>) userrepo.findAll();
    }
    public Optional<user2> getUserById(int id)
    {
        return userrepo.findById(id);
    }
    public void deleteByid(int id)
    {
        userrepo.deleteById(id);
    }

    public abstract user2 create(user2 User);
}
