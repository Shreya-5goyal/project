package learnspringboot.com.shreya.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/interview")
public class dd2 {
    @Autowired
    userSer serviceInterview;
    @PostMapping
    public user2 addProduct(@RequestBody user2 User)
    {
        return serviceInterview.saveUser(User);

    }
    @GetMapping
    public List<user2> getAll()
    {
        return serviceInterview.getAllUser();
    }





}

