package com.xyoye.dandanplay.mvp.impl;

import android.os.Bundle;

import com.xyoye.core.base.BaseMvpPresenter;
import com.xyoye.core.rx.Lifeful;
import com.xyoye.dandanplay.mvp.presenter.AnimaPresenter;
import com.xyoye.dandanplay.mvp.view.AnimaView;

/**
 * Created by YE on 2018/7/15.
 */


public class AnimaPresenterImpl extends BaseMvpPresenter<AnimaView> implements AnimaPresenter {

    public AnimaPresenterImpl(AnimaView view, Lifeful lifeful) {
        super(view, lifeful);
    }

    @Override
    public void init() {

    }

    @Override
    public void process(Bundle savedInstanceState) {

    }

    @Override
    public void resume() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void destroy() {

    }
}
