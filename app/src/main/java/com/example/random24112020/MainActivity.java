package com.example.random24112020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    // 1 : Khai bao bien
    TextView mTvBieuThuc,mTvKetQua;
    ImageButton mImgButtonDung,mImgButtonSai;
    int mSothu1,mSothu2,mKetqua,mPheptinh;
    boolean mRandomKetqua = false;
    Random mRandom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 2 : Anh xa
        mTvBieuThuc = findViewById(R.id.textViewBieuThuc);
        mTvKetQua = findViewById(R.id.textViewKetQua);
        mImgButtonDung = findViewById(R.id.imageButtonDung);
        mImgButtonSai = findViewById(R.id.imageButtonSai);

        // Task
        // 1 : Random bieu thuc
        // 2 : Random ket qua
        // 3 : Kiem tra ket qua

        // random gia tri

        mSothu1 = mSothu2 = mKetqua = mPheptinh = 0;
        mRandom = new Random();

        mSothu1 = mRandom.nextInt(10) + 1 ;
        mSothu2 = mRandom.nextInt(10) + 1 ;
        mPheptinh = mRandom.nextInt(4) + 1 ;
        mRandomKetqua = mRandom.nextBoolean();
        // 1 : Cong , 2 : Tru , 3 : Nhan , 4 : Chia

        switch (mPheptinh){
            case 1 :
                mKetqua = mSothu1 + mSothu2;
                mTvBieuThuc.setText(mSothu1 + " + " + mSothu2);
                break;
            case 2 :
                mKetqua = mSothu1 - mSothu2;
                mTvBieuThuc.setText(mSothu1 + " - " + mSothu2);
                break;
            case 3 :
                mKetqua = mSothu1 * mSothu2;
                mTvBieuThuc.setText(mSothu1 + " * " + mSothu2);
                break;
            case 4 :
                mKetqua = mSothu1 / mSothu2;
                mTvBieuThuc.setText(mSothu1 + " / " + mSothu2);
                break;
        }

        if (mRandomKetqua == false){
            mKetqua += mRandom.nextInt(5) + 1;
        }

        mTvKetQua.setText(" = " + mKetqua);

    }
}