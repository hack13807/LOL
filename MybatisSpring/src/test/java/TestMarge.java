import com.wells.ssm.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/applicationContext-*.xml")
public class TestMarge {

    @Resource
    private AccountService accountService;

    @Test
    public void tt() {

        try {
            accountService.transMoney("Mr.ma","panghu",10);
        }catch (Exception e){
            System.out.println(e);
        }
        double panghu = accountService.queryMoney("panghu");
        double Mrma = accountService.queryMoney("Mr.ma");
        System.out.println(panghu);
        System.out.println(Mrma);
    }
}
