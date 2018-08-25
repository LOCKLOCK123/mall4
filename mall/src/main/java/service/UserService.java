package service;


import com.mmall.pojo.User;
import org.springframework.stereotype.Service;
public interface UserService {


    User getUserById(Integer id);

}
