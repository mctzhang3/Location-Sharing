package com.mzhang.locationsharing.activities;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.firebase.ui.auth.AuthUI;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.mzhang.locationsharing.R;
import com.mzhang.locationsharing.features.locationTrack.MapFragment;
import com.mzhang.locationsharing.fragments.ImageFragment;
import com.mzhang.locationsharing.util.CommonUtil;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private FragmentManager mFragmentManger;
    private Fragment mFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFragmentManger = getSupportFragmentManager();
        mFragment = new MapFragment();
//        mFragment = new ImageFragment();
        CommonUtil.replaceFragment(mFragmentManger, mFragment, R.id.fragment_container);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode,
                                    Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.main_menu, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        if(item.getItemId() == R.id.menu_sign_out) {
//            AuthUI.getInstance().signOut(this)
//                    .addOnCompleteListener(new OnCompleteListener<Void>() {
//                        @Override
//                        public void onComplete(@NonNull Task<Void> task) {
//                            Toast.makeText(MainActivity.this,
//                                    "You have been signed out.",
//                                    Toast.LENGTH_LONG)
//                                    .show();
//
//                            // Close activity
//                            finish();
//                        }
//                    });
//        }
//        return true;
//    }
}
