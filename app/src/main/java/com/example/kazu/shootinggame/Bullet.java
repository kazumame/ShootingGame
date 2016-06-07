package com.example.kazu.shootinggame;

/**
 * Created by kazu on 2015/10/02.
 */
public abstract class Bullet {
    float x, y;//x座標とy座標
    double vx, vy; //速度 x成分とy成分
    int vieww, viewh; //SurfaceViewの幅と高さ
    boolean isLive = true; //弾の生死フラグ

    public void move(){
        x = x + (float)vx;
        y = y + (float)vy;
        //画面外の弾を消す処理
        if( x > vieww || x < -9 ){
            isLive = false;
        }
        if( y > viewh || y < -9 ){
            isLive = false;
        }
    }
}
