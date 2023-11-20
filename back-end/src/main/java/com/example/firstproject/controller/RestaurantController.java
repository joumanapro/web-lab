
@RestController 
public class RestaurantController {
    @Autowired
    private ReastaurantService restaurantService;
    
    @GetMapping("/get/restaurant")
    public List<Restaurant> getrestaurant(){
        restaurantService.getRestaurant();

    }
}
