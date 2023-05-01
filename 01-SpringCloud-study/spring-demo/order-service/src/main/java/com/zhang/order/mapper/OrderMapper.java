package com.zhang.order.mapper;

import com.zhang.order.pojo.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface OrderMapper {
// Order findById(Long orderId);

    @Select("select * from tb_order where id = #{id}")
    Order findById(Long id);
}
