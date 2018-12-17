import com.itheima.domain.Account;
import com.itheima.service.IAccountService;
import com.itheima.service.impl.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class serviceTest {
    @Test
    public void aTest() {
        ApplicationContext ac = new ClassPathXmlApplicationContext(
                "classpath:spring/applicationContext-service.xml");
        IAccountService acBean = ac.getBean(IAccountService.class);
        List<Account> all = acBean.findAll();
        for (Account account : all) {
            System.out.println(account);
        }
    }
}
