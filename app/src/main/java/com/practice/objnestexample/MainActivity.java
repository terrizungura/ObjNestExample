package com.practice.objnestexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import io.objectbox.Box;
import io.objectbox.BoxStore;

public class MainActivity extends AppCompatActivity {

    private BoxStore boxStore;
    private Box<Projects> mProjectsBox;
    private Box<Report> mReportBox;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boxStore = ((TheApp) getApplication()).getBoxStore();
        mProjectsBox = boxStore.boxFor(Projects.class);
        mReportBox = boxStore.boxFor(Report.class);

        Button runButton = (Button) findViewById(R.id.runBtn);
        runButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Projects projects = new Projects(01, "JoburgProject", "Jon");
                mProjectsBox.put(projects);
                Projects theProject = mProjectsBox.get(1L);
                Log.d("MainActivity", "Projects: " + theProject);

                Report report = new Report(0L, "Joburg Project", "Jon Long", "Bob", "Joburg");
                mReportBox.put(report);
                Report theReport = mReportBox.get(1L);
                Log.d("MainActivity", "Report: " + theReport);
            }
        });
    }
}
