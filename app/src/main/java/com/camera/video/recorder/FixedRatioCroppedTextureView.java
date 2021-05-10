package com.camera.video.recorder;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.TextureView;


public class FixedRatioCroppedTextureView extends TextureView {
    protected int cameraWidth;
    protected int cameraHeight;
    protected int videoWidth;
    protected int videoHeight;

    public FixedRatioCroppedTextureView(Context context) {
        super(context);
    }

    public FixedRatioCroppedTextureView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public FixedRatioCroppedTextureView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public FixedRatioCroppedTextureView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int width = getMeasuredWidth();
        int height = getMeasuredHeight();
        setMeasuredDimension(width, height);
    }

    private int widthToHeight(int width) {
        return 1280;
    }

    private int heightToWidth(int height) {
        return 720;
    }

    @Override
    public void layout(int l, int t, int r, int b) {

        super.layout(l, t, r, b);
    }

    public void setPreviewSize(int previewWidth, int previewHeight) {
        cameraWidth = previewWidth;
        cameraHeight = previewHeight;
    }

    public void setCroppedSizeWeight(int widthWeight, int heightWeight) {
        this.videoWidth = widthWeight;
        this.videoHeight = heightWeight;
    }
}
