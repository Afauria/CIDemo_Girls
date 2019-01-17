package com.zwy.cidemo.girls.main;

import com.zwy.base.base.BasePresenter;
import com.zwy.base.base.BaseView;
import com.zwy.cidemo.girls.data.bean.Girls;

import java.util.List;

public interface GirlsContract {

    interface View extends BaseView<Presenter> {

        /**
         * View 的存活状态
         *
         * @return true or false
         */
        boolean isActive();

        void refresh(List<Girls> data);

        void load(List<Girls> data);

        void showError();

        void showNormal();

    }

    interface Presenter extends BasePresenter {

        void getGirls(int page, int size, boolean isRefresh);

    }


}
