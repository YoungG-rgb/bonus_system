package kg.tech.bonus_api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/bonuses")
public class BonusController {

    @GetMapping("/{id}")
    public String getById(@PathVariable("id") Long id) {
        log.info("getById id {}", id);
        return "request: getById " + id;
    }
}
