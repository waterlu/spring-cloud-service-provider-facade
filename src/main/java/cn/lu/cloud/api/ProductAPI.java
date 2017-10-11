package cn.lu.cloud.api;

import cn.lu.cloud.common.ResponseResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lutiehua on 2017/9/29.
 */
@RequestMapping("/api/products")
public interface ProductAPI {

    @GetMapping("/{productUuid}")
    ResponseResult getProduct(@PathVariable(value = "productUuid") String productUuid);

    @GetMapping("/")
    ResponseResult getProductList();
}