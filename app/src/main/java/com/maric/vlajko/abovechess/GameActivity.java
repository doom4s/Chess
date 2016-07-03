package com.maric.vlajko.abovechess;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListAdapter;

import com.maric.vlajko.abovechess.adapters.BoardAdapter;
import com.maric.vlajko.abovechess.pieces.Figure;
import com.maric.vlajko.abovechess.pieces.Pion;

import java.util.ArrayList;

public class GameActivity extends AppCompatActivity {

    private GridView chessGrid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        ImageView figureImage = new ImageView(this);

        ArrayList<Figure> figures = new ArrayList<>();
        figures.add(new Pion());
        figures.add(new Pion());

        chessGrid = (GridView) findViewById(R.id.chessboard);

        chessGrid.setAdapter(new BoardAdapter(this,figures));
    }
}
