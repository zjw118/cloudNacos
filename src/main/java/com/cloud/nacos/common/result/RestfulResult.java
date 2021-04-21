package com.cloud.nacos.common.result;

import lombok.Data;

/**
 * 封装返回结果
 *
 * @author Zhaojingwei
 * @date 2021/3/18
 */

@Data
public class RestfulResult {

    private String result = "Success";
    private String message;
    private Object data;		// 返回数据
    private int cntPage;		// page数
    private long cntData;		// 返回数据总数


}
