package com.example.calc;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    int a;
    int b;
    String s = "";
    String ss = "";

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_main);
    }

    public void clear(View view) {
        Button button = (Button) findViewById(R.id.button14);
        this.s = "";
        this.ss = "";
        ((TextView) findViewById(R.id.textView)).setText("");
        System.out.println("anvesha");
         System.out.println("sam");
    }

    public void sev(View view) {
        Button button = (Button) findViewById(R.id.button19);
        String str = this.s + 7;
        this.s = str;
        ((TextView) findViewById(R.id.textView)).setText(str);
    }

    public void del(View view) {
        Button button = (Button) findViewById(R.id.button15);
        String str = this.s;
        ((TextView) findViewById(R.id.textView)).setText(str.substring(0, str.length() - 1));
        String str2 = this.s;
        this.s = str2.substring(0, str2.length() - 1);
    }

    public void div(View view) {
        Button button = (Button) findViewById(R.id.button17);
        String str = this.s + "/";
        this.s = str;
        ((TextView) findViewById(R.id.textView)).setText(str);
    }

    public void eig(View view) {
        Button button = (Button) findViewById(R.id.button20);
        String str = this.s + 8;
        this.s = str;
        ((TextView) findViewById(R.id.textView)).setText(str);
    }

    public void nin(View view) {
        Button button = (Button) findViewById(R.id.button21);
        String str = this.s + 9;
        this.s = str;
        ((TextView) findViewById(R.id.textView)).setText(str);
    }

    public void fou(View view) {
        Button button = (Button) findViewById(R.id.button23);
        String str = this.s + 4;
        this.s = str;
        ((TextView) findViewById(R.id.textView)).setText(str);
    }

    public void fiv(View view) {
        Button button = (Button) findViewById(R.id.button24);
        String str = this.s + 5;
        this.s = str;
        ((TextView) findViewById(R.id.textView)).setText(str);
    }

    public void six(View view) {
        Button button = (Button) findViewById(R.id.button25);
        String str = this.s + 6;
        this.s = str;
        ((TextView) findViewById(R.id.textView)).setText(str);
    }

    public void one(View view) {
        Button button = (Button) findViewById(R.id.button27);
        String str = this.s + 1;
        this.s = str;
        ((TextView) findViewById(R.id.textView)).setText(str);
    }

    public void two(View view) {
        Button button = (Button) findViewById(R.id.button28);
        String str = this.s + 2;
        this.s = str;
        ((TextView) findViewById(R.id.textView)).setText(str);
    }

    public void thr(View view) {
        Button button = (Button) findViewById(R.id.button29);
        String str = this.s + 3;
        this.s = str;
        ((TextView) findViewById(R.id.textView)).setText(str);
    }

    public void min(View view) {
        Button button = (Button) findViewById(R.id.button26);
        String str = this.s + "-";
        this.s = str;
        ((TextView) findViewById(R.id.textView)).setText(str);
    }

    public void add(View view) {
        Button button = (Button) findViewById(R.id.button30);
        String str = this.s + "+";
        this.s = str;
        ((TextView) findViewById(R.id.textView)).setText(str);
    }

    public void per(View view) {
        Button button = (Button) findViewById(R.id.button16);
        String str = this.s + "%";
        this.s = str;
        ((TextView) findViewById(R.id.textView)).setText(str);
    }

    public void mul(View view) {
        Button button = (Button) findViewById(R.id.button22);
        String str = this.s + "x";
        this.s = str;
        ((TextView) findViewById(R.id.textView)).setText(str);
    }

    public void zero(View view) {
        Button button = (Button) findViewById(R.id.button32);
        String str = this.s + 0;
        this.s = str;
        ((TextView) findViewById(R.id.textView)).setText(str);
    }

    public void zeroZero(View view) {
        Button button = (Button) findViewById(R.id.button31);
        String str = this.s + "00";
        this.s = str;
        ((TextView) findViewById(R.id.textView)).setText(str);
    }

    public void dec(View view) {
        Button button = (Button) findViewById(R.id.button33);
        String str = this.s + ".";
        this.s = str;
        ((TextView) findViewById(R.id.textView)).setText(str);
    }

    public void equal(View view) {
        TextView textView = (TextView) findViewById(R.id.textView);
        Button button = (Button) findViewById(R.id.button34);
        int i = 0;
        while (i < this.s.length()) {
            char ch = this.s.charAt(i);
            if (ch == '+' || ch == '-' || ch == 'x' || ch == '/' || ch == '%') {
                String str = this.s;
                this.a = Integer.parseInt(str.substring(i + 1, str.length()));
                this.s = "";
                if (ch == '+') {
                    textView.setText("" + (this.a + this.b));
                    return;
                } else if (ch == '-') {
                    textView.setText("" + (this.b - this.a));
                    return;
                } else if (ch == 'x') {
                    textView.setText("" + (this.a * this.b));
                    return;
                } else if (ch == '/') {
                    textView.setText("" + (this.b / this.a));
                    return;
                } else {
                    textView.setText("Invalid Input");
                    return;
                }
            } else {
                String str2 = this.ss + ch;
                this.ss = str2;
                this.b = Integer.parseInt(str2);
                i++;
            }
        }
    }
}
