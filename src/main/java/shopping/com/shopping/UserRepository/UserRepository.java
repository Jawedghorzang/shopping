package shopping.com.shopping.UserRepository;



import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import shopping.com.shopping.Models.User;



 public interface UserRepository extends CrudRepository<User, Integer> {
  
  @Query("SELECT u FROM User u WHERE u.username = :username")
  public User getUserByUsername(@Param("username") String username);
  
	
}