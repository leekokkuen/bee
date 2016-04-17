package bee.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import bee.model.Person;
import bee.service.PersonServiceI;



@Controller
@RequestMapping("/personController")
public class PersonController {

	private PersonServiceI personService;

	public PersonServiceI getPersonService() {
		return personService;
	}

	@Autowired
	public void setPersonService(PersonServiceI personService) {
		this.personService = personService;
	}

	@RequestMapping("/insertPerson")
	public String insertPerson(String id, String name,HttpServletRequest request) {
		Person u = new Person(id,name);
		personService.insert(u);
		request.setAttribute("person", u);
		return "showPerson";
	}

}
