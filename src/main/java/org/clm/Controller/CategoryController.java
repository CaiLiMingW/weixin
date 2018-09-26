package org.clm.Controller;

import org.clm.VO.ProductInfoVO;
import org.clm.VO.ProductVo;
import org.clm.VO.ResultVO;
import org.clm.bean.Category;
import org.clm.bean.ProductInfo;
import org.clm.service.CategoryService;
import org.clm.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Ccc
 * @date 2018/9/25 0025 下午 9:41
 */
@RestController
@RequestMapping("/buyer/product")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;
    @Autowired
    private ProductInfoService productInfoService;

    @GetMapping("/list")
    public ResultVO list(){
        List<ProductInfo> all = productInfoService.findAll(null);
        ProductVo.setProductInfoVO(Arrays.asList(new  ProductInfoVO()));
        return  ResultVO.success().add(Arrays.asList(ProductVo.setProductInfoVO(Arrays.asList(new  ProductInfoVO()))));
    }
}
