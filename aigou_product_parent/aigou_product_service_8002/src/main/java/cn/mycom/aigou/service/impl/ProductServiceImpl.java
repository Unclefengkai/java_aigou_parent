package cn.mycom.aigou.service.impl;

import cn.mycom.aigou.domain.Product;
import cn.mycom.aigou.mapper.ProductMapper;
import cn.mycom.aigou.service.IProductService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品 服务实现类
 * </p>
 *
 * @author fk
 * @since 2019-03-31
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements IProductService {

}
