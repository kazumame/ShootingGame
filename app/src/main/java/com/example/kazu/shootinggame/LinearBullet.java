package com.example.kazu.shootinggame;

/**
 * Created by kazu on 2015/10/08.
 */
public class LinearBullet extends Bullet{
    //直線弾クラス
    public LinearBullet(float spaceshipx, float spaceshipy, int vieww, int viewh){
        x = spaceshipx;
        y = spaceshipy;
        vx = 0;
        vy = -5;
        this.vieww = vieww;
        this.viewh = viewh;
    }
}
