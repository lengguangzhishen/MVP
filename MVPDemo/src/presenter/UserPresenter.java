package presenter;

import model.IBaseModel;
import model.UserModel;
import android.content.Context;
import bean.UserBean;
import view.IUserView;

public class UserPresenter {

	private IUserView view;
	private IBaseModel<UserBean> model;

	public UserPresenter(IUserView view, Context context) {
		this.view = view;
		model = new UserModel(context);
	}
	
	public void login(String userName, String pwd) {
		UserBean userBean = model.newInstance();
		userBean.userName = userName;
		userBean.pwd = pwd;
		model.setData(userBean);
	}
	
}
