package com.example.phuong.blockcallapp.ui.welcome;

import android.support.annotation.NonNull;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.util.Log;

import com.example.phuong.blockcallapp.R;
import com.example.phuong.blockcallapp.adapters.TabAdapter;
import com.example.phuong.blockcallapp.ui.BaseActivity;
import com.example.phuong.blockcallapp.ui.block_call.ContactBlockFragment_;
import com.example.phuong.blockcallapp.ui.contact.ContactFragment_;
import com.example.phuong.blockcallapp.ui.setting.SettingsFragment_;
import com.orm.SugarContext;

import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_main)
public class MainActivity extends BaseActivity {
    @ViewById(R.id.tabs)
    TabLayout mTab;
    @ViewById(R.id.viewPagerTab)
    ViewPager mViewPagerTab;

    @Override
    public void inits() {
        SugarContext.init(this);
        setupViewPager(mViewPagerTab);
        mTab.setupWithViewPager(mViewPagerTab);
    }

    private void setupViewPager(ViewPager viewPager) {
        TabAdapter adapter = new TabAdapter(getSupportFragmentManager());
        String[] title = getResources().getStringArray(R.array.title_tab_layout);
        adapter.addFragment(ContactFragment_.builder().build(), title[0]);
        adapter.addFragment(ContactBlockFragment_.builder().build(), title[1]);
        adapter.addFragment(SettingsFragment_.builder().build(), title[2]);
        viewPager.setAdapter(adapter);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        Log.d(getClass().getSimpleName(),"==========");
//        List<Fragment> fragments = getSupportFragmentManager().getFragments();
//        if (fragments != null) {
//            for (Fragment fragment : fragments) {
//                fragment.onRequestPermissionsResult(requestCode, permissions, grantResults);
//            }
//        }

    }
}
