package model;

import android.content.Context;
import android.widget.Toast;
import bean.UserBean;

public class UserModel implements IBaseModel<UserBean>{
	
	private Context context;

	public UserModel(Context context) {
		this.context = context;
	}

	@Override
	public void setData(UserBean t) {
		Toast.makeText(context, t.toString(), 0).show();
	}

	@Override
	public UserBean getData() {
		UserBean userBean = new UserBean();
		userBean.id = "1";
		userBean.userName = "litengfei";
		userBean.pwd = "123456";
		return userBean;
	}

	@Override
	public UserBean newInstance() {
		return new UserBean();
	}

	

}
