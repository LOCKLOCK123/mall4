package controller.userController;

import com.mmall.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.UserService;

@RestController
public class SampleController {

    @Autowired
    UserService userService;

    @RequestMapping("/user")
    User home() {
        return userService.getUserById(1);
    }
}
