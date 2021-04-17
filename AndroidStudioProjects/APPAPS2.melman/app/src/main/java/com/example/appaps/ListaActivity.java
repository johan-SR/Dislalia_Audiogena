    package com.example.appaps;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.appaps.entidades.Estudiante;
import com.example.appaps.entidades.Proyectos;
import com.example.appaps.ui.ConexionHelper;
import com.example.appaps.ui.Utilidades;

import java.util.ArrayList;

    public class ListaActivity extends AppCompatActivity {

        private ListView lv1;
        ArrayList<String> ListaInformacion;
        ArrayList<Proyectos> listaproyectos;


        ConexionHelper conn1;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_lista);
            conn1 = new ConexionHelper(this, "bd_app", null, 1);

            lv1 = (ListView) findViewById(R.id.lv_pro);

            Consularproyectos();
            ArrayAdapter adapter = new ArrayAdapter(this, R.layout.lista_item, ListaInformacion);
            lv1.setAdapter(adapter);
            lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent intentmipro= new Intent(ListaActivity.this, MiproyectoActivity.class);
                    startActivity(intentmipro);
                    Intent intent = new Intent(getApplicationContext(), MiproyectoActivity.class);
                    intent.putExtra("idpro",(String)lv1.getItemAtPosition(position));
                    intent.putExtra("descpro", listaproyectos.get(position).getDescripcion());
                    startActivity(intent);
                }
            });
        }

        private void Consularproyectos(

        ) {
            SQLiteDatabase db = conn1.getReadableDatabase();
            Proyectos proyecto = null;
            listaproyectos = new ArrayList<Proyectos>();


            Cursor cursor = db.rawQuery("SELECT * FROM " + Utilidades.tablaProyecto, null);
            while (cursor.moveToNext()) {
                proyecto = new Proyectos();
                proyecto.setId(cursor.getInt(0));
                proyecto.setNombre(cursor.getString(1));
                proyecto.setDescripcion(cursor.getString(2));
                listaproyectos.add(proyecto);
            }


        obtenerLista();

    }

        private void obtenerLista() {
        ListaInformacion= new ArrayList<String>();
         for (Integer i=0; i<listaproyectos.size();i++){
             ListaInformacion.add(listaproyectos.get(i).getId()+") "+listaproyectos.get(i).getNombre());
         }
        }
    }

