package com.mzhang.locationsharing.util;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.provider.ContactsContract;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import java.util.ArrayList;
import java.util.Calendar;

/**
 * Created by v579294 on 4/14/17.
 */

public class CommonUtil {


    public static void removeFragment(FragmentManager fragmentManager, Fragment fragment, int enterAnim, int exitAnim, int popEnter, int popExit) {
//        FragmentTransaction fragmentTransaction;
//        FragmentManager fragmentManager = getFragmentManager();
//        fragmentTransaction = fragmentManager.beginTransaction();
//        fragmentTransaction.setCustomAnimations(enterAnim, exitAnim, popEnter, popExit);
//        fragmentTransaction.remove(fragment);
//        fragmentTransaction.commit();
        fragmentManager.popBackStack();
//        if (fragment.getTag() != null) {
//            fragmentManager.popBackStack(fragment.getTag(), android.app.FragmentManager.POP_BACK_STACK_INCLUSIVE);
//        } else {
//            fragmentManager.popBackStack();
//        }
    }

    public static void replaceFragment(FragmentManager fragmentManager, Fragment fragment, int container) {
        String tag = fragment.getClass().getSimpleName();
        FragmentTransaction ft = fragmentManager.beginTransaction();
        ft.replace(container, fragment, tag);
        ft.addToBackStack(tag);
        ft.commit();
    }

}
