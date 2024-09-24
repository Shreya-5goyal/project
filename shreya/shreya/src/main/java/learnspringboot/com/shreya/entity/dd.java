package learnspringboot.com.shreya.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/interview")
public class dd {
   @Autowired
    serviceInterview serviceInterview;
   @PostMapping
   public user addProduct(@RequestBody user User)
   {
      return serviceInterview.saveUser(User);

   }
   @GetMapping
   public List<user> getAll()
   {
      return serviceInterview.getAllUser();
   }





}
