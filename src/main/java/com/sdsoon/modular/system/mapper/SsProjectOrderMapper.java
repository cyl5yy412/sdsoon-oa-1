package com.sdsoon.modular.system.mapper;

import com.sdsoon.modular.system.model.OrderProdManage;
import com.sdsoon.modular.system.model.ProjectOrderModel;
import com.sdsoon.modular.system.po.SsProjectOrder;
import com.sdsoon.modular.system.po.SsProjectOrderExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SsProjectOrderMapper {
    long countByExample(SsProjectOrderExample example);

    int deleteByExample(SsProjectOrderExample example);

    int deleteByPrimaryKey(String projectOrderId);

    int insert(SsProjectOrder record);

    int insertSelective(SsProjectOrder record);

    List<SsProjectOrder> selectByExample(SsProjectOrderExample example);

    SsProjectOrder selectByPrimaryKey(String projectOrderId);

    int updateByExampleSelective(@Param("record") SsProjectOrder record, @Param("example") SsProjectOrderExample example);

    int updateByExample(@Param("record") SsProjectOrder record, @Param("example") SsProjectOrderExample example);

    int updateByPrimaryKeySelective(SsProjectOrder record);

    int updateByPrimaryKey(SsProjectOrder record);

    //
    List<ProjectOrderModel> selectOrderList(@Param("projectOrderStatus") Integer projectOrderStatus, @Param("projectName") String projectName);

    List<ProjectOrderModel> selectAllOrders(@Param("projectName") String projectName);

}