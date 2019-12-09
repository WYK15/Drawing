package com.example.drawing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.widget.LinearLayout;

import com.example.drawing.DrawingBoard.DrawingLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout drawBoard;
    DrawingLayout drawingLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //绑定id和变量/初始化变量
        bindViewId();
        //把画画版添加至activity中
        drawBoard.addView(drawingLayout,1);


    }

    public void bindViewId() {
        drawBoard = findViewById(R.id.Board);
        drawingLayout = new DrawingLayout(this.getApplicationContext());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }
}
