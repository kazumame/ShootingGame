package com.example.kazu.shootinggame;

import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/**
 * Created by kazu on 2015/09/29.
 */
public class ShootSurfaceView extends SurfaceView {

    private ShootSurfaceHolderCallback cb = null;

    public ShootSurfaceView(Context context) {
        super(context);
        // TODO Auto-generated constructor stub
        SurfaceHolder holder = getHolder();
        cb = new ShootSurfaceHolderCallback();
        holder.addCallback(cb);
    }

    @Override // SurfaceViewのサイズを取得
    protected void onSizeChanged(int w, int h, int oldw, int oldh){
        cb.vieww = w; cb.viewh = h;
    }

    @Override // タッチされた位置を取得
    public boolean onTouchEvent(MotionEvent event) {
        float x = event.getX(); // 座標を取得
        //float y = event.getY(); // 座標を取得
        int action = event.getAction(); // タッチの動作を取得
        cb.getTouchPosition(x, action);
        return true;
    }

}
