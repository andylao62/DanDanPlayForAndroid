package com.xyoye.dandanplay.mvp.presenter;

import com.xyoye.dandanplay.utils.interf.presenter.BaseMvpPresenter;

/**
 * Created by xyoye on 2018/7/4 0004.
 */

public interface BindDanmuPresenter extends BaseMvpPresenter {
    void matchDanmu(String videoPath);

    void matchSmbDanmu(String videoName);

    void searchDanmu(String anime, String episode);
}
