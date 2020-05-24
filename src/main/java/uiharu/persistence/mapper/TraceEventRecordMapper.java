package uiharu.persistence.mapper;

import uiharu.persistence.entity.TraceEventRecord;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * TraceEventRecordMapper.
 * @author Kahle
 * @date 2020-05-24T22:44:22.212+0800
 */
@Mapper
public interface TraceEventRecordMapper {

    /* (Start) This will be covered, please do not modify. */
    /**
     * Insert.
     * @param record The object to insert
     * @return Number of rows effected
     */
    int insert(TraceEventRecord record);

    /**
     * Insert batch.
     * @param recordList A list of records to insert
     * @return Number of rows effected
     */
    int insertBatch(@Param("recordList") List<TraceEventRecord> recordList);

    /**
     * Insert selective.
     * @param record The object to insert
     * @return Number of rows effected
     */
    int insertSelective(TraceEventRecord record);

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
    int deleteSelective(TraceEventRecord record);

    /**
     * Update by primary key.
     * @param record Content to be updated
     * @return Number of rows effected
     */
    int updateByPrimaryKey(TraceEventRecord record);

    /**
     * Update by primary key selective.
     * @param record Content to be updated
     * @return Number of rows effected
     */
    int updateByPrimaryKeySelective(TraceEventRecord record);

    /**
     * Conditional counting.
     * @param record Query condition
     * @return Count result
     */
    int countSelective(TraceEventRecord record);

    /**
     * Query by primary key.
     * @param id Primary key
     * @return Query result
     */
    TraceEventRecord queryByPrimaryKey(@Param("id") String id);

    /**
     * Query by primary key list.
     * @param idList Primary key list
     * @return Query result list
     */
    List<TraceEventRecord> queryByPrimaryKeyList(@Param("idList") List<String> idList);

    /**
     * Find one.
     * @param record Query condition
     * @return Query result
     */
    TraceEventRecord findOne(TraceEventRecord record);

    /**
     * Query selective.
     * @param record Query condition
     * @return Query result list
     */
    List<TraceEventRecord> querySelective(TraceEventRecord record);
    /* (End) This will be covered, please do not modify. */
    /* Generated by artoria-extend in 2020-05-24T22:44:22.556+0800. */

}
