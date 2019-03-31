package cn.mycom.aigou.controller;

import cn.mycom.aigou.ProductApplication8002;
import cn.mycom.aigou.service.IBrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ProductApplication8002.class)
public class BrandControllerTest {

    @Autowired
    private IBrandService brandService;

    @Test
    public void save() {
    }

    @Test
    public void delete() {
    }

    @Test
    public void get() {

        System.out.println(brandService.selectById(3L));
    }

    @Test
    public void list() {
    }

    @Test
    public void json() {
    }
}