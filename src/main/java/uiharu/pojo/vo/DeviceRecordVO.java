package uiharu.pojo.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.lang.String;
import java.lang.Integer;

/**
 * The vo of the table "t_device_record".
 * @author Kahle
 * @date 2020-05-24T22:43:47.965+0800
 */
@Data
public class DeviceRecordVO implements Serializable {

    /* (Start) This will be covered, please do not modify. */
    /**
     * ID
     */
    private String id;
    /**
     * 名称
     */
    private String name;
    /**
     * 类型
     */
    private String type;
    /**
     * 名称
     */
    private String brandName;
    /**
     * 型号
     */
    private String model;
    /**
     * 名称
     */
    private String codeName;
    /**
     * 名称
     */
    private String displayName;
    /**
     * 厂商
     */
    private String manufacturer;
    /**
     * 描述
     */
    private String description;
    /**
     * UDID
     */
    private String udid;
    /**
     * IDFA
     */
    private String idfa;
    /**
     * 注册时间
     */
    private Date registerTime;
    /**
     * 创建者
     */
    private String createUser;
    /**
     * 创建时间
     */
    private Date createDate;
    /**
     * 修改者
     */
    private String updateUser;
    /**
     * 修改时间
     */
    private Date updateDate;
    /**
     * 数据状态
     */
    private Integer aliveFlag;
    /* (End) This will be covered, please do not modify. */
    /* Generated by artoria-extend in 2020-05-24T22:43:48.346+0800. */

}
