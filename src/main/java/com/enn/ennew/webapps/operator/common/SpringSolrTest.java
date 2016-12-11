package com.enn.ennew.webapps.operator.common;

import com.enn.ennew.webapps.operator.weblogic.solr.SpringSolr;
import com.enn.ennew.webapps.operator.weblogic.solr.User;
import org.apache.solr.client.solrj.SolrServerException;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by enn on 2016/12/8.
 */
public class SpringSolrTest {/*
    private SpringSolr springSolr;
    @Before
    public void setUp() throws Exception {
        // 初始化Spring容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "spring/applicationContext.xml", "spring/applicationContext-solr.xml");

        //获取对象
        this.springSolr = applicationContext.getBean(SpringSolr.class);
    }

    @Test
    public void test() throws SolrServerException {

        // 测试方法，输出结果
        User user = null;
        try {
            user = springSolr.getUser((long) 1);
        } catch (SolrServerException e) {
            e.printStackTrace();
        }
        System.out.println(user);
    }*/
}
