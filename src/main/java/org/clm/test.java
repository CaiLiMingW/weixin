package org.clm;

import org.clm.Dao.CategoryMapper;
import org.clm.bean.Category;
import org.clm.bean.ProductInfo;
import org.clm.service.CategoryService;
import org.clm.service.ProductInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author Ccc
 * @date 2018/9/25 0025 下午 4:41
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class test {
    @Autowired
    private CategoryMapper categoryMapper;
    @Autowired
    private CategoryService service;

    @Autowired
    private  ProductInfoService productInfoService;

    @Test
    public void testMapper(){
        Category category = categoryMapper.selectByPrimaryKey(1);
        System.out.println(category);
        System.out.println("11");
    }

    @Test
    public void testInsert(){
        Category category = new Category();
        category.setCategoryName("nnnnn");
        category.setCategoryType(10);
        categoryMapper.insertSelective(category);
    /*    categoryMapper.deleteByPrimaryKey(4);*/
        category.setCategoryId(1);
        categoryMapper.updateByPrimaryKey(category);
    }
    @Test
    public void Testimpl(){
        /*ProductInfo x = new ProductInfo();
        x.setProductId("311");
        x.setCategoryType(5);
        x.setProductDescription("皮蛋");
        x.setProductName("粥");
        x.setProductPrice(new BigDecimal(12.1));
        x.setProductStock(100);
        x.setProductIcon("xxxxxxxx");
        x.setProductStatus((byte)1);
        int i1 = productInfoService.saveInfo(x);
        x.setProductId("4");
        x.setProductName("吃的");
        int i = productInfoService.updateInfo(x);
        System.out.println("111");*/
        ProductInfo cc = new ProductInfo();
        List<ProductInfo> all = productInfoService.findAll(cc);
        System.out.println(all);
    }

}
