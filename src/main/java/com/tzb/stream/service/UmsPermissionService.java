package com.tzb.stream.service;

/**
 * Create by zhatang on 2021/1/21.
 */
import com.tzb.stream.dto.UmsPermissionNode;

import java.util.List;

/**
 * 后台用户权限管理Service
 * Created by macro on 2018/9/29.
 */
public interface UmsPermissionService {

    /**
     * 以层级结构返回所有权限
     */
    List<UmsPermissionNode> treeList();

    void streamTest();
}