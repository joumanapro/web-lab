import com.example.firstproject.entity.Restaurant;
import org.springframework.stereotype.Repository;
@Repository 

public interface RestaurantDao extends CrudRepository <Restaurant, Integer>{
    
}
