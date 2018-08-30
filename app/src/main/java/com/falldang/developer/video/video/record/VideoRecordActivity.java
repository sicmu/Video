package com.falldang.developer.video.video.record;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;

import com.falldang.developer.video.R;
import com.falldang.developer.video.video.common.TCConstants;
import com.falldang.developer.video.video.widget.ComposeRecordBtn;

public class VideoRecordActivity extends AppCompatActivity {
    private int mRecordType = TCConstants.VIDEO_RECORD_TYPE_UGC_RECORD;
    private ComposeRecordBtn composeRecord;

    private boolean isReadyJoin = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TURN_SCREEN_ON);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_video_record);

        initViews();
        initListener();
    }

    private void initViews() {
        composeRecord = findViewById(R.id.compose_record);
    }

    private void initListener() {
        initComposeRecord();
    }

    private void initComposeRecord() {
        composeRecord.setOnRecordButtonListener(new ComposeRecordBtn.IRecordButtonListener() {
            @Override
            public void onRecordStart() {

            }

            @Override
            public void onRecordPause() {

            }

            @Override
            public void onTakePhotoStart() {

            }

            @Override
            public void onTakePhotoFinish() {

            }
        });
    }

    private void startRecord() {

    }
}
