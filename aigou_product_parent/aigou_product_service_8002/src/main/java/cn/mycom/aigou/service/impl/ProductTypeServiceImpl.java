package cn.mycom.aigou.service.impl;

import cn.mycom.aigou.domain.ProductType;
import cn.mycom.aigou.mapper.ProductTypeMapper;
import cn.mycom.aigou.service.IProductTypeService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 商品目录 服务实现类
 * </p>
 *
 * @author fk
 * @since 2019-03-31
 */
@Service
public class ProductTypeServiceImpl extends ServiceImpl<ProductTypeMapper, ProductType> implements IProductTypeService {
    @Autowired
    private ProductTypeMapper productTypeMapper;
    @Override
    public List<ProductType> treeData() {
//        return productTypeMapper.treeData();
        return treeDataLoop();
    }

    private List<ProductType> treeDataLoop() {
//        查询所有的数据
        List<ProductType> productTypes = productTypeMapper.selectList(null);

        Map<Long,ProductType> map =new HashMap<>();
        for (ProductType pt : productTypes) {
            map.put(pt.getId(), pt);
        }
//        最终返回的一级菜单
        List<ProductType> result=new ArrayList<>();
//        组装父子结构
        for (ProductType currentProductType : productTypes) {
//            判断是否是一级菜单
            if(currentProductType.getPid()==0){
//                是一级菜单 就返回
                result.add(currentProductType);
            }else {
//                ProductType parent=null;
//                for(ProductType pp : productTypes){
//                    if(pp.getId()==currentProductType.getPid()){
//                        parent=pp;
//                    }
//                }
                ProductType parent = map.get(currentProductType.getPid());
                parent.getChildren().add(currentProductType);
            }
        }
        return result;
    }

}
