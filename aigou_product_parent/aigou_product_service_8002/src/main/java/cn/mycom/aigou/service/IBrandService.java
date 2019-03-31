package cn.mycom.aigou.service;

import cn.mycom.aigou.domain.Brand;
import cn.mycom.aigou.query.BrandQuery;
import cn.mycom.aigou.util.PageList;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 * 品牌信息 服务类
 * </p>
 *
 * @author wbtest
 * @since 2019-03-30
 */
public interface IBrandService extends IService<Brand> {
//自定义分布
    PageList<Brand> queryPage(BrandQuery query);
}
