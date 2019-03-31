package cn.mycom.aigou.mapper;

import cn.mycom.aigou.domain.ProductType;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 商品目录 Mapper 接口
 * </p>
 *
 * @author fk
 * @since 2019-03-31
 */
public interface ProductTypeMapper extends BaseMapper<ProductType> {

    List<ProductType> treeData();
}
