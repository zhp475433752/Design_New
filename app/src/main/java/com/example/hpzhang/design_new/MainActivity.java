package com.example.hpzhang.design_new;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if("paid".equals(BuildConfig.FLAVOR)){
            // TODO 收费版
        }else if("free".equals(BuildConfig.FLAVOR)){
            // 免费版
        }
    }

    /**
     * TextInputLayout-提示风格EditText
     * @param view
     */
    public void onTextInputLayout(View view) {
        Intent intent = new Intent(this, EditTextLayoutActivity.class);
        startActivity(intent);
    }

    /**
     * FloatingActionButton-圆形按钮
     * @param view
     */
    public void onFloatingActionButton(View view) {
        Intent intent = new Intent(this, FloatingActionButtonActivity.class);
        startActivity(intent);
    }

    /**
     * Snackbar-类似Toast
     * @param view
     * 一个介于Toast和AlertDialog之间轻量级控件，它可以很方便的提供消息的提示和动作反馈
     */
    public void onSnackbar(View view) {

    }

    /**
     * TabLayout-选项卡
     * @param view
     */
    public void onTabLayout(View view) {
        // 详细内容参考 D:\workspace\studio\YhMxb 项目
    }

    /**
     * NavigationView-DrawerLayout的SlideMenu
     * @param view
     */
    public void onNavigationView(View view) {
        // 详细内容参考 D:\workspace\studio\YhMxb 项目
    }

    /**
     * CoordinatorLayout-超级FrameLayout
     * @param view
     */
    public void onCoordinatorLayout(View view) {

    }

    /**
     * AppBarLayout-滑动Layout
     * @param view
     */
    public void onAppBarLayout(View view) {

    }

    /**
     * CollapsingToolbarLayout-可折叠的ToolbarLayout
     * @param view
     */
    public void onCollapsingToolbarLayout(View view) {

    }


}
