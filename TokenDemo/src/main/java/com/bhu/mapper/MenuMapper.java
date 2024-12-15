package com.bhu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bhu.domain.Menu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MenuMapper extends BaseMapper<Menu> {
    List<String > selectPermsByUserId(@Param("userId") Long userId);
}
