package br.com.jamesson.aula07_nashorn_javascript;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Main {

    public static void main(String[] args) {

        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        ScriptEngine nashorn = scriptEngineManager.getEngineByName("nashorn");

        try {
            nashorn.eval("print('Hello World from Nashorn ')");
        } catch (ScriptException e) {
            e.getStackTrace();
        }

    }

}
