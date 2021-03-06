package com.xue.erp.datasource.mappers;

import com.xue.erp.datasource.entities.Asset;
import com.xue.erp.datasource.entities.AssetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AssetMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table asset
     *
     * @mbggenerated
     */
    int countByExample(AssetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table asset
     *
     * @mbggenerated
     */
    int deleteByExample(AssetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table asset
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table asset
     *
     * @mbggenerated
     */
    int insert(Asset record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table asset
     *
     * @mbggenerated
     */
    int insertSelective(Asset record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table asset
     *
     * @mbggenerated
     */
    List<Asset> selectByExampleWithBLOBs(AssetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table asset
     *
     * @mbggenerated
     */
    List<Asset> selectByExample(AssetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table asset
     *
     * @mbggenerated
     */
    Asset selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table asset
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Asset record, @Param("example") AssetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table asset
     *
     * @mbggenerated
     */
    int updateByExampleWithBLOBs(@Param("record") Asset record, @Param("example") AssetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table asset
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Asset record, @Param("example") AssetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table asset
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Asset record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table asset
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(Asset record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table asset
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Asset record);
}