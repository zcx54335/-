package com.zcx.csc.ware.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ???湤????
 * 
 * @author zcx
 * @email 961519171@qq.com
 * @date 2022-12-15 11:37:23
 */
@Data
@TableName("wms_ware_order_task_detail")
public class WareOrderTaskDetailEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * sku_id
	 */
	private Long skuId;
	/**
	 * sku_name
	 */
	private String skuName;
	/**
	 * ????????
	 */
	private Integer skuNum;
	/**
	 * ??????id
	 */
	private Long taskId;

}
