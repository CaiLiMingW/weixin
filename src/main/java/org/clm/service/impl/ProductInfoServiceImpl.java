package org.clm.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.clm.Dao.ProductInfoMapper;
import org.clm.bean.ProductInfo;
import org.clm.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Ccc
 * @date 2018/9/25 0025 下午 7:02
 */
@Service
public class ProductInfoServiceImpl implements ProductInfoService {

    @Autowired
    private ProductInfoMapper mapper;

    @Override
    public ProductInfo findOne(ProductInfo productInfo) {
        return null;
    }

    /**
     * 查找商户
     * @param productInfo
     * @return
     */
    @Override
    public List<ProductInfo> findAll(ProductInfo productInfo) {
        PageHelper.startPage(1,3);

        List<ProductInfo> productInfos = mapper.selectByKey(productInfo);
        PageInfo pageInfo = new PageInfo(productInfos);
        return productInfos;
    }

    /**
     * 添加商户
     * @param productInfo
     * @return
     */
    @Override
    public int saveInfo(ProductInfo productInfo) {
        return mapper.insertSelective(productInfo);
    }

    @Override
    public int updateInfo(ProductInfo productInfo) {

        return mapper.updateByPrimaryKeySelective(productInfo);
    }
}
