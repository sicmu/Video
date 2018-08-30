package com.falldang.developer.video;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.falldang.developer.video.video.record.VideoRecordActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.record).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.record:
                record();
                break;
        }
    }

    /**
     * 拍摄
     */
    private void record() {
        startActivity(new Intent(this, VideoRecordActivity.class));
    }
}
