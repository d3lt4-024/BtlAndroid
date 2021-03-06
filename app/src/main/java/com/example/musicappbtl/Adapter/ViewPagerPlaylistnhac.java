package com.example.musicappbtl.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class ViewPagerPlaylistnhac extends FragmentPagerAdapter {

    public final ArrayList<Fragment> fragmentArrayList = new ArrayList<>();

    public ViewPagerPlaylistnhac(@NonNull @NotNull FragmentManager fm) {
        super(fm);
    }

    public ViewPagerPlaylistnhac(@NonNull @NotNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @NotNull
    @Override
    public Fragment getItem(int position) {
        return fragmentArrayList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentArrayList.size();
    }

    public void AddFragment(Fragment fragment) {
        fragmentArrayList.add(fragment);
    }
}
