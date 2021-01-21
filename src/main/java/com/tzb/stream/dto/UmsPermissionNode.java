package com.tzb.stream.dto;

/**
 * Create by zhatang on 2021/1/21.
 */

import com.tzb.stream.mbg.model.UmsPermission;

import java.util.List;

/**
 * Created by macro on 2018/9/30.
 */
public class UmsPermissionNode extends UmsPermission {
    private List<UmsPermissionNode> children;

    public List<UmsPermissionNode> getChildren() {
        return children;
    }

    public void setChildren(List<UmsPermissionNode> children) {
        this.children = children;
    }
}