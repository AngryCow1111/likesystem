package com.angrycow1111.likesystem.entity;

import java.util.Date;
import lombok.Data;

/**
 * ${NAME}
 *
 * @author <a href="mailto:yanghui@pingtiao.com">yanghui</a>
 * @since 2019-06-10
 */
@Data
public class UserRelationship {
    /**
     * 主键
     */
    private Long id;

    /**
     * 分享用户id
     */
    private Long shareUserId;

    /**
     * 分享场景值
     */
    private String shareSceneId;

    /**
     * 访问者id
     */
    private Long viewUserId;

    /**
     * 关系描述
     */
    private Integer relationship;

    /**
     * 生成时间
     */
    private Date gmtCreate;

    /**
     * 更新时间
     */
    private Date gmtUpdate;

    /**
     * 热度
     */
    private Integer hotValue;

    /**
     * 分享页面路径
     */
    private String route;
}