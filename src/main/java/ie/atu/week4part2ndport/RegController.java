package ie.atu.week4part2ndport;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegController
{
    @PostMapping("/confirm")
    public String ConfirmDetails(@RequestBody UserDetails userDetails)
    {
        String confirm = String.format("I have received your details %s for your email %s.",userDetails.getName() ,userDetails.getEmail());
        return confirm;
    }
}
