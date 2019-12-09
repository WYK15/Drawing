package com.example.drawing.DrawingBoard;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;

import android.widget.LinearLayout;

public class DrawingLayout extends LinearLayout {

    DrawingView drawingView;
    PointF oldPoint;
    PointF newPoint;

    public DrawingLayout(Context context) {
        super(context);

        drawingView = new DrawingView(context);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {

        //处理双指放大/缩小，平移的功能
        switch (ev.getAction() & MotionEvent.ACTION_MASK){

            case MotionEvent.ACTION_DOWN:
                return drawingView.onTouchEvent(ev);

            case MotionEvent.ACTION_POINTER_DOWN:
                //oldPoint为两指中间
                break;

            case MotionEvent.ACTION_MOVE:

                if (ev.getPointerCount() == 2) {

                    //这里不消费事件，ACTION_UP会消费事件的
                }
                break;

            case MotionEvent.ACTION_UP:
                //也要设置x,y
                break;

            case MotionEvent.ACTION_POINTER_UP:
                return drawingView.onTouchEvent(ev);
        }

        //否则 消费此次事件，不向下传递
        return true;
    }
}
