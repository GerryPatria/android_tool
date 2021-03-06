package com.real.dbci_apk;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class FragmentAdapter extends FragmentStateAdapter {


    public FragmentAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        switch (position)
        {
            case 1 :
                return new FirstFragment();
            case 2 :
                return new ThridFragment();
            case 3 :
                return new InfoFragment();
            case 4 :
                return new StatusFragment();
        }
        return new SecondFragment();
    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
