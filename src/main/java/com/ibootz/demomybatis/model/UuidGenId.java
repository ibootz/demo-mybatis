package com.ibootz.demomybatis.model;

import java.util.UUID;

import tk.mybatis.mapper.genid.GenId;

/**
 * TODO
 *
 * @author zhangq
 * @since 2020/1/17 13:17
 */
public class UuidGenId implements GenId<String> {

    @Override
    public String genId(String table, String column) {
        return UUID.randomUUID().toString();
    }

}
