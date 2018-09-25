package org.clm.service;

import org.clm.bean.ProductInfo;

import java.util.List;

/**
 * @author Ccc
 * @date 2018/9/25 0025 下午 6:51
 */
public interface ProductInfoService {
    ProductInfo findOne(ProductInfo productInfo);

    List<ProductInfo> findAll(ProductInfo productInfo);

    int saveInfo(ProductInfo productInfo);

    int updateInfo(ProductInfo productInfo);
}

