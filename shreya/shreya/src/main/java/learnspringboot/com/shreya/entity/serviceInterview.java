package learnspringboot.com.shreya.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public abstract class serviceInterview {
    @Autowired
    userRepository userrepo;
    public user saveUser(user User)
    {
        return userrepo.save(User);
    }
    public List<user> getAllUser()
    {
        return (List<user>) userrepo.findAll();
    }
    public Optional<user> getUserById(int id)
    {
        return userrepo.findById(id);
    }
     public void deleteByid(int id)
    {
          userrepo.deleteById(id);
    }

    public abstract user create(user User);
}
