package th.ac.kmutt.sit.MyFirstService;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import th.ac.kmutt.sit.MyFirstService.controller.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {
    User user;
    
    @Before
    public void setUser(){
        user = new User(1,"Test");
    }
    
    @Test
    public void checkId() {
           int id = 1;
           Assert.assertEquals(id,this.user.getId());
	}
    @Test
    public void checkName(){
        String name = "Test";
         Assert.assertEquals(name,this.user.getName());
    }
}
