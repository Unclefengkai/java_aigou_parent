package cn.mycom.aigou.service.impl;

import cn.mycom.aigou.domain.Brand;
import cn.mycom.aigou.mapper.BrandMapper;
import cn.mycom.aigou.query.BrandQuery;
import cn.mycom.aigou.service.IBrandService;
import cn.mycom.aigou.util.LetterUtil;
import cn.mycom.aigou.util.PageList;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import net.sf.jsqlparser.statement.update.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * <p>
 * 品牌信息 服务实现类
 * </p>
 *
 * @author wbtest
 * @since 2019-03-30
 */
@Service
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand> implements IBrandService {
    @Autowired
    private BrandMapper brandMapper;
    private List<Brand> list;


    @Override
    public PageList<Brand> queryPage(BrandQuery query) {
//        PageList<Brand> pageList = new PageList<>();
        Long total=0L;
        total= brandMapper.queryPageCount(query);
//        pageList.setTotal(total);
        if(total==0){
            return new PageList<>();
        }else {

//            List<Brand> list = new ArrayList<>();
            List<Brand> list= brandMapper.queryPageList(query);
//            pageList.setRows(list);
            return new PageList<>(total,list);
//            return pageList;
        }

    }

    @Override
    public boolean insert(Brand entity) {
        entity.setCreateTime(new Date().getTime());
        entity.setFirstLetter(LetterUtil.getFirstLetter(entity.getName()));
        return super.insert(entity);
    }

    @Override
    public boolean updateById(Brand entity) {
        entity.setUpdateTime(new Date().getTime());
        entity.setFirstLetter(LetterUtil.getFirstLetter(entity.getName()));
        return super.updateById(entity);
    }
}
