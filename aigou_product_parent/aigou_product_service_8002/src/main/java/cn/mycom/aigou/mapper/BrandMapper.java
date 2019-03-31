package cn.mycom.aigou.mapper;

import cn.mycom.aigou.domain.Brand;
import cn.mycom.aigou.query.BrandQuery;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 品牌信息 Mapper 接口
 * </p>
 *
 * @author wbtest
 * @since 2019-03-30
 */
public interface BrandMapper extends BaseMapper<Brand> {
//分页总条数
    Long queryPageCount(BrandQuery query);
//当前分页数据
    List<Brand> queryPageList(BrandQuery query);
}
