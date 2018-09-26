package org.clm.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.clm.bean.ProductInfo;

import java.util.List;

/**
 * @author Ccc
 * @date 2018/9/25 0025 下午 10:20
 */
public class ProductVo {
    @JsonProperty("name")
    private String categoryName;

    @JsonProperty("type")
    private Integer categoryType;

    @JsonProperty("foods")
    private List<ProductInfoVO> food;

    public static ProductVo setProductInfoVO(List<ProductInfoVO> o){
        ProductVo vo = new ProductVo();
        vo.setFood(o);
        return vo;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Integer getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(Integer categoryType) {
        this.categoryType = categoryType;
    }

    public List<ProductInfoVO> getFood() {
        return food;
    }

    public void setFood(List<ProductInfoVO> food) {
        this.food = food;
    }
}
