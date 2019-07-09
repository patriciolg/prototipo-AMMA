package net.atos.mira.prototip.restplo;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import net.atos.mira.prototip.modelo.entities.User;

@RestController
class UserController {
  // Aggregate root

  @GetMapping("/employees")
  public String getAllUsers() {
	  User us1 = new User();
	  us1.setNombre("patricio");
	  us1.setId(87L);
	  return us1.toString();
  }
}
