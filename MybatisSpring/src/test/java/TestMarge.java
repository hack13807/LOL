import com.wells.mapper.AccountMapper;
import com.wells.service.AccountService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.InputStream;

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
