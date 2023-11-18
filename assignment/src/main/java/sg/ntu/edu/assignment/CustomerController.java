package sg.ntu.edu.assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    
    @Autowired 
    Customer customer;

    @GetMapping("/product/{id}")
    public String getProduct(@PathVariable int id) {
        switch (id) {
            case 1:
                return "Product Name is Apple";
            case 2:
                return "Product Name is Banana";
            case 3:
                return "Product bane is carrot";
            default:
                return "invalid entry";

        }
    }


}
