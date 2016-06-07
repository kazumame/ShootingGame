package com.example.kazu.shootinggame;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    static Bitmap bgimage;
    static Bitmap spaceship;
    static Bitmap enemy;
    static Bitmap mybullet;
    static Bitmap bullet1, bullet2;
    static Vibrator vibrator;

    /** Called when the activity is first created. */
    @Override // Activityのライフサイクルのメソッド。生成時に呼ばれる
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // SurfaceViewを登録
        setContentView(new ShootSurfaceView(this));
        vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);
    }

    @Override // Activityのライフサイクルのメソッド
    public void onResume(){
        super.onResume();
        // リソースから画像ファイルを読み込む
        Resources res = getResources(); // リソースの取得
        bgimage = BitmapFactory.decodeResource(res, R.drawable.background);
        spaceship = BitmapFactory.decodeResource(res, R.drawable.myspaceship);
        enemy = BitmapFactory.decodeResource(res, R.drawable.enemyship);
        mybullet = BitmapFactory.decodeResource(res, R.drawable.mybullet);
        bullet1 = BitmapFactory.decodeResource(res, R.drawable.bullet1);
        bullet2 = BitmapFactory.decodeResource(res, R.drawable.bullet2);
    }

    @Override  // Activityのライフサイクルのメソッド
    public void onPause(){
        super.onPause();
        finish(); // onDestroy()が呼ばれる
    }

    @Override // Activityのライフサイクルのメソッド。終了時に呼ぶ
    public void onDestroy() {
        super.onDestroy();
    }

}
