package com.example.apppreguntas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.apppreguntas.utils.Config;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class Resumen extends AppCompatActivity {

    TextView etq_nombres;
    Config config;
    LinearLayout contenedor_cuestionarios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumen);
        config = new Config(getApplicationContext());
        SharedPreferences archivo = getSharedPreferences("app-preguntas",MODE_PRIVATE);
        contenedor_cuestionarios = findViewById(R.id.contenedor_cuestionarios);
        String id_usuario = archivo.getString("id_usuario","");
        etq_nombres = findViewById(R.id.etq_nombres);
        etq_nombres.setText(archivo.getString("nombres",""));
        traerCuestionarios(id_usuario);
    }


    public void  traerCuestionarios(String id_usuario){
        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
        String url = config.getEndpoint(("API_Preguntas/consult_questionnaires.php"));

        StringRequest solicitud = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    System.out.println("El servidor cuestionarios POST responde OK");
                    JSONObject jsonObject = new JSONObject(response);
                    JSONArray cuestionarios = jsonObject.getJSONArray("cuestionarios");
                    System.out.println(response);

                    for (int i = 0; i < cuestionarios.length(); i++) {
                        JSONObject cuestionario = cuestionarios.getJSONObject(i);
                        TextView tarjeta = new TextView(contenedor_cuestionarios.getContext());
                        String todo = "ID: " +cuestionario.getString("id") + "\n" +
                            "Fecha Inicio:" + cuestionario.getString("fecha_inicio") + "\n"+
                             "N°Preguntas:"+ cuestionario.getString("cant_preguntas") + "\n"+
                             "N°OK:" + cuestionario.getString("cant_ok")+ " - " +
                             "N°Error :" +cuestionario.getString("cant_error");

                        String id_cuestionario = cuestionario.getString("id");
                        String fecha_inicio = cuestionario.getString("fecha_inicio");
                         String cant_preguntas = cuestionario.getString("cant_preguntas");

                        tarjeta.setBackgroundColor(Color.parseColor("#81D4FA"));
                        tarjeta.setText(todo);
                        contenedor_cuestionarios.addView(tarjeta);


                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) tarjeta.getLayoutParams();
                        layoutParams.setMargins(36,30,30,36);
                        tarjeta.setLayoutParams(layoutParams);

                        tarjeta.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent = new Intent(getApplicationContext(),ResumenCuestionario.class);
                                intent.putExtra("id",id_cuestionario);
                                intent.putExtra("fecha_inicio",fecha_inicio);
                                intent.putExtra("cant_preguntas",cant_preguntas);
                                startActivity(intent);
                                finish();
                            }
                        });
                    }

                } catch (JSONException e) {
                    System.out.println("El servidor POST cuestionarios responde con un error:");
                    System.out.println(e.getMessage());
                    System.out.println(e.toString());
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                System.out.println("El servidor POST responde con un error:");
                System.out.println(error.toString());
            }
        }) {
            @Override
            protected Map<String, String> getParams() {
                Map<String, String> params = new HashMap<>();
                params.put("id_usuario", id_usuario);
                return params;
            }
        };

        queue.add(solicitud);
    }

    public void newQuiz(View view) {
        Intent intent = new Intent(this, StartQuiz.class);
        startActivity(intent);
    }
    public  void cerrarSesion (View view){
        SharedPreferences archivo = getSharedPreferences("app-preguntas",MODE_PRIVATE);
        SharedPreferences.Editor editor = archivo.edit();
        editor.clear();
        editor.commit();
        Intent intencion = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intencion);
        finish();
    }
}