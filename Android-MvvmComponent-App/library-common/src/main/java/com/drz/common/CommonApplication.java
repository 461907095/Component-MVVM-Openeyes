package com.drz.common;

import com.drz.base.base.BaseApplication;
import com.drz.common.config.ModuleLifecycleConfig;

/**
 * 名称:
 * 功能:
 * 创建人: songpengwei
 * 创建日期: 2020-03-18 16:57
 */
public class CommonApplication extends BaseApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        setsDebug(BuildConfig.DEBUG);
        // 初始化需要初始化的组件
        ModuleLifecycleConfig.getInstance().initModuleAhead(this);
    }
}
