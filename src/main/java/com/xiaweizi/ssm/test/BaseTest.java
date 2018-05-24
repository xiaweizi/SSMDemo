package com.xiaweizi.ssm.test;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 配置spring和junit整合，junit启动时加载springIOC容器 spring-test,junit
 */
@RunWith(SpringJUnit4ClassRunner.class)
// 告诉 junit spring 配置文件，报错却能正常运行
@ContextConfiguration({"file:src/main/webapp/WEB-INF/applicationContext.xml"})
public class BaseTest {
}
