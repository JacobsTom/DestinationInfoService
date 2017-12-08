package application;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


//@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan(basePackages = { "controller"})
public class InfoApplication {

	public static void main(String[] args) {
        SpringApplication.run(InfoApplication.class, args);
    }
}
//
//@RestController
//class ServiceInstanceRestController {
//
//    @Autowired
//    private DiscoveryClient discoveryClient;
//
//    @RequestMapping("/service-instances/{applicationName}")
//    public List<ServiceInstance> serviceInstancesByApplicationName(
//            @PathVariable String applicationName) {
//        return this.discoveryClient.getInstances(applicationName);
//    }
//}
