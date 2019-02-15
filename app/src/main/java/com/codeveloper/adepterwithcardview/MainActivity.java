package com.codeveloper.adepterwithcardview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Language> lstLanguage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //Setting the AppTheme to display the activity
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addLanguages();

        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new GridLayoutManager(this,3));
        recyclerView.setAdapter(new RecyclerViewAdepter(this,lstLanguage));


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.menu_about) {
            Intent i=new Intent(MainActivity.this,About.class);
            startActivity(i);
           // Toast.makeText(this, "Example is clicked", Toast.LENGTH_SHORT).show();
            return true;
        }
        else if (id == R.id.main_search) {
            Toast.makeText(this, "Search is clicked", Toast.LENGTH_SHORT).show();

        }
        if (id == R.id.menu_exit) {
            finish();

        }

        return super.onOptionsItemSelected(item);
    }

    private void addLanguages(){
        lstLanguage = new ArrayList<>();

        lstLanguage.add(new Language("Angler js", R.drawable.ic_angularjs_original));
        lstLanguage.add(new Language("AMD", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("Asciidoc", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("Asympotic notation", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("AWK", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("Bash", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("BF", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("C", R.drawable.ic_c_original));
        lstLanguage.add(new Language("C++", R.drawable.ic_cplusplus_original));
        lstLanguage.add(new Language("Chapel", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("Citron", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("Clojure", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("Clojure-macro", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("C make", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("CoffeeScript", R.drawable.ic_coffeescript_original));
        lstLanguage.add(new Language("ColdFusion", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("Common lisp", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("Compojure", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("Crystal", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("C#", R.drawable.ic_csharp));
        lstLanguage.add(new Language("CSS", R.drawable.ic_css3_original));
        lstLanguage.add(new Language("Cypher", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("D", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("Dart", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("Dynamic Programming", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("EDM", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("Elisp", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("Elixir", R.drawable.ic_cplusplus));
        lstLanguage.add(new Language("ELM", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("Erlang", R.drawable.ic_erlang_original));
        lstLanguage.add(new Language("Factor", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("Forth", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("Fortran95", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("F#", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("Git", R.drawable.ic_git_original));
        lstLanguage.add(new Language("Go", R.drawable.ic_go_original));
        lstLanguage.add(new Language("Groovy", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("Hack", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("HTML", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("Haskell", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("Haxe", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("HQ9+", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("HTML5", R.drawable.ic_html5_original));
        lstLanguage.add(new Language("Hy", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("Inform7", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("Java", R.drawable.ic_java_original));
        lstLanguage.add(new Language("Java Script", R.drawable.ic_javascript_original));
        lstLanguage.add(new Language("jquery", R.drawable.ic_jquery_original));
        lstLanguage.add(new Language("json", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("Julia", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("KBD+", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("Kotlin", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("Lambda calculus ", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("Latex", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("Less", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("LFE", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("LiveScript", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("LogTalk", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("Lua", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("Make", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("MarkDown", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("Matlab", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("Messagepack", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("Mips", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("Montilang", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("MoonScript", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("Neat", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("NIM", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("NIX", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("Objective C", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("Ocaml", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("Opencv", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("Paren", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("Pascal", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("Pcre", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("perl", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("perl6", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("PHP", R.drawable.ic_php_original));
        lstLanguage.add(new Language("PHP Composer", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("pogo", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("PowerShell", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("Processing", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("Prolog", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("pureScript", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("pyqt", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("Python", R.drawable.ic_python_original));
        lstLanguage.add(new Language("Python", R.drawable.ic_python_original));
        lstLanguage.add(new Language("PythonStatcomp", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("QT", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("R", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("Racket", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("RED", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("RST", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("Ruby", R.drawable.ic_ruby_original));
        lstLanguage.add(new Language("Ruby Ecosystem", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("Rust", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("SASS", R.drawable.ic_sass_original));
        lstLanguage.add(new Language("Scala", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("Self", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("Shutit", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("SmallTalk", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("Solidity", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("Standard ML", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("Swift", R.drawable.ic_swift_original));
        lstLanguage.add(new Language("TCL", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("TCSH", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("Textile", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("tmux", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("toml", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("typeScript", R.drawable.ic_typescript_original));
        lstLanguage.add(new Language("VALA", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("VIM", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("VisualBasic", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("Whip", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("Wolfram", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("XML", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("Yaml", R.drawable.ic_elm_original));
        lstLanguage.add(new Language("ZFS", R.drawable.ic_elm_original));

    }
}
