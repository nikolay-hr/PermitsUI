package au.com.cdsw.permitsUI.Controller;

import au.com.cdsw.permitsUI.Entity.Customer;
import au.com.cdsw.permitsUI.Entity.Permits;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.net.URL;
import java.util.List;

@Controller
@RequestMapping("/permits")
public class PermitSubmission {


    @GetMapping("/apply")
    public String getPermitByArea(Model model){




        return "confirmation";
    }
}
