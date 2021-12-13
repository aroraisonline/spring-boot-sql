package controllerTest;

import com.sgsql.model.City;
import com.sgsql.service.ICityService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyControllerTests {

  @Autowired
  private ICityService cityService;

  @GetMapping("/showCities")
  public String findCities(Model model) {

    var cities = (List<City>) cityService.findAll();

    model.addAttribute("cities", cities);

    return "showCities";
  }

}
