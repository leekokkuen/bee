package bee.dao;

import org.springframework.stereotype.Repository;

import bee.model.Person;

@Repository
public interface PersonMapper {
    int insert(Person record);

    int insertSelective(Person record);
}