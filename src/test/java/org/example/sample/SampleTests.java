package org.example.sample;

import lombok.Setter;
import lombok.extern.log4j.Log4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class) // 스프링 테스트 환경을 구성해주는 어노테이션
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml") // applicationContext를 선언
@Log4j // Lombok를 이용해 로그를 기록하는 Logger
public class SampleTests {

    @Setter(onMethod_ = {@Autowired})
    private Restaurant restaurant;

    @Test
    public void testExist(){
        assertNotNull(restaurant);

        log.info(restaurant);
        log.info("-----------");
        log.info(restaurant.getChef());
    }
}