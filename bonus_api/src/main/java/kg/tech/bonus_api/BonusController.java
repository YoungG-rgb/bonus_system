package kg.tech.bonus_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bonuses")
public class BonusController {

    @GetMapping("/{id}")
    public String getById(@PathVariable("id") Long id) {
        return "request: getById " + id;
    }
}
