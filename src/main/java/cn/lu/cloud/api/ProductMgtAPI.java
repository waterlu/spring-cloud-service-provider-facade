package cn.lu.cloud.api;

import cn.lu.cloud.common.ResponseResult;
import cn.lu.cloud.dto.ProductDTO;
import org.springframework.web.bind.annotation.*;

/**
 * Created by lutiehua on 2017/9/29.
 */
@RequestMapping("/mgt/products")
public interface ProductMgtAPI {

    @PostMapping("/")
    ResponseResult createProduct(@RequestBody ProductDTO product);

    @PutMapping("/{productUuid}")
    ResponseResult updateProduct(@PathVariable("productUuid") String productUuid, @RequestBody ProductDTO product);

    @DeleteMapping("/{productUuid}")
    ResponseResult deleteProduct(@PathVariable("productUuid") String productUuid);

}