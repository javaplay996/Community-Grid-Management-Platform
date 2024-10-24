package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.ForumEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 论坛
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("forum")
public class ForumView extends ForumEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 帖子类型的值
	*/
	@ColumnInfo(comment="帖子类型的字典表值",type="varchar(200)")
	private String forumValue;
	/**
	* 帖子状态的值
	*/
	@ColumnInfo(comment="帖子状态的字典表值",type="varchar(200)")
	private String forumStateValue;

	//级联表 用户
		/**
		* 用户姓名
		*/

		@ColumnInfo(comment="用户姓名",type="varchar(200)")
		private String yonghuName;
		/**
		* 用户手机号
		*/

		@ColumnInfo(comment="用户手机号",type="varchar(200)")
		private String yonghuPhone;
		/**
		* 用户身份证号
		*/

		@ColumnInfo(comment="用户身份证号",type="varchar(200)")
		private String yonghuIdNumber;
		/**
		* 用户头像
		*/

		@ColumnInfo(comment="用户头像",type="varchar(200)")
		private String yonghuPhoto;
		/**
		* 年龄
		*/

		@ColumnInfo(comment="年龄",type="int(11)")
		private Integer age;
		/**
		* 人口状态
		*/
		@ColumnInfo(comment="人口状态",type="int(11)")
		private Integer renkouzhuangtaiTypes;
			/**
			* 人口状态的值
			*/
			@ColumnInfo(comment="人口状态的字典表值",type="varchar(200)")
			private String renkouzhuangtaiValue;
		/**
		* 小区
		*/
		@ColumnInfo(comment="小区",type="int(11)")
		private Integer xiaoquTypes;
			/**
			* 小区的值
			*/
			@ColumnInfo(comment="小区的字典表值",type="varchar(200)")
			private String xiaoquValue;
		/**
		* 身体状况
		*/
		@ColumnInfo(comment="身体状况",type="int(11)")
		private Integer shentiTypes;
			/**
			* 身体状况的值
			*/
			@ColumnInfo(comment="身体状况的字典表值",type="varchar(200)")
			private String shentiValue;
		/**
		* 单位
		*/
		@ColumnInfo(comment="单位",type="int(11)")
		private Integer danweileixingTypes;
			/**
			* 单位的值
			*/
			@ColumnInfo(comment="单位的字典表值",type="varchar(200)")
			private String danweileixingValue;
		/**
		* 用户邮箱
		*/

		@ColumnInfo(comment="用户邮箱",type="varchar(200)")
		private String yonghuEmail;
	//级联表 管理员
		/**
		* 学生名
		*/
		@ColumnInfo(comment="学生名",type="varchar(100)")
		private String uusername;
		/**
		* 密码
		*/
		@ColumnInfo(comment="密码",type="varchar(100)")
		private String upassword;
		/**
		* 角色
		*/
		@ColumnInfo(comment="角色",type="varchar(100)")
		private String urole;
		/**
		* 新增时间
		*/
		@ColumnInfo(comment="新增时间",type="timestamp")
		private Date uaddtime;



	public ForumView() {

	}

	public ForumView(ForumEntity forumEntity) {
		try {
			BeanUtils.copyProperties(this, forumEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 帖子类型的值
	*/
	public String getForumValue() {
		return forumValue;
	}
	/**
	* 设置： 帖子类型的值
	*/
	public void setForumValue(String forumValue) {
		this.forumValue = forumValue;
	}
	//当前表的
	/**
	* 获取： 帖子状态的值
	*/
	public String getForumStateValue() {
		return forumStateValue;
	}
	/**
	* 设置： 帖子状态的值
	*/
	public void setForumStateValue(String forumStateValue) {
		this.forumStateValue = forumStateValue;
	}


	//级联表的get和set 用户

		/**
		* 获取： 用户姓名
		*/
		public String getYonghuName() {
			return yonghuName;
		}
		/**
		* 设置： 用户姓名
		*/
		public void setYonghuName(String yonghuName) {
			this.yonghuName = yonghuName;
		}

		/**
		* 获取： 用户手机号
		*/
		public String getYonghuPhone() {
			return yonghuPhone;
		}
		/**
		* 设置： 用户手机号
		*/
		public void setYonghuPhone(String yonghuPhone) {
			this.yonghuPhone = yonghuPhone;
		}

		/**
		* 获取： 用户身份证号
		*/
		public String getYonghuIdNumber() {
			return yonghuIdNumber;
		}
		/**
		* 设置： 用户身份证号
		*/
		public void setYonghuIdNumber(String yonghuIdNumber) {
			this.yonghuIdNumber = yonghuIdNumber;
		}

		/**
		* 获取： 用户头像
		*/
		public String getYonghuPhoto() {
			return yonghuPhoto;
		}
		/**
		* 设置： 用户头像
		*/
		public void setYonghuPhoto(String yonghuPhoto) {
			this.yonghuPhoto = yonghuPhoto;
		}

		/**
		* 获取： 年龄
		*/
		public Integer getAge() {
			return age;
		}
		/**
		* 设置： 年龄
		*/
		public void setAge(Integer age) {
			this.age = age;
		}
		/**
		* 获取： 人口状态
		*/
		public Integer getRenkouzhuangtaiTypes() {
			return renkouzhuangtaiTypes;
		}
		/**
		* 设置： 人口状态
		*/
		public void setRenkouzhuangtaiTypes(Integer renkouzhuangtaiTypes) {
			this.renkouzhuangtaiTypes = renkouzhuangtaiTypes;
		}


			/**
			* 获取： 人口状态的值
			*/
			public String getRenkouzhuangtaiValue() {
				return renkouzhuangtaiValue;
			}
			/**
			* 设置： 人口状态的值
			*/
			public void setRenkouzhuangtaiValue(String renkouzhuangtaiValue) {
				this.renkouzhuangtaiValue = renkouzhuangtaiValue;
			}
		/**
		* 获取： 小区
		*/
		public Integer getXiaoquTypes() {
			return xiaoquTypes;
		}
		/**
		* 设置： 小区
		*/
		public void setXiaoquTypes(Integer xiaoquTypes) {
			this.xiaoquTypes = xiaoquTypes;
		}


			/**
			* 获取： 小区的值
			*/
			public String getXiaoquValue() {
				return xiaoquValue;
			}
			/**
			* 设置： 小区的值
			*/
			public void setXiaoquValue(String xiaoquValue) {
				this.xiaoquValue = xiaoquValue;
			}
		/**
		* 获取： 身体状况
		*/
		public Integer getShentiTypes() {
			return shentiTypes;
		}
		/**
		* 设置： 身体状况
		*/
		public void setShentiTypes(Integer shentiTypes) {
			this.shentiTypes = shentiTypes;
		}


			/**
			* 获取： 身体状况的值
			*/
			public String getShentiValue() {
				return shentiValue;
			}
			/**
			* 设置： 身体状况的值
			*/
			public void setShentiValue(String shentiValue) {
				this.shentiValue = shentiValue;
			}
		/**
		* 获取： 单位
		*/
		public Integer getDanweileixingTypes() {
			return danweileixingTypes;
		}
		/**
		* 设置： 单位
		*/
		public void setDanweileixingTypes(Integer danweileixingTypes) {
			this.danweileixingTypes = danweileixingTypes;
		}


			/**
			* 获取： 单位的值
			*/
			public String getDanweileixingValue() {
				return danweileixingValue;
			}
			/**
			* 设置： 单位的值
			*/
			public void setDanweileixingValue(String danweileixingValue) {
				this.danweileixingValue = danweileixingValue;
			}

		/**
		* 获取： 用户邮箱
		*/
		public String getYonghuEmail() {
			return yonghuEmail;
		}
		/**
		* 设置： 用户邮箱
		*/
		public void setYonghuEmail(String yonghuEmail) {
			this.yonghuEmail = yonghuEmail;
		}
	//级联表的get和set 管理员
		/**
		* 获取： 学生名
		*/
		public String getUusername() {
			return uusername;
		}
		/**
		* 设置： 学生名
		*/
		public void setUusername(String uusername) {
			this.uusername = uusername;
		}
		/**
		* 获取： 密码
		*/
		public String getUpassword() {
			return upassword;
		}
		/**
		* 设置： 密码
		*/
		public void setUpassword(String upassword) {
			this.upassword = upassword;
		}
		/**
		* 获取： 角色
		*/
		public String getUrole() {
			return urole;
		}
		/**
		* 设置： 角色
		*/
		public void setUrole(String urole) {
			this.urole = urole;
		}
		/**
		* 获取： 新增时间
		*/
		public Date getUaddtime() {
			return uaddtime;
		}
		/**
		* 设置： 新增时间
		*/
		public void setUaddtime(Date uaddtime) {
			this.uaddtime = uaddtime;
		}


	@Override
	public String toString() {
		return "ForumView{" +
			", forumValue=" + forumValue +
			", forumStateValue=" + forumStateValue +
			", yonghuName=" + yonghuName +
			", yonghuPhone=" + yonghuPhone +
			", yonghuIdNumber=" + yonghuIdNumber +
			", yonghuPhoto=" + yonghuPhoto +
			", age=" + age +
			", yonghuEmail=" + yonghuEmail +
			"} " + super.toString();
	}
}