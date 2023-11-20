import java.util.List;


@Service 

public class ReastaurantService {
    @Autowired 
    private RestaurantDao  restaurantDao;
    public  List<Restaurant> getRestaurant(){
        List<Restaurant> restaurants = new ArrayList<>();
        restaurantDao.findall().forEach(restaurants::add);
        return restaurants;
    }

}
