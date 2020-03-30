package com.ec.v2.constact;



public class UrlConstants {
	/**
	 *
	 * @Title: UrlConstants.java
	 * @Description: 标签相关接口
	 * @author shicy
	 * @date 2020-03-24 11:05:52
	 */
	public interface LABEL {
		String UPDATE = "/v2/label/update";
	}

	/**
	 *
	 * @Title: UrlConstants.java
	 * @Description: 客户相关接口
	 * @author shicy
	 * @date 2020-03-24 11:11:34
	 */
	public interface CUSTOMER {

		/**
		 * 查询客户标签
		 */
		String POST_QUERYLABEL = "/v2/customer/queryLabel";

		/**
		 * 新增客户
		 */
		String POST_ADDCUSTOMER = "/v2/customer/addCustomer";

		/**
		 * 合并客户复
		 */
		String POST_COMBINE = "/v2/customer/combine";

        /**
         * 客户分组
         */
        String GET_CUSTOMERGROUP = "/v2/customer/getCustomerGroup";

        /**
         * 分页查询客户轨迹
         */
        String GET_TRAJECTORY  = "/v2/customer/getTrajectory";

        /**
         * 批量查询客户信息
         */
        String POST_PRECISEQUERY = "/v2/customer/preciseQuery";

		/**
		 * 分页查询客户信息
		 */
		String POST_QUERY = "/v2/customer/query";

		/**
		 * 修改客户
		 */
		String POST_UPDATECUSTOMER = "/v2/customer/updateCustomer";

		/**
		 * 修改客户阶段
		 */
		String POST_UPDATECUSTOMER_STEP = "/v2/step/update";

	}

	/**
	 *
	 * @Title: UrlConstants.java
	 * @Description: 客户更变相关接口
	 * @author shicy
	 * @date 2020-03-24 11:05:34
	 */
	public interface CUSTOMERCHANGE {
		/**
		 * 放弃客户
		 */
		String ABANDON = "/v2/customer/change/abandon";
		/**
		 * 修改跟进人
		 */
		String USER = "/v2/customer/change/user";

	}

	public interface TRAJECTORY {
		String SAVE_USER_TRAJECTORY = "/trajectory/saveUserTrajectory";
		String FIND_USER_TRAJECTORY = "/trajectory/findUserTrajectory";
		String FIND_HISTORY_USER_TRAJECTORY = "/trajectory/findHistoryUserTrajectory";
	}

    public interface RECORD {

		/**
		 * 电话外呼
		 */
        String TELL_CALL = "/v2/record/call";
		/**
		 * 电话空闲用户
		 */
        String GET_FREE_STATUS_UID = "/v2/record/getFreeStatusUid";
		/**
		 * 短信记录
		 */
        String SMS_RECORD = "/v2/record/smsRecord";
		/**
		 * 电话记录
		 */
        String TEL_RECORD = "/v2/record/telRecord";
    }

    public interface CONFIG{

		/**
		 * 获取自定字段
		 */
        String GET_FIELD_MAPPING = "/v2/config/getFieldMapping";
		/**
		 * 标签信息
		 */
		String GET_LABEL_INFO = "/v2/config/getLabelInfo";
		/**
		 * 业务组信息
		 */
        String GET_PUBLIC_POND = "/v2/config/getPubicPond";
    }

    public interface ORGANIZATION{

		/**
		 * 创建部门
		 */
        String CREATE = "/v2/org/dept/create";
		/**
		 * 编辑部门
		 */
		String EDIT = "/v2/org/dept/edit";
		/**
		 * 组织架构信息
		 */
        String INFO = "/v2/org/struct/info";
		/**
		 * 创建用户
		 */
		String CREATE_USER = "/v2/org/user/create";
		/**
		 * 启用或者禁用用户
		 */
        String ON_OFF_USER = "/v2/org/user/onoff";
    }

    public interface ROBOT {

        String ADD_TASK = "/v2/robot/addtask";
        String ADD_TASK_RECORD = "/v2/robot/addtaskrecord";
        String UPDATE_TASK = "/v2/robot/updatetask";
    }

    public interface ASYNCHRONIZATION {
        String CREATE = "/v2/asynchronization/create";
        String QUERY = "/v2/asynchronization/query";
    }
}
