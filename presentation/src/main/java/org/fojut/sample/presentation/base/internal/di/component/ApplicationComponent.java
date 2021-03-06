package org.fojut.sample.presentation.base.internal.di.component;

import android.content.Context;

import com.pushtorefresh.storio.sqlite.StorIOSQLite;

import org.fojut.sample.data.common.db.internal.di.DbModule;
import org.fojut.sample.domain.base.executor.PostExecutionThread;
import org.fojut.sample.domain.base.executor.ThreadExecutor;
import org.fojut.sample.domain.base.interactor.UseCase;
import org.fojut.sample.presentation.base.internal.di.module.ApplicationModule;
import org.fojut.sample.presentation.base.view.activity.BaseActivity;
import org.fojut.sample.presentation.base.view.fragment.BaseFragment;
import org.fojut.sample.presentation.download.internal.di.module.DownloadModule;
import org.fojut.sample.presentation.download.manager.DownloadManager;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class, DbModule.class, DownloadModule.class})
public interface ApplicationComponent {
    void inject(BaseActivity baseActivity);
    void inject(BaseFragment baseFragment);

    //Exposed to sub-graphs.
    Context context();
    ThreadExecutor threadExecutor();
    PostExecutionThread postExecutionThread();
    StorIOSQLite storIOSQLite();
    DownloadManager downloadManager();
}
