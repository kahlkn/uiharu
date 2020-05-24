package uiharu.persistence.mapper;

import uiharu.persistence.entity.DeviceRecord;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * DeviceRecordMapper.
 * @author Kahle
 * @date 2020-05-24T22:43:47.965+0800
 */
@Mapper
public interface DeviceRecordMapper {

    /* (Start) This will be covered, please do not modify. */
    /**
     * Insert.
     * @param record The object to insert
     * @return Number of rows effected
     */
    int insert(DeviceRecord record);

    /**
     * Insert batch.
     * @param recordList A list of records to insert
     * @return Number of rows effected
     */
    int insertBatch(@Param("recordList") List<DeviceRecord> recordList);

    /**
     * Insert selective.
     * @param record The object to insert
     * @return Number of rows effected
     */
    int insertSelective(DeviceRecord record);

    /**
     * Delete by primary key.
     * @param id Primary key
     * @param updateUser Current operator
     * @return Number of rows effected
     */
    int deleteByPrimaryKey(@Param("id") String id, @Param("updateUser") String updateUser);

    /**
     * Delete by primary key list.
     * @param idList Primary key list
     * @param updateUser Current operator
     * @return Number of rows effected
     */
    int deleteByPrimaryKeyList(@Param("idList") List<String> idList, @Param("updateUser") String updateUser);

    /**
     * Delete selective.
     * @param record Delete conditions
     * @return Number of rows effected
     */
    int deleteSelective(DeviceRecord record);

    /**
     * Update by primary key.
     * @param record Content to be updated
     * @return Number of rows effected
     */
    int updateByPrimaryKey(DeviceRecord record);

    /**
     * Update by primary key selective.
     * @param record Content to be updated
     * @return Number of rows effected
     */
    int updateByPrimaryKeySelective(DeviceRecord record);

    /**
     * Conditional counting.
     * @param record Query condition
     * @return Count result
     */
    int countSelective(DeviceRecord record);

    /**
     * Query by primary key.
     * @param id Primary key
     * @return Query result
     */
    DeviceRecord queryByPrimaryKey(@Param("id") String id);

    /**
     * Query by primary key list.
     * @param idList Primary key list
     * @return Query result list
     */
    List<DeviceRecord> queryByPrimaryKeyList(@Param("idList") List<String> idList);

    /**
     * Find one.
     * @param record Query condition
     * @return Query result
     */
    DeviceRecord findOne(DeviceRecord record);

    /**
     * Query selective.
     * @param record Query condition
     * @return Query result list
     */
    List<DeviceRecord> querySelective(DeviceRecord record);
    /* (End) This will be covered, please do not modify. */
    /* Generated by artoria-extend in 2020-05-24T22:43:48.283+0800. */

}
