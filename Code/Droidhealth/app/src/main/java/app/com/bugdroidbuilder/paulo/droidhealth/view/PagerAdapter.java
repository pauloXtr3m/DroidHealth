package app.com.bugdroidbuilder.paulo.droidhealth.view;

/**
 * Created by paulo on 05/04/16.
 */
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import app.com.bugdroidbuilder.paulo.droidhealth.view.calculator.CalcAlimentacaoFragment;
import app.com.bugdroidbuilder.paulo.droidhealth.view.calculator.CalcExFisicoFragment;
import app.com.bugdroidbuilder.paulo.droidhealth.view.calculator.CalcHidratacaoFragment;

public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return new CalcHidratacaoFragment();
            case 1:
                return new CalcAlimentacaoFragment();
            case 2:
                return new CalcExFisicoFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}