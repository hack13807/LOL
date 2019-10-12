import org.junit.Test;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TTest {

    @Test
    public void tt(){
        Set set = new HashSet<>();
        set.add(1);
        set.remove(0);
    }


    public static void main(String[] args) throws Exception{
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        /* &#x6307;&#x5411;&#x9006;&#x5411;&#x5de5;&#x7a0b;&#x914d;&#x7f6e;&#x6587;&#x4ef6;&#xff0c;&#x53ea;&#x9700;&#x8981;&#x628a;&#x4e0b;&#x9762;&#x8fd9;&#x4e2a;&#x6587;&#x4ef6;&#x6539;&#x4e3a;&#x4f60;&#x81ea;&#x5df1;&#x5199;&#x7684;&#x914d;&#x7f6e;&#x6587;&#x4ef6;&#x5373;&#x53ef; */
        File configFile = new File("D:\\kingdee_workspace\\YogaLOL\\SSM\\src\\main\\resources\\config.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
    }
}
