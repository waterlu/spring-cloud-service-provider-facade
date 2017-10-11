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

    @PutMapping("/{productUUid}")
    ResponseResult updateProduct(@PathVariable("productUUid") String productUUid, @RequestBody ProductDTO product);

    @DeleteMapping("/{productUUid}")
    ResponseResult deleteProduct(@PathVariable("productUUid") String productUUid);

}