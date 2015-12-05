package com.example.hpzhang.design_new;

import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;

public class EditTextLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text_layout);

        TextInputLayout mTextInputLayoutName = (TextInputLayout) findViewById(R.id.textInput_layout_name);
        TextInputLayout mTextInputLayoutPassword = (TextInputLayout) findViewById(R.id.textInput_layout_password);
        //mTextInputLayoutName.getEditText()返回的是它的子EditText控件，一个TextInputLayout只能包含一个EditText控件
        mTextInputLayoutName.getEditText().addTextChangedListener(new MyTextWatcher(mTextInputLayoutName, "用户名长度不能小于6位"));
        mTextInputLayoutPassword.getEditText().addTextChangedListener(new MyTextWatcher(mTextInputLayoutPassword, "密码长度不能小于6位"));

    }

    class MyTextWatcher implements TextWatcher {
        private TextInputLayout mTextInputLayout;
        private String errorInfo;

        public MyTextWatcher(TextInputLayout textInputLayout, String errorInfo) {
            this.mTextInputLayout = textInputLayout;
            this.errorInfo = errorInfo;
        }

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable s) {
            if (mTextInputLayout.getEditText().getText().toString().length() < 6) {
                mTextInputLayout.setErrorEnabled(true);//是否设置错误提示信息
                mTextInputLayout.setError(errorInfo);//设置错误提示信息
            } else {
                mTextInputLayout.setErrorEnabled(false);//不设置错误提示信息
            }
        }
    }


}
