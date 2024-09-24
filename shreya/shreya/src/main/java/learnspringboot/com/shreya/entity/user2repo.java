package learnspringboot.com.shreya.entity;

import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.repository.CrudRepository;

public interface user2repo extends CrudRepository<user2,Integer> {

}
