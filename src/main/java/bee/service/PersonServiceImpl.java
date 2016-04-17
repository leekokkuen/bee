package bee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bee.dao.PersonMapper;
import bee.model.Person;


@Service("personService")
public class PersonServiceImpl implements PersonServiceI {
	
	private PersonMapper personMapper;

	
	public PersonMapper getPersonMapper() {
		return personMapper;
	}
	
	@Autowired
	public void setPersonMapper(PersonMapper personMapper) {
		this.personMapper = personMapper;
	}

	public void insert(Person person){
		personMapper.insert(person);
	}

}
