package co.grandcircus.apilab;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.apilab.model.HallOfFameResult;

@Controller
public class ApiController {

	@RequestMapping("/")
    public ModelAndView showTinyHallOfFame() {

        ModelAndView mav = new ModelAndView("index");

        RestTemplate restTemplate = new RestTemplate();

        String url = "https://dwolverton.github.io/fe-demo/data/computer-science-hall-of-fame.json";

        HallOfFameResult result = restTemplate.getForObject(url, HallOfFameResult.class);

        mav.addObject("hof", result.getTinyOrderByDate());

        return mav;

    }
	
	@RequestMapping("/complete-hof")
    public ModelAndView showCompleteHallOfFame() {

        ModelAndView mav = new ModelAndView("complete-hof");

        RestTemplate restTemplate = new RestTemplate();

        String url = "https://dwolverton.github.io/fe-demo/data/computer-science-hall-of-fame.json";

        HallOfFameResult result = restTemplate.getForObject(url, HallOfFameResult.class);
        
        mav.addObject("hof", result.getCompleteOrderByDate());

        return mav;

    }
	
}
