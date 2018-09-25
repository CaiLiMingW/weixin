package org.clm.Dao;

import org.clm.bean.ProductInfo;

import java.util.List;

public interface ProductInfoMapper {
    int deleteByPrimaryKey(String productId);

    int insertSelective(ProductInfo record);

    List<ProductInfo> selectByKey(ProductInfo productInfo);

    List<ProductInfo> selectByPrimaryKey(ProductInfo productInfo);

    int updateByPrimaryKeySelective(ProductInfo record);

}