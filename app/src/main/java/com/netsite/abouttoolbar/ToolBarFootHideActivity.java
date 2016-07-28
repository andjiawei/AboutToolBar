package com.netsite.abouttoolbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ToolBarFootHideActivity extends AppCompatActivity {

    private RecyclerView rectclerView;
    private List<String> datas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tool_bar_foot_hide);

        rectclerView = (RecyclerView) findViewById(R.id.rv_behavior);
        initData();
        rectclerView.setLayoutManager(new LinearLayoutManager(this));
        rectclerView.setAdapter(new MyAdapter());
    }

    private void initData() {
        datas = new ArrayList<>();
        for (int i=0;i<66;i++){
            datas.add("item"+i);
        }
    }

    class MyAdapter extends RecyclerView.Adapter{

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

            TextView textView=new TextView(parent.getContext());
            return new TestHolder(textView);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
            TestHolder testHolder = (TestHolder) holder;
            testHolder.textView.setText(datas.get(position));
        }

        @Override
        public int getItemCount() {
            return datas==null?0:datas.size();
        }

        class TestHolder extends RecyclerView.ViewHolder{

            public TextView textView;

            public TestHolder(View itemView) {
                super(itemView);
                textView = (TextView) itemView;
            }
        }

    }
}
