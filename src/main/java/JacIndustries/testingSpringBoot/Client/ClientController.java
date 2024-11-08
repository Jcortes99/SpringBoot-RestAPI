package JacIndustries.testingSpringBoot.Client;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class ClientController {
    private final Client client;
    public ClientController(){
        this.client = new Client("Default", 2);
    }
    @PostMapping("/new")
    public Client create_new(@RequestBody Client client){
        Client test = new Client(client);
        return test;
    }
    @GetMapping("/get")
    public Client get_client(){
        return this.client;
    }
}
